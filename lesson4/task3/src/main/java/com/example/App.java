package com.example;

import java.util.Scanner;
import java.util.Stack;

/**
 * Напишите постфиксный калькулятор. Пользователь вводит данные и операции в
 * обратной польской записи. Калькулятор вычисляет результат и проверяет, что в
 * стэке получилось единственное число.
 * Например:
 * 5 4 3 - + => 5 1 + => 6
 */

public class App {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите уравнение типа (5 4 3 - + )");
        String input = scaner.nextLine();
        Stack<Integer> calc = new Stack<Integer>();
        String newArray[] = input.split(" ");
        scaner.close();

        for (int i = 0; i < newArray.length; i++) {

            int x = 0;
            int y = 0;
            if (newArray[i].equals("-")) {
                y = calc.pop();
                x = calc.pop();
                calc.push(x - y);

            } else if (newArray[i].equals("+")) {
                y = calc.pop();
                x = calc.pop();
                calc.push((x + y));

            } else if (newArray[i].equals("*")) {
                y = calc.pop();
                x = calc.pop();
                calc.push(x * y);

            } else if (newArray[i].equals("/")) {
                y = calc.pop();
                x = calc.pop();
                calc.push(x / y);

            } else {
                calc.push(Integer.parseInt(newArray[i]));
            }

        }
        if (calc.size() > 1) {
            System.out.println("Неправильный ввод");
        } else {
            System.out.println(calc.get(0));
        }

    }

}