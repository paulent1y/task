package by.paulent1y;

import java.util.Scanner;

public class Task2 {

    private final static String EXISTING_NAME = "Вячеслав";

    public static void start() {
        Scanner scanner = new Scanner(System.in, "ibm866");
        System.out.printf("Задание 2: \nСоставить алгоритм: если введенное имя совпадает с %s, то вывести \"Привет, %s\", если нет, то вывести \"Нет такого имени\"\n", EXISTING_NAME, EXISTING_NAME);
        System.out.print("Введите имя: ");
        String input = scanner.nextLine();
        if (input.equals(EXISTING_NAME))
            System.out.println("Привет, " + EXISTING_NAME);
        else
            System.out.println("Нет такого имени");

    }
}