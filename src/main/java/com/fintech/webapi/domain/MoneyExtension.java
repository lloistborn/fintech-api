package com.fintech.webapi.domain;

import java.util.Currency;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

@Extension
public class MoneyExtension {
    public static Currency GetCurrency(@This Money money) {
        return money.GetCurrency();
    }
}
