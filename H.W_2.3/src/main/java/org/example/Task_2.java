package org.example;

public class Task_2 {
    public static void createArray() {

    Product[] productsArray = new Product[5];

    productsArray[0] = new Product("Футболка", "01.02.2025","Zara", "China", 55.99, true);

    productsArray[1] = new Product("Рубашка","12.12.2025","H&M","Turkey",62.30,false);

    productsArray[2] = new Product("Брюки","12.02.2025","Bershka","Turkey",80.60,true);

    productsArray[3] = new Product("Шорты","25.06.2025","H&M","Turkey",56.30,true);

    productsArray[4] = new Product("Кепка","15.01.2026","Zara", "China", 36.90,false);
    }
}
