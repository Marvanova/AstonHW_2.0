package org.example.Task_2;

public class Triangle implements Geometric_shapes{
    private double base;
    private double side1;
    private double side2;
    private double height;
    private String fillColor;
    private String borderColor;
    public Triangle(double base, double side1, double side2, double height, String fillColor, String borderColor) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return base+side1+side2;
    }
    @Override
    public double getArea () {
        return base * height/2;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
