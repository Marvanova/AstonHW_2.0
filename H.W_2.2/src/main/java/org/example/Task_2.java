package org.example;
import java.util.Random;

public class Task_2 {
    public static void checkSumSign() {
        Random random = new Random();
        int a = random.nextInt(11) - 5;
        int b = random.nextInt(11) - 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Сумма равна = " + (a + b));
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        }
        else
        {System.out.println("Сумма отрицательная");}
    }
}
