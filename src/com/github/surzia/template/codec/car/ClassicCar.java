package com.github.surzia.template.codec.car;

public class ClassicCar extends CarTemplate {

    public ClassicCar() {
        super();
    }

    @Override
    protected void fixChassis() {
        System.out.println("Assembling chassis of the classical model");
        this.chassis = "Classic Chassis";
    }

    @Override
    protected void fixBody() {
        System.out.println("Assembling body of the classical model");
        this.body = "Classic Body";
    }

    @Override
    protected void paintCar() {
        System.out.println("Painting body of the classical model");
        this.paints = "Classic White Paint";
    }

    @Override
    protected void fixInterior() {
        System.out.println("Setting up interior of the classical model");
        this.interior = "Classic Interior";
    }
}
