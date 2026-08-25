package org.example.Task_1;

public class Cat extends Animal {
    static int catCount = 0;
    boolean fullness;

    public Cat(String name) {
        super(name);
        fullness = false;
        catCount++;
    }

    static int food = 100;
    public boolean eat() {
        if ((food-10) >= 0) {
            food = food - 10;
            fullness = true;
            System.out.println(name + " " +fullness);
            return fullness;
        } else {
            System.out.println(name + " " +fullness);
            return fullness;
        }
    }

    public void addFood(int value) {
        if (food+value <= 100) {
            food += value;
        }
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            super.run(length);
        }
        else {
            System.out.println("Кот столько не пробежит");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}
