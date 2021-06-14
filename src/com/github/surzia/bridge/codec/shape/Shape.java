package com.github.surzia.bridge.codec.shape;

public abstract class Shape {

    protected IShapeColor color;

    Shape(IShapeColor color) {
        this.color = color;
    }

    abstract public void applyColor();
}
