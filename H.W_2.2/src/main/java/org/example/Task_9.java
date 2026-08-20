package org.example;

public class Task_9 {
    public static boolean checkYear(){
        int year=2024;
        return year % 4 == 0 && year % 1000 != 100;
    }
}