package com.fintech.webapi.features.investment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintech.webapi.domain.Money;
import com.fintech.webapi.features.BaseController;
import com.fintech.webapi.features.Response;
import com.fintech.webapi.middleware.PipelineBehaviour;

@RestController
public class InvestmentController extends BaseController {

    @Autowired
    private PipelineBehaviour pipeline;

    @SuppressWarnings("rawtypes")
    @GetMapping
    public Response Allocate() {
        Money money = new Money(0, 0, null);
        AllocateInvestment allocateInvestment = new AllocateInvestment(this.CustomerId(), money);
        return pipeline.send(allocateInvestment);
    }
}
