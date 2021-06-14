package com.github.surzia.bridge.codec.shape;

public class Rectangle extends Shape {

    Rectangle(IShapeColor color) {
        super(color);
    }

    public void applyColor() {
        System.out.print("Rectangle filled with ");
        color.fillColor();
    }
}
