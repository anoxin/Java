package com.example;

/**
 * *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
 * заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить
 * выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
 * что его нет.
 *
 */
public class App {
    public static void main(String[] args) {

        String str = "2? + ?5 = 69";
        String strNumber = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == "?".charAt(0)) {
                strNumber += i + " ";
            }

        }
        ;

        String[] arrayNumber = strNumber.split(" ");
        String[] arraySecond = str.split("");

        int count = 1;
        int countSecond = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < arrayNumber.length; k++) {
                    arraySecond[Integer.parseInt(arrayNumber[k])] = "" + i;
                    arraySecond[Integer.parseInt(arrayNumber[arrayNumber.length - count])] = "" + j;
                }
                String strNew = String.join("", arraySecond);

                String[] arrayStr = strNew.split(" ");
                if (Integer.parseInt(arrayStr[0]) + Integer.parseInt(arrayStr[2]) == Integer.parseInt(arrayStr[4])) {
                    System.out.println(Integer.parseInt(arrayStr[0]) + " + " + Integer.parseInt(arrayStr[2]) + " = "
                            + Integer.parseInt(arrayStr[4]));

                    countSecond++;

                }
                if (count == arrayNumber.length) {
                    count = 1;
                } else {
                    count++;
                    j--;
                }
            }
        }
        if (countSecond == 0) {
            System.out.println("Решений нет!");
        }
    }
}
