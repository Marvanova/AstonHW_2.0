package org.example;

public class Task_14 {
    public static int[] twoArgsArray(int len, int initialValue) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }
}