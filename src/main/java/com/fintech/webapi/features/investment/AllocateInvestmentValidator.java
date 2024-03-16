package com.fintech.webapi.features.investment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fintech.webapi.features.FeatureValidator;

@Component
public class AllocateInvestmentValidator implements FeatureValidator<AllocateInvestment> {

    @Override
    public List<String> validate(AllocateInvestment request) {
        // do the validation here

        return new ArrayList<>();
    }

    @Override
    public Class<AllocateInvestment> getValidationType() {
        return AllocateInvestment.class;
    }    
}
