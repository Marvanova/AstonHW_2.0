package org.example;
import java.util.Random;

public class Task_3 {
    public static void printColor() {
        Random random = new Random();
        int value = random.nextInt(200) - 50;
        System.out.println("value = " + value);
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
}
/* Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
если больше 100 (100 исключительно) - “Зеленый”;

 */
