package com.github.surzia.flyweight.codec.car;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static final Map<Color, Vehicle> vehicleCache = new HashMap<>();

    public static Vehicle create(Color color) {
        return vehicleCache.computeIfAbsent(color, color1 -> {
            Engine newEngine = new Engine();
            return new Car(newEngine, color1);
        });
    }
}
