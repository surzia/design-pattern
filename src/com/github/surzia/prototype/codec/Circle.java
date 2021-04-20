package com.github.surzia.prototype.codec;

public class Circle extends Shape {

    protected int radius;
    protected FillStyle fillStyle;

    public Circle() {
        super();
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        System.out.println("Cloning Circle...");
        Circle circle = (Circle) super.clone();
        circle.fillStyle = fillStyle.clone();
        return circle;
    }

    public Circle(Circle circle) {
        super(circle);
        System.out.println("Deep Copying Circle...");
        this.radius = circle.radius;
        this.fillStyle = new FillStyle(circle.fillStyle);
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Circle (%s, %s).\n", super.toString(), this.toString());
    }

    @Override
    String type() {
        return "Circle";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public FillStyle getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(FillStyle fillStyle) {
        this.fillStyle = fillStyle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", fillStyle=" + fillStyle +
                '}';
    }
}
