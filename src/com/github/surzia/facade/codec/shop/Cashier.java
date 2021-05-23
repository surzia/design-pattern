package com.github.surzia.facade.codec.shop;

public class Cashier {

    public double getCost(Settlement[] shopCart) {
        double cost = 0.0;
        for (Settlement good : shopCart) {
            cost += good.settleAccounts();
        }
        return cost;
    }
}
