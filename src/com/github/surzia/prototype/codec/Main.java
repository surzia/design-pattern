package com.github.surzia.prototype.codec;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        ShapeStyle circleStyle = new ShapeStyle();
        circleStyle.setLineColor(Color.BLUE);
        circleStyle.setLinePattern(LinePattern.DOT);
        circleStyle.setLineThickness(1.1d);
        FillStyle circleFillStyle = new FillStyle();
        circleFillStyle.setFillColor(Color.YELLOW);
        circleFillStyle.setFillPattern(FillPattern.HEART);
        circle.setShapeStyle(circleStyle);
        circle.setFillStyle(circleFillStyle);

        System.out.println("Drawing original object");
        System.out.println("-------------------------------------------------------------------------");
        circle.draw();
        System.out.println("Making Deep Copy of original object");
        Circle deepCopyCircle = new Circle(circle);
        System.out.println("Making clone of original object");
        Circle deepCloneCircle = circle.clone();
        System.out.println("Drawing deep copy object");
        System.out.println("-------------------------------------------------------------------------");
        deepCopyCircle.draw();
        System.out.println("Drawing clone object");
        System.out.println("-------------------------------------------------------------------------");
        deepCloneCircle.draw();
        System.out.println("Modifying deep copy object");
        deepCopyCircle.setX(20);
        deepCopyCircle.getShapeStyle().setLineColor(Color.RED);
        deepCopyCircle.getFillStyle().setFillPattern(FillPattern.CHECKS);
        System.out.println("Modifying clone object");
        deepCloneCircle.setX(20);
        deepCloneCircle.getShapeStyle().setLineColor(Color.RED);
        deepCloneCircle.getFillStyle().setFillPattern(FillPattern.CHECKS);
        System.out.println("\n\nDrawing original object");
        System.out.println("-------------------------------------------------------------------------");
        circle.draw();
        System.out.println("Drawing deep copy object");
        System.out.println("-------------------------------------------------------------------------");
        deepCopyCircle.draw();
        System.out.println("Drawing clone object");
        System.out.println("-------------------------------------------------------------------------");
        deepCloneCircle.draw();
    }
}
