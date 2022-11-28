package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * В файле содержится строка с исходными данными в такой форме:
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Требуется на её основе построить и вывести на экран новую строку, в форме SQL
 * запроса:
 * SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city
 * = "Moscow";
 *
 */
public class App {
    public static void main(String[] args) {
        String jsonString = read();
        System.out.println(createStringSQL(createArrayStrings(jsonString)));

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

    private static String[][] createArrayStrings(String jsonString) {
        jsonString = jsonString.substring(1, jsonString.length() - 1);
        String[] arr = jsonString.split("\"");
        jsonString = String.join("", arr);
        arr = jsonString.split(", ");
        String[][] newArray = new String[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i].split(":");
        }

        return newArray;
    }

    private static String createStringSQL(String[][] arrayStrings) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SELECT * FROM students WHERE ");
        int count = 0;
        for (String[] array : arrayStrings) {
            if (!array[1].equals("null")) {
                if (count > 0) {
                    stringBuffer.append(" AND ");
                }
                stringBuffer.append(array[0]);
                stringBuffer.append(" = \"");
                stringBuffer.append(array[1]);
                stringBuffer.append("\"");
                count++;
            }
        }
        return stringBuffer.toString();
    }
}
