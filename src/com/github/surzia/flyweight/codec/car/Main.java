package com.github.surzia.flyweight.codec.car;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Vehicle blackVehicle1 = VehicleFactory.create(Color.BLACK);
        Vehicle blackVehicle2 = VehicleFactory.create(Color.BLACK);
        Vehicle blueVehicle = VehicleFactory.create(Color.BLUE);
        System.out.println(blackVehicle1 == blackVehicle2);
        System.out.println(blackVehicle1 == blueVehicle);
    }
}
