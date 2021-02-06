package com.github.surzia.factory.codec.coffee;

public class Test {

    static void print(Coffee[] coffee) {
        for (Coffee c : coffee) {
            System.out.println(c.getName());
        }
    }

    public static void main(String[] args) {
        CoffeeFactory chinaCoffeeFactory = new ChinaCoffeeFactory();
        Coffee[] chinaCoffees = chinaCoffeeFactory.create();
        System.out.println("中国咖啡工厂可以生产的咖啡有：");
        print(chinaCoffees);
        CoffeeFactory americaCoffeeFactory = new AmericaCoffeeFactory();
        Coffee[] americaCoffees = americaCoffeeFactory.create();
        System.out.println("美国咖啡工厂可以生产的咖啡有：");
        print(americaCoffees);
    }
}
