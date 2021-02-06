package com.github.surzia.factory.codec.car.basic.components;

public enum Fuel {
    GASOLINE("汽油"),
    DIESEL("柴油"),
    ENERGY("新能源");

    private final String name;

    Fuel(String fuel) {
        this.name = fuel;
    }

    public String getName() {
        return name;
    }
}
