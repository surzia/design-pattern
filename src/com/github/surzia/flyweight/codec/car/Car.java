package com.github.surzia.flyweight.codec.car;

import java.awt.Color;

public class Car implements Vehicle {

    private final Engine engine;

    private final Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start() {
        System.out.println("汽车启动中...");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("汽车熄火");
        engine.stop();
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
