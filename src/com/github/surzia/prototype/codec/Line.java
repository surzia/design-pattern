package com.github.surzia.prototype.codec;

public class Line extends Shape {

    protected int X1;
    protected int Y1;

    public Line() {
        super();
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        System.out.println("Cloning Line...");
        return (Line) super.clone();
    }

    public Line(Line line) {
        super(line);
        System.out.println("Deep Copying Line...");
        this.X1 = line.X1;
        this.Y1 = line.Y1;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Line (%s, %s).\n", super.toString(), this.toString());
    }

    @Override
    String type() {
        return "Line";
    }

    public int getX1() {
        return X1;
    }

    public void setX1(int x1) {
        X1 = x1;
    }

    public int getY1() {
        return Y1;
    }

    public void setY1(int y1) {
        Y1 = y1;
    }

    @Override
    public String toString() {
        return "Line{" +
                "X1=" + X1 +
                ", Y1=" + Y1 +
                '}';
    }
}
