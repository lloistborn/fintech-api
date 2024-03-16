package com.fintech.webapi.features.investment;

import org.springframework.stereotype.Component;

import com.fintech.webapi.domain.Money;
import com.fintech.webapi.features.RequestHandler;
import com.fintech.webapi.features.Response;

public class AllocateInvestment {
    private int customerId;
    private Money money;

    public AllocateInvestment(int customerId, Money money) {
        this.money = money;
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Money getMoney() {
        return money;
    }
}

@Component
class AllocateInvestmentHandler 
    implements RequestHandler<AllocateInvestment, Response<Integer>> {

    public AllocateInvestmentHandler() {
    }

    @Override
    public Response<Integer> handle(AllocateInvestment request) {
        // call db to update data with request
        
        return new Response<Integer>(0);
    }

    @Override
    public Class<AllocateInvestment> getRequestType() {
        return AllocateInvestment.class;
    }

}