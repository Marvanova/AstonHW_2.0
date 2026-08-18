package org.example;
import java.util.Random;
import java.util.Arrays;

public class Task_10 {
    public static void changeArray() {
        int length = 10;
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {arr[i] = 0;}
            else {arr[i] = 1;}
        }
        System.out.println("Преобразованный массив:");
        System.out.println(Arrays.toString(arr));

    }
}
