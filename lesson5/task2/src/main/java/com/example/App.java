package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать
 * программу, которая найдет и выведет повторяющиеся имена с количеством
 * повторений. Отсортировать по убыванию популярности.
 *
 */
public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> personCount = new HashMap<>();
        list.addAll(Arrays.asList("Антон", "Антон", "Иван", "Андрей", "Антон", "Иван", "Андрей", "Денис"));

        for (String item : list) {

            if (personCount.containsKey(item)) {
                personCount.put(item, personCount.get(item) + 1);
            } else {
                personCount.put(item, 1);
            }
        }
        System.out.println(personCount);

    }

}
