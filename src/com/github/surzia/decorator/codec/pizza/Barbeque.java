package com.github.surzia.decorator.codec.pizza;

public class Barbeque extends Pizza {

    protected Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.description + ", Barbeque";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }
}
