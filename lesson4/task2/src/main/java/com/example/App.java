package com.example;

import java.util.LinkedList;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый
 * элемент из очереди и удаляет его, first() - возвращает первый элемент из
 * очереди, не удаляя.
 *
 */
public class App {
    public static void main(String[] args) {
        int[] newArray = { 2, 3, 4, 6, 6, 7, 8 };
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer item : newArray) {
            linkedList.add(item);
        }

        System.out.println(linkedList);

        enqueue(linkedList, 3);

        System.out.println(linkedList);

        System.out.println(dequeue(linkedList));

        System.out.println(linkedList);

        System.out.println(first(linkedList));

        System.out.println(linkedList);
    }

    private static int first(LinkedList<Integer> linkedList) {
        int num = linkedList.get(0);
        return num;
    }

    private static int dequeue(LinkedList<Integer> linkedList) {
        int num = linkedList.get(0);
        linkedList.remove(0);
        return num;
    }

    private static void enqueue(LinkedList<Integer> linkedList, int i) {
        linkedList.addLast(i);
    }
}
