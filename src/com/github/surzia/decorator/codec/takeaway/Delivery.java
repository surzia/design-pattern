package com.github.surzia.decorator.codec.takeaway;

public class Delivery extends Foods {

    protected Foods foods;
    protected int distance;
    protected double time;

    public Delivery(Foods foods, int distance, double time) {
        this.foods = foods;
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double getCost() {
        double distanceCost, timeCost;
        if (distance < 500) distanceCost = 0;
        else distanceCost = (distance - 500) * 0.04;
        if (time < 13 && time > 11) timeCost = 5;
        else timeCost = 0;
        return foods.getCost() + distanceCost + timeCost;
    }
}
