package com.github.surzia.facade.codec.shop;

public class Main {

    public static void main(String[] args) {
        Coca coca = new Coca(2, 3.0);
        Bread bread = new Bread(3, 4.5);
        System.out.println("结账中...");
        Settlement[] shopCart = new Settlement[]{coca, bread};
        Cashier cashier = new Cashier();
        System.out.println("总共消费" + cashier.getCost(shopCart) + "元");
    }
}
