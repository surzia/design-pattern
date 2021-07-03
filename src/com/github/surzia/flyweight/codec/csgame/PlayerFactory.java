package com.github.surzia.flyweight.codec.csgame;

import java.util.HashMap;

public class PlayerFactory {

    private static final HashMap<String, Player> map = new HashMap<>();

    public static Player getPlayer(String type) {
        Player player = null;

        if (map.containsKey(type)) {
            player = map.get(type);
        } else {
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }
            map.put(type, player);
        }

        return player;
    }
}
