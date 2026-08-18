package org.example;
import java.util.Arrays;

public class Task_11 {
    public static void fillAnArray() {
        int length = 100;
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        System.out.println(Arrays.toString(arr));

    }
}