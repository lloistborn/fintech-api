package com.fintech.webapi.features;

public class Response<R> {
    private R result;
    private ValidationResult validationResult;

    public Response(R result) {
        this.result = result;
        this.validationResult = null;
    }

    public Response(ValidationResult validationResult) {
        this.result = null;
        this.validationResult = validationResult;
    }

    public R getResult() {
        return result;
    }

    public ValidationResult getValidationResult() {
        return validationResult;
    }
}
