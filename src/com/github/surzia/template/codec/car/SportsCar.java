package com.github.surzia.template.codec.car;

public class SportsCar extends CarTemplate {

    public SportsCar() {
        super();
    }

    @Override
    protected void fixChassis() {
        System.out.println("Assembling chassis of the sports model");
        this.chassis = "Sporty Chassis";
    }

    @Override
    protected void fixBody() {
        System.out.println("Assembling body of the sports model");
        this.body = "Sporty Body";
    }

    @Override
    protected void paintCar() {
        System.out.println("Painting body of the sports model");
        this.paints = "Sporty Torch Red Paint";
    }

    @Override
    protected void fixInterior() {
        System.out.println("Setting up interior of the sports model");
        this.interior = "Sporty Interior";
    }
}
