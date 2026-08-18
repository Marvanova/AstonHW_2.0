package org.example;
import java.util.Scanner;

public class Task_7 {
    public static void printPositiveOrNegative2(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число (a): ");
        int a = scanner.nextInt();

        boolean result1 = (a >= 0);

        if (a >= 0) {
            System.out.println("Положительное число : " + a);
        }
        else {
            System.out.println("Отрицательное число : " + a);
        }
    }
}