package com.github.surzia.prototype.codec;

public class ShapeStyle implements Cloneable {

    protected Color lineColor;
    protected LinePattern linePattern;
    protected double lineThickness;

    public ShapeStyle() {
        super();
    }

    @Override
    public ShapeStyle clone() throws CloneNotSupportedException {
        return (ShapeStyle) super.clone();
    }

    public ShapeStyle(ShapeStyle shapeStyle) {
        this();
        System.out.println("Deep Copying ShapeStyle");
        this.lineColor = shapeStyle.lineColor;
        this.linePattern = shapeStyle.linePattern;
        this.lineThickness = shapeStyle.lineThickness;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public LinePattern getLinePattern() {
        return linePattern;
    }

    public void setLinePattern(LinePattern linePattern) {
        this.linePattern = linePattern;
    }

    public double getLineThickness() {
        return lineThickness;
    }

    public void setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
    }

    @Override
    public String toString() {
        return "ShapeStyle{" +
                "lineColor=" + lineColor +
                ", linePattern=" + linePattern +
                ", lineThickness=" + lineThickness +
                '}';
    }
}
