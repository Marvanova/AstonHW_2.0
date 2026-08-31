package org.example.Task_2;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phone) {

        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }

        phoneBook.get(surname).add(phone);
    }

    public void get(String surname) {

        if (phoneBook.containsKey(surname)) {
            System.out.println(phoneBook.get(surname));
        } else {
            System.out.println("Такой фамилии нет");
        }
    }
}
