package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Task_14 {
    public static void twoArgsArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" len: ");
        int len = scanner.nextInt();

        System.out.print(" initialValue: ");
        int initialValue = scanner.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }

        System.out.println(Arrays.toString(arr));

    }
}