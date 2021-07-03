package com.github.surzia.flyweight.codec.csgame;

import java.util.Random;

public class Main {

    private static final String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static final String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandPlayerType());
            player.assignWeapon(getRandWeapon());
            player.mission();
        }
    }

    private static String getRandPlayerType() {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }

    public static String getRandWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weapons.length);
        return weapons[randInt];
    }
}
