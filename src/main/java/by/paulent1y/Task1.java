package by.paulent1y;

import java.util.Scanner;

public class Task1 {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1: \nСоставить алгоритм: если введенное число больше 7, то вывести \"Привет\"");
        System.out.print("Введите число: ");
        String input = scanner.nextLine();
        int num = 0;

        try {
            num = Integer.parseInt(input);
        }
        catch (Exception e){
            System.out.println("Введенное значение не похоже на число");
        }

        if (num>7){
            System.out.println("Привет");
        }
    }
}