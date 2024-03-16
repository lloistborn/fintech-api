package com.fintech.webapi.middleware;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fintech.webapi.features.FeatureValidator;
import com.fintech.webapi.features.RequestHandler;

@Component
public class PipelineBehaviour {
    
    private final Map<Class<?>, RequestHandler<?, ?>> handlers = new HashMap<>();
    private final Map<Class<?>, FeatureValidator<?>> validators = new HashMap<>();

    @Autowired
    public PipelineBehaviour(RequestHandler<?, ?>[] handlerList, FeatureValidator<?>[] validatorList) {
        
        for (RequestHandler<?, ?> handler : handlerList) {
            handlers.put(handler.getRequestType(), handler);
        }

        for (FeatureValidator<?> validator : validatorList) {
            validators.put(validator.getValidationType(), validator);
        }
    }

    public <T, R> R send(T request) {
        
        @SuppressWarnings("unchecked")
        RequestHandler<T, R> handler = (RequestHandler<T, R>) handlers.get(request.getClass());

        if (handler == null) {
            throw new IllegalArgumentException("No handler registered for request of type " + request.getClass());
        }

        @SuppressWarnings("unchecked")
        FeatureValidator<T> validator = (FeatureValidator<T>) validators.get(request.getClass());

        List<String> errors = validator.validate(request);
        if (validator != null && !errors.isEmpty()) {
            throw new ValidationException("Validation error", errors);
        }

        return handler.handle(request);
    }
}
