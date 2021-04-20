package com.github.surzia.prototype.codec;

public class FillStyle implements Cloneable {

    protected Color fillColor;
    protected FillPattern fillPattern;

    public FillStyle() {
        super();
    }

    @Override
    public FillStyle clone() throws CloneNotSupportedException {
        return (FillStyle) super.clone();
    }

    public FillStyle(FillStyle fillStyle) {
        super();
        System.out.println("Deep Copying FillStyle...");
        this.fillColor = fillStyle.fillColor;
        this.fillPattern = fillStyle.fillPattern;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public FillPattern getFillPattern() {
        return fillPattern;
    }

    public void setFillPattern(FillPattern fillPattern) {
        this.fillPattern = fillPattern;
    }

    @Override
    public String toString() {
        return "FillStyle{" +
                "fillColor=" + fillColor +
                ", fillPattern=" + fillPattern +
                '}';
    }
}
