package org.example;
import  java.util.Random;

public class Task_13 {
    public static void createArray() {

        Random rand = new Random();
        int count = rand.nextInt(10);

        int [][] arr = new int[count][count];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                    arr[arr.length-1-i][j] = 1;
                    arr[i][arr.length-1-j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}