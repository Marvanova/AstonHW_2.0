package org.example;
import java.util.Scanner;

public class Task_8 {
    public static void printStringTimes() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число (a): ");
        int a = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Введите строку (str): ");
        String str = scanner.nextLine();

        System.out.println("Количество раз = " + a);

        System.out.println("Строка: " + str);
    }
}