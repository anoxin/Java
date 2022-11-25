package com.example;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in, "cp866");
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= num; i++) {
            sum += i;
            mult *= i;
        }
        System.out.println("Сумма чисел от 1 до " + num + ") равно " + sum + "!");
        System.out.println("Произведение чисел от 1 до " + num + ") равно " + mult + "!");

        scanner.close();
    }
}