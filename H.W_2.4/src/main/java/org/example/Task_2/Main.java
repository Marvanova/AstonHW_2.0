package org.example.Task_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12, "pink", "black");
        Rectangle rectangle = new Rectangle(12,25,"blue","red");
        Triangle triangle = new Triangle(60, 25, 35, 6, "brown", "green");

        circle.displayInfo();
        rectangle.displayInfo();
        triangle.displayInfo();
    }
}
