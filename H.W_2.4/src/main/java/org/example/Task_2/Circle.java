package org.example.Task_2;

public class Circle implements Geometric_shapes{
    private double radius;
    private String fillColor;
    private String borderColor;
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String getFillColor() {
        return fillColor;
    }
    public String getBorderColor() {
        return borderColor;
    }
}
