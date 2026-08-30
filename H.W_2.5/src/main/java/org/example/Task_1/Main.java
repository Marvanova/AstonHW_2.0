package org.example.Task_1;
public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","$"},
        };

        try {
            int result = Task.checkArray(array);
            System.out.println("Сумма элементов массива: " + result);

        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }
    }
}