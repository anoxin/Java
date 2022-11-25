package com.example;

/**
 * Вывести все простые числа от 1 до 1000
 *
 */
public class App {
    public static void main(String[] args) {
        int num = 1000;
        boolean primeNumber = true;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                }
            }
            if (primeNumber) {
                System.out.format("%d ", i);
            }
            primeNumber = true;
        }

    }
}
