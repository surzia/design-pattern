package com.github.surzia.factory.codec.shape;

public class ShapeFactory {

    public Shape getShape(String type) {
        switch (type) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
