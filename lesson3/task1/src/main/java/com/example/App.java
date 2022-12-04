package com.example;

/**
 * Реализовать алгоритм сортировки слиянием.
 * 
 *
 */
public class App {
    public static void main(String[] args) {

        int[] array = { 1, 4, 5, 3, 2, 5, 2 };

        StringBuffer str = new StringBuffer();
        int count = 1;

        for (int i = 0; i < array.length; i += 2) {
            // System.out.println(i);
            if (i != array.length - 1) {
                if (array[i] > array[i + 1]) {
                    str.append(array[i + 1]);
                    str.append(" ");
                    str.append(array[i]);
                    str.append(" ");
                } else {
                    str.append(array[i]);
                    str.append(" ");
                    str.append(array[i + 1]);
                    str.append(" ");
                }

            } else {
                str.append(array[i]);
            }

            if (i == array.length - 1 || i + 1 == array.length - 1) {

                for (int j = 0; j < array.length; j++) {
                    array[j] = Integer.parseInt(str.toString().split(" ")[j]);
                }

                count++;
                if (count % 2 == 0) {
                    i = -1;
                    str.delete(1, str.length());
                    str.append(" ");

                } else {
                    i = -2;
                    str.delete(0, str.length());
                }

                if (count == array.length) {
                    i = array.length;
                }

            }

        }

        for (int item : array) {
            System.out.format("%d ", item);
        }

    }

}
