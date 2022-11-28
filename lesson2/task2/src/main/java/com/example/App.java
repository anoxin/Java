package com.example;

import java.io.IOException;
import java.util.logging.*;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после
 * каждой итерации запишите в лог-файл
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(App.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormater = new SimpleFormatter();
        fh.setFormatter(sFormater);

        logger.info("Начало программы");

        int[] array = { 1, 5, 3, 9, 4, 5 };
        int max = array[0];
        int length = array.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (i != array.length - 1 && array[i] > array[i + 1]) {
                logger.info(
                        array[i] + " поменяли местами с "
                                + array[i + 1]);
                max = array[i];
                array[i] = array[i + 1];
                array[i + 1] = max;
                count++;
            }

            if (i != 0 && i == length - 1 && count > 0) {
                count = 0;
                i = 0;
            }

        }
        logger.info("Конец программы");

        for (int item : array) {
            System.out.format("%d ", item);
        }
    }
}
