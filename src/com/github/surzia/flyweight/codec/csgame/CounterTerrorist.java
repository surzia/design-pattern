package com.github.surzia.flyweight.codec.csgame;

// CounterTerrorist must have weapon and mission
public class CounterTerrorist implements Player {

    private final String TASK;
    private String weapon;

    public CounterTerrorist() {
        TASK = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}
