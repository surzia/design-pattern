package com.github.surzia.prototype.codec;

public class Rectangle extends Shape {

    protected int length;
    protected int width;
    protected FillStyle fillStyle;

    public Rectangle() {
        super();
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        System.out.println("Cloning Rectangle...");
        Rectangle rectangle = (Rectangle) super.clone();
        rectangle.fillStyle = fillStyle.clone();
        return rectangle;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        System.out.println("Deep Copying Rectangle...");
        this.length = rectangle.length;
        this.width = rectangle.width;
        this.fillStyle = rectangle.fillStyle;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Rectangle (%s, %s).\n", super.toString(), this.toString());
    }

    @Override
    String type() {
        return "Rectangle";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public FillStyle getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(FillStyle fillStyle) {
        this.fillStyle = fillStyle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", fillStyle=" + fillStyle +
                '}';
    }
}
