package org.example;

public class Task_10 {
    public static void changeArray() {
        int[] arr = {1,1,0,0,1,0};

        for (int i = 0; i < 6; i++) {
            if (arr[i] == 1) {arr[i] = 0;}
            else {arr[i] = 1;}
        }

    }
}
