package com.fintech.webapi.features;

import java.util.List;

public interface FeatureValidator<T> {
    public List<String> validate(T request);
    public Class<T> getValidationType();
}
