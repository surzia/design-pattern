package com.github.surzia.decorator.codec.shape;

public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle style;

    public LineStyleDecorator(Shape decoratedShape, LineStyle style) {
        super(decoratedShape);
        this.style = style;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line Style: " + style);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + style + " lines.";
    }

    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}
