package com.github.surzia.bridge.codec.shape;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Rectangle(new ColorRedImpl());
        Shape s2 = new Rectangle(new ColorBlueImpl());
        Shape s3 = new Rectangle(new ColorGreenImpl());

        s1.applyColor();
        s2.applyColor();
        s3.applyColor();

        Shape s4 = new Circle(new ColorRedImpl());
        Shape s5 = new Circle(new ColorBlueImpl());
        Shape s6 = new Circle(new ColorGreenImpl());

        s4.applyColor();
        s5.applyColor();
        s6.applyColor();
    }
}
