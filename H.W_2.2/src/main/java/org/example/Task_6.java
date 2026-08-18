package org.example;
import java.util.Scanner;

public class Task_6 {
    public static void printPositiveOrNegative() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число (a): ");
        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("Положительное число : " + a);
        }
        else {
            System.out.println("Отрицательное число : " + a);
        }
    }
}