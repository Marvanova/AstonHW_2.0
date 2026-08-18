package org.example;
import java.util.Scanner;

public class Task_5 {
    public static void sumInRange() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        int sum = a + b;

        boolean result = (sum >= 10 && sum <= 20);

        System.out.println("Сумма чисел = " + sum);

        System.out.println("Результат: " + result);
    }
}