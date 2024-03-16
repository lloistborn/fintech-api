package com.fintech.webapi.features;

public interface RequestHandler<T, R> {
    public R handle(T request);
    public Class<T> getRequestType();
}
