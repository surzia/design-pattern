package com.github.surzia.decorator.codec.pizza;

public class Margherita extends Pizza {

    public Margherita() {
        description = "Margherita";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
