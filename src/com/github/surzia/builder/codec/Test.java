package com.github.surzia.builder.codec;

public class Test {

    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        if (car != null) {
            System.out.println("Below car delivered: ");
            System.out.println("======================================================================");
            System.out.println(car);
            System.out.println("======================================================================");
        }
    }
}
