package org.example;
import java.util.Random;

public class Task_4 {
    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt(5);
        int b = random.nextInt(5);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
/* Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
в противном случае “a < b”

 */
