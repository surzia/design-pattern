package com.github.surzia.prototype.codec;

public abstract class Shape implements Cloneable {

    protected int x;
    protected int y;
    protected ShapeStyle shapeStyle;

    public Shape() {
        super();
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Shape shape = (Shape) super.clone();
        shape.shapeStyle = shapeStyle.clone();
        return shape;
    }

    public Shape(Shape shape) {
        this();
        System.out.println("Deep Copying Shape...");
        this.x = shape.x;
        this.y = shape.y;
        this.shapeStyle = new ShapeStyle(shape.shapeStyle);
    }

    abstract void draw();

    abstract String type();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ShapeStyle getShapeStyle() {
        return shapeStyle;
    }

    public void setShapeStyle(ShapeStyle shapeStyle) {
        this.shapeStyle = shapeStyle;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", shapeStyle=" + shapeStyle +
                '}';
    }
}
