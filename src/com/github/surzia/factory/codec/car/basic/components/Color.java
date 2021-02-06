package com.github.surzia.factory.codec.car.basic.components;

public enum Color {
    BLACK("黑色"),
    BLUE("蓝色"),
    GREEN("绿色"),
    RED("红色"),
    WHITE("白色"),
    YELLOW("黄色");

    private final String name;

    Color(String color) {
        this.name = color;
    }

    public String getName() {
        return name;
    }
}
