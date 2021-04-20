package com.github.surzia.prototype.codec;

public class Triangle extends Shape {

    protected int sideA;
    protected int sideB;
    protected int sideC;
    protected FillStyle fillStyle;

    public Triangle() {
        super();
    }

    @Override
    public Triangle clone() throws CloneNotSupportedException {
        System.out.println("Cloning Triangle...");
        Triangle triangle = (Triangle) super.clone();
        triangle.fillStyle = fillStyle.clone();
        return triangle;
    }

    public Triangle(Triangle triangle) {
        super(triangle);
        System.out.println("Deep Copying Triangle...");
        this.sideA = triangle.sideA;
        this.sideB = triangle.sideB;
        this.sideC = triangle.sideC;
        this.fillStyle = triangle.fillStyle;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Triangle (%s, %s).\n", super.toString(), this.toString());
    }

    @Override
    String type() {
        return "Triangle";
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public FillStyle getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(FillStyle fillStyle) {
        this.fillStyle = fillStyle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", fillStyle=" + fillStyle +
                '}';
    }
}
