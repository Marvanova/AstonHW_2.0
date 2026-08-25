package org.example.Task_2;

public class Rectangle implements Geometric_shapes{
    private double width;
    private double length;
    private String fillColor;
    private String borderColor;
    public Rectangle(double width, double length, String fillColor, String borderColor) {
        this.width = width;
        this.length = length;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public double getPerimeter() {
        return (width + length)*2;
    }
    public double getArea() {
        return width * length;
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
