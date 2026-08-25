package org.example.Task_1;

public class Animal {
    String name;
    static int animalCount=0;
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int length) {
        System.out.println(name + " пробежал " + length + " м");
    }

    public void swim(int length) {
        System.out.println(name + " проплыл " + length + " м");
    }
}
