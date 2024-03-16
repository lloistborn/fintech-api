package com.fintech.webapi.domain;

import java.util.Currency;

public class Money {
    
    private int bigAmount;
    private int smallAmount;
    private Currency currency;

    public Money(int bigAmount, int smallAmount, Currency currency) {
        this.bigAmount = bigAmount;
        this.smallAmount = smallAmount;
        this.currency = currency;
    }

    public int GetBigAmount() {
        return bigAmount;
    }

    public int GetSmallAmount() {
        return smallAmount;
    }

    public Currency GetCurrency() {
        return currency;
    }
}
