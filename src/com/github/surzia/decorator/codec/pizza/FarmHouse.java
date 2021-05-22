package com.github.surzia.decorator.codec.pizza;

public class FarmHouse extends Pizza {

    public FarmHouse() {
        description = "FarmHouse";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
