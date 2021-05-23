package com.github.surzia.facade.codec.shop;

public class Coca implements Settlement {

    private final int count;
    private final double price;

    public Coca(int count, double price) {
        this.count = count;
        this.price = price;
    }

    @Override
    public double settleAccounts() {
        return count * price;
    }
}
