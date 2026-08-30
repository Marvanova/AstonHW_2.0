package org.example.Task_2;

public class Main {
    public static void main(String[] args) {

        try {
            Task.generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e);
        }
    }
}
