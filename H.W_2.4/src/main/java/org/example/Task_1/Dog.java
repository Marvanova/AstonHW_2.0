package org.example.Task_1;

public class Dog extends Animal {
    static int dogCount=0;
    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int length) {
        if (length<= 500)
        super.run(length);
        else {
            System.out.println("Собака столько не пробежит");
        }
    }

    @Override
    public void swim(int length) {
        if (length<= 10)
        super.swim(length);
        else {
            System.out.println("Собака столько не проплывет");
        }
    }
}
