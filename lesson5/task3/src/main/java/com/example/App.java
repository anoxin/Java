package com.example;

/**
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

public class App {
    public static void main(String[] args) {

        int[] numbers = { 5, 3, 2, 8, 3, 9, 0, 6 };
        int count = numbers.length - 1;
        for (int i = count; i >= 0; i--) {
            if (i == 0 && count >= 0) {
                int temp = numbers[i];
                numbers[i] = numbers[count];
                numbers[count] = temp;
                count = count - 1;
                i = count;
            } else if (numbers[((i + 1) / 2) - 1] < numbers[i]) {
                int temp = numbers[i];
                numbers[i] = numbers[((i + 1) / 2) - 1];
                numbers[((i + 1) / 2) - 1] = temp;
            }

        }
        if (numbers[0] > numbers[1]) {
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
        for (int item : numbers) {
            System.out.format("%d ", item);
        }

    }
}
