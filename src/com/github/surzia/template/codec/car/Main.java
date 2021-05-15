package com.github.surzia.template.codec.car;

public class Main {

    public static void main(String[] args) {
        CarTemplate classicCar = new ClassicCar();
        classicCar.manufactureCar();
        System.out.println("Below classic car delivered: ");
        System.out.println("======================================================================");
        System.out.println(classicCar);
        System.out.println("======================================================================");
        CarTemplate modernCar = new ModernCar();
        modernCar.manufactureCar();
        System.out.println("Below modern car delivered: ");
        System.out.println("======================================================================");
        System.out.println(modernCar);
        System.out.println("======================================================================");
        CarTemplate sportsCar = new SportsCar();
        sportsCar.manufactureCar();
        System.out.println("Below sports car delivered: ");
        System.out.println("======================================================================");
        System.out.println(sportsCar);
        System.out.println("======================================================================");
    }
}
