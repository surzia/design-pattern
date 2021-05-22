package com.github.surzia.decorator.codec.takeaway;

public class Discount extends Foods {

    protected Foods foods;

    public Discount(Foods foods) {
        this.foods = foods;
    }

    @Override
    public double getCost() {
        double discount = 1;
        if (foods.hasDiscount) discount = 0.8;
        return foods.getCost() * discount;
    }
}
