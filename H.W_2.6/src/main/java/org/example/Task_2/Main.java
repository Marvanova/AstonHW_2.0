package org.example.Task_2;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ахмадуллина", "4-75-80");
        phoneBook.add("Ахтариева", "4-55-63");

        phoneBook.add("Кудрявцева", "4-46-16");
        phoneBook.add("Ахмадуллина", "3-10-72");

        phoneBook.get("Ахмадуллина");
        phoneBook.get("Ахтариева");
    }
}
