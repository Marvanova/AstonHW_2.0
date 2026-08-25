package org.example.Task_1;

public class Main {
    public static void main(String[] args) {
       Cat cat1 = new Cat("Кузя");
       Cat cat2 = new Cat("Барсик");
       Cat cat3 = new Cat("Мурка");
       Cat cat4 = new Cat("Тоша");
       Cat cat5 = new Cat("Дуся");
       Cat cat6 = new Cat("Лада");
       Cat cat7 = new Cat("Мурзик");
       Cat cat8 = new Cat("Рыжик");
       Cat cat9 = new Cat("Персик");
       Cat cat10 = new Cat("Кот");
       Cat cat11 = new Cat("Конфетка");


       Dog dog1 = new Dog("Мухтар");
       Dog dog2 = new Dog("Шарик");
       Dog dog3 = new Dog("Тузик");

       cat1.run(150);
       cat2.run(250);
       dog1.run(550);
       dog2.run(450);
       cat1.swim(150);
       dog1.swim(150);
       dog3.swim(9);

       Cat[] arr = new Cat[] {cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10, cat11};
       for (int i = 0; i < arr.length; i++) {
          arr[i].eat();
       }

       cat1.addFood(100);
    }
}