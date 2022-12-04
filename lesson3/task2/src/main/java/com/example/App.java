package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 *
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 11; i++) {
            list.add(random.nextInt(101));
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (((Integer) list.get(i)) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);

    }
}
