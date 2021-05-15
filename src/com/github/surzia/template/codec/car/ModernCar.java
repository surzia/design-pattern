package com.github.surzia.template.codec.car;

public class ModernCar extends CarTemplate {

    public ModernCar() {
        super();
    }

    @Override
    protected void fixChassis() {
        System.out.println("Assembling chassis of the Modern model");
        this.chassis = "Modern Chassis";
    }

    @Override
    protected void fixBody() {
        System.out.println("Assembling body of the Modern model");
        this.body = "Modern Body";
    }

    @Override
    protected void paintCar() {
        System.out.println("Painting body of the Modern model");
        this.paints = "Modern Black Paint";
    }

    @Override
    protected void fixInterior() {
        System.out.println("Setting up interior of the Modern model");
        this.interior = "Modern Interior";
    }
}
