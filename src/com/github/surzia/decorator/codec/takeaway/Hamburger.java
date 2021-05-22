package com.github.surzia.decorator.codec.takeaway;

public class Hamburger extends Foods {

    private double price = 30.0;

    @Override
    public double getCost() {
        return price;
    }
}
