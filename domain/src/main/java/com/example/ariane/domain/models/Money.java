package com.example.ariane.domain.models;

import com.example.ariane.domain.mappings.Currency;

public class Money {

    private final double price;

    private final Currency currency;

    public Money(double price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }
}
