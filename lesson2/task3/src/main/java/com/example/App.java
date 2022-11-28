package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * В файле содержится строка с данными:
 * 
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * 
 * Напишите метод, который разберёт её на составные части и, используя
 * StringBuilder создаст массив строк такого вида:
 * 
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 *
 */
public class App {
    public static void main(String[] args) {
        String jsonString = read();
        for (String item : splittingArrayElements(jsonString)) {
            System.out.println(createString(createArrayStrings(item)));
        }

    }

    private static String read() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./file.json"))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }

            return stringBuffer.toString();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    private static String[] splittingArrayElements(String jsonString) {
        jsonString = jsonString.substring(1, jsonString.length() - 1);
        String[] arr = jsonString.split(", ");
        return arr;
    };

    private static String[][] createArrayStrings(String string) {
        string = string.substring(1, string.length() - 1);
        String[] arr = string.split("\"");
        string = String.join("", arr);
        arr = string.split(",");
        String[][] newArray = new String[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i].split(":");
        }

        return newArray;
    }

    private static String createString(String[][] arrayStrings) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Студент ");
        for (String[] array : arrayStrings) {
            if (array[0].equals("фамилия")) {
                stringBuffer.append(array[1]);
                stringBuffer.append(" получил ");
            }
            if (array[0].equals("оценка")) {
                stringBuffer.append(array[1]);
                stringBuffer.append(" по предмету ");
            }
            if (array[0].equals("предмет")) {
                stringBuffer.append(array[1]);
            }

        }
        return stringBuffer.toString();
    }
}