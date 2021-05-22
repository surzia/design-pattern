package com.github.surzia.decorator.codec.takeaway;

public class Main {

    public static void main(String[] args) {
        Foods hamburger = new Hamburger();
        System.out.println("外卖原价: " + hamburger.getCost());
        hamburger = new Delivery(hamburger, 600, 12.5);
        System.out.println("加上配送费: " + hamburger.getCost());
        hamburger.hasDiscount = true;
        hamburger = new Discount(hamburger);
        System.out.println("打折之后: " + hamburger.getCost());
    }
}
