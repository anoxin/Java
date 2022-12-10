package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один
 * человек может иметь несколько телефонов.
 * 
 *
 */
public class App {
    public static void main(String[] args) {
        Map<String, List<Integer>> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", new ArrayList<Integer>());
        phoneBook.get("Иванов").addAll(Arrays.asList(13233, 66653, 25432, 3453443));
        phoneBook.put("Петров", new ArrayList<Integer>());
        phoneBook.get("Петров").addAll(Arrays.asList(999733, 38849, 4545, 454334));
        phoneBook.put("Сидоров", new ArrayList<Integer>());
        phoneBook.get("Сидоров").addAll(Arrays.asList(23233, 334343, 23334235, 344344));
        System.out.println(phoneBook);
    }

}
