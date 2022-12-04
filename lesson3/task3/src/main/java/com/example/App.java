package com.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
 * среднее арифметичское этого списка.
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 4, -2, 3, 7, 12, 10, 15, -5));

        int min = nums.get(0);
        int max = nums.get(0);
        double arithmeticMean = 0;

        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i)) < min) {
                min = nums.get(i);
            }
            if ((nums.get(i)) > max) {
                max = nums.get(i);
            }
            arithmeticMean += nums.get(i);
        }

        arithmeticMean /= nums.size();

        System.out.println(nums);
        System.out.format("min = %d \n", min);
        System.out.format("max = %d \n", max);
        System.out.println("Среднее арифметическое = " + arithmeticMean);

    }

}