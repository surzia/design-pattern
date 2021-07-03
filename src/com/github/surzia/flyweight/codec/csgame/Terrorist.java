package com.github.surzia.flyweight.codec.csgame;

// Terrorist must have weapon and mission
public class Terrorist implements Player {

    private final String TASK;
    private String weapon;

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}
