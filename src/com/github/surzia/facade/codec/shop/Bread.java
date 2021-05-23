package com.github.surzia.facade.codec.shop;

public class Bread implements Settlement {

    private final int count;
    private final double price;

    public Bread(int count, double price) {
        this.count = count;
        this.price = price;
    }

    @Override
    public double settleAccounts() {
        return count * price;
    }
}
