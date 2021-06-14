package com.github.surzia.bridge.codec.shape;

public class Circle extends Shape {

    Circle(IShapeColor color) {
        super(color);
    }

    public void applyColor() {
        System.out.print("Circle filled with ");
        color.fillColor();
    }
}
