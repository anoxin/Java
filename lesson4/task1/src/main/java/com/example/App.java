package com.example;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернет “перевернутый” список.
 * 
 *
 */
public class App {
    public static void main(String[] args) {

        int[] newArray = { 2, 3, 4, 6, 6, 7, 8 };
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> newList = new LinkedList<>();

        for (Integer item : newArray) {
            linkedList.add(item);
        }

        System.out.println(linkedList.descendingIterator());
        Iterator<Integer> x = linkedList.descendingIterator();

        while (x.hasNext()) {
            newList.add(x.next());
        }

        System.out.println(linkedList);
        System.out.println(newList);

    }

}
