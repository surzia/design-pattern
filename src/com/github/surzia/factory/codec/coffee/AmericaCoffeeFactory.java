package com.github.surzia.factory.codec.coffee;

public class AmericaCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee[] create() {
        return new Coffee[]{new Americano(), new Latte()};
    }
}
