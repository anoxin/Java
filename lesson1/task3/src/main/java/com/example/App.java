package com.example;

import java.util.Scanner;

/**
 * Реализовать простой калькулятор
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Введите число a: ");
        Scanner scannerA = new Scanner(System.in, "utf8");
        int a = Integer.parseInt(scannerA.nextLine());
        System.out.println("Введите действие(+ - * /): ");
        Scanner scannerAction = new Scanner(System.in, "utf8");
        char action = scannerAction.nextLine().charAt(0);
        System.out.println("Введите число b: ");
        Scanner scannerB = new Scanner(System.in, "utf8");
        int b = Integer.parseInt(scannerB.nextLine());
        scannerA.close();
        scannerAction.close();
        scannerB.close();
        int result = 0;

        if (action == "-".charAt(0)) {
            result = a - b;
        }
        if (action == "+".charAt(0)) {
            result = a + b;
        }
        if (action == "*".charAt(0)) {
            result = a * b;
        }
        if (action == "/".charAt(0)) {
            result = a / b;
        }
        System.out.println(a + " " + action + " " + b + " = " + result);

    }
}
