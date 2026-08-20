package org.example;

public class Task_13 {
    public static void createArray() {

        int [][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                    arr[arr.length-1-i][j] = 1;
                    arr[i][arr.length-1-j] = 1;
                }
            }
        }
    }
}