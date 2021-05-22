package com.github.surzia.decorator.codec.pizza;

public class Main {

    public static void main(String[] args) {
        Pizza margherita = new Margherita();
        System.out.println(margherita.getDescription() + " Cost :" + margherita.getCost());

        Pizza farmHouse = new FarmHouse();
        farmHouse = new Barbeque(farmHouse);
        System.out.println(farmHouse.getDescription() + " Cost :" + farmHouse.getCost());
    }
}
