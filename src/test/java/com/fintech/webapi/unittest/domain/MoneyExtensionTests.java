package com.fintech.webapi.unittest.domain;

import java.util.Currency;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.fintech.webapi.domain.Money;

public class MoneyExtensionTests {
    
    @Test
    public void GetCurrenyBasedOnLocale() {
        Money money = new Money(10, 01, Currency.getInstance("USD"));

        String curr = money.GetCurrency().getCurrencyCode();
        Assert.assertTrue(curr == "USD");
    }
}
