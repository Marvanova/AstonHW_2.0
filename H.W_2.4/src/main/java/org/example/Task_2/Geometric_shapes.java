package org.example.Task_2;

public interface Geometric_shapes {
    double getArea();
    double getPerimeter();
    String getFillColor();
    String getBorderColor();

    default void displayInfo() {
        System.out.println("[" + getPerimeter() + ", " + getArea() + ", " + getFillColor() + ", " + getBorderColor() + "]");
    }
}
