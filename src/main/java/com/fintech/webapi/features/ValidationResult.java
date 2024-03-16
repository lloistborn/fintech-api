package com.fintech.webapi.features;

import java.util.List;

public class ValidationResult {
    
    private final List<String> errors;

    public ValidationResult(List<String> errors) {
        this.errors = errors;    
    }

    public static ValidationResult success() {
        return new ValidationResult(null);
    }

    public static ValidationResult failure(List<String> errors) {
        return new ValidationResult(errors);
    }

    public boolean isSuccess() {
        return errors == null || errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }
}
