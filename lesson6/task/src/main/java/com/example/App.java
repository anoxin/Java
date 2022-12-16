package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * 
 * Создать множество ноутбуков.
 * 
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
 * фильтрации можно хранить в Map. Например:
 * 
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * 
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * 
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 *
 */
public class App {
    public static void main(String[] args) {
        Laptop hp_15s = new Laptop("HP 15s-fq0082ur", "HP", "Intel Celeron N4020 1.1 ГГц", 4, 250, "Windows", "blue",
                true, false, LocalDate.of(2020, Month.AUGUST, 9));
        Laptop hp_14s = new Laptop("HP 14s-fq0088ur", "HP", "AMD Athlon Gold 3150U 2.4 ГГц", 6, 500, "Windows", "blue",
                true, true, LocalDate.of(2021, Month.MAY, 10));
        Laptop toshiba = new Laptop("Toshiba Satellite P855-DWS", "Toshiba", "Core i7-3630QM", 6, 1000,
                "Windows", "green",
                true, true, LocalDate.of(2018, Month.MAY, 11));
        Laptop lenovo = new Laptop("Lenovo V15 G2 IT", "Lenovo", "Intel Core i3 1115G4 3.0ГГ", 8, 1500,
                "Linux", "black",
                true, true, LocalDate.of(2019, Month.MAY, 11));
        Laptop apple = new Laptop("Apple MacBook Air A2337", "Apple", "Apple M1 8 core 3.2ГГц", 4, 250,
                "MacOS", "white",
                false, false, LocalDate.of(2020, Month.MAY, 11));

        List<Laptop> list = new ArrayList<>();
        list.add(hp_15s);
        list.add(hp_14s);
        list.add(toshiba);
        list.add(lenovo);
        list.add(apple);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - фирма");
        System.out.println("2 - цвет");
        System.out.println("3 - ОЗУ");
        System.out.println("4 - жесткий диск");
        System.out.println("5 - наличие wi-fi");
        System.out.println("6 - наличие bluetooth");

        Scanner scaner = new Scanner(System.in);
        String input = scaner.nextLine();

        String firma = null;
        String color = null;
        int workingMemory = 0;
        int hardDiskMemory = 0;
        boolean wifi = false;
        boolean bluetooth = false;

        if (input.equals("1")) {
            System.out.println("Введите фирму:");
            firma = scaner.nextLine();
        }
        if (input.equals("2")) {
            System.out.println("Введите цвет(black):");
            color = scaner.nextLine();
        }
        if (input.equals("3")) {
            System.out.println("Введите минимальное количество ОЗУ");
            workingMemory = Integer.parseInt(scaner.nextLine());
        }
        if (input.equals("4")) {
            System.out.println("Введите минимальное количество памяти жёского диска");
            hardDiskMemory = Integer.parseInt(scaner.nextLine());
        }
        if (input.equals("5")) {
            wifi = true;
        }
        if (input.equals("6")) {
            bluetooth = true;
        }
        scaner.close();

        for (Laptop item : list) {
            if (firma != null && item.getFirma().equals(firma)) {
                System.out.println(item);
            }
            if (color != null && item.getColor().equals(color)) {
                System.out.println(item);
            }
            if (workingMemory != 0 && item.getWorkingMemory() >= workingMemory) {
                System.out.println(item);
            }
            if (hardDiskMemory != 0 && item.getHardDiskMemory() >= hardDiskMemory) {
                System.out.println(item);
            }
            if (wifi) {
                System.out.println(item);
            }
            if (bluetooth) {
                System.out.println(item);
            }
        }

    }
}
