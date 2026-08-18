package org.example;
import java.util.Scanner;

public class Task_9 {
    public static void checkYear(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean result = (year % 4 == 0) && (year % 1000 != 100);

        System.out.println(result);
    }
}