package com.github.surzia.factory.codec.coffee;

public class ChinaCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee[] create() {
        return new Coffee[]{new Cappuccino(), new Latte()};
    }
}
