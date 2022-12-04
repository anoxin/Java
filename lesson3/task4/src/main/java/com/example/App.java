package com.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Даны два ArrayList из целых чисел. Написать функции, которые вычисляют
 * разницу коллекций:
 * 
 * Разность:
 * A - B = все числа из первой коллекции, которые не содержатся во второй
 * коллекции
 * B - A = все числа из второй коллекции, которые не содержатся в первой
 * 
 * Симметрическая разность:
 * A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из
 * второй, которых нет в первой
 *
 */

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 4, -2, 3, 7, 12, 10, 15, -5));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(-3, 0, -2, 6, 7, 11, 10, 19, -5));
        ArrayList<Integer> numsResult1 = new ArrayList<>();
        ArrayList<Integer> numsResult2 = new ArrayList<>();
        ArrayList<Integer> numsResult3 = new ArrayList<>();

        for (int i = 0; i < nums1.size(); i++) {
            boolean result = true;

            for (int j = 0; j < nums2.size(); j++) {

                if ((nums1.get(i)) == (nums2.get(j))) {
                    result = false;
                }
            }
            if (result) {
                numsResult1.add(nums1.get(i));
            }

        }

        for (int i = 0; i < nums2.size(); i++) {
            boolean result = true;

            for (int j = 0; j < nums1.size(); j++) {

                if ((nums1.get(i)) == (nums2.get(j))) {
                    result = false;
                }
            }
            if (result) {
                numsResult2.add(nums2.get(i));
            }

        }

        numsResult3.addAll(numsResult1);
        numsResult3.addAll(numsResult2);

        System.out.println("A - B = " + numsResult1);
        System.out.println("B - A = " + numsResult2);
        System.out.println("A ^ B = " + numsResult3);

    }
}
