package by.paulent1y;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    private static int arrayLength = 40;
    private static int[] array;
    private static Scanner scanner;
    public static void start() {

        System.out.println("Задание 3: \nСоставить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        checkAnswer();

    }

    private static void checkAnswer(){
        System.out.println("Хотите вводить числа вручную? \n(Y/y/N/n):");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.toLowerCase().equals("y"))
        {
            manualArray();
        }
        else if (answer.toLowerCase().equals("n")) {
            naturalArray();
            randomArray();
        }
        else {
            System.out.println("Нераспознанный ответ, давайте еще раз");
            checkAnswer();
        }
    }
    private static void manualArray(){
        scanner = new Scanner(System.in);
        System.out.println("ладна...  \nдлина массива будет: ");
        arrayLength = inputNumber();
        array = new int[arrayLength];
        System.out.println("Теперь вводим " + arrayLength + " значений в массив: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println((i+1) + ": ");
            array[i] = inputNumber();
        }
        System.out.println("Спасибо, вот результат:");
        printArray(array);
    }

    public static int inputNumber(){
        int answer = 0;
        try {
            answer = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Сломал, давай по новой");
            checkAnswer();
        }
        return answer;
    }


    private static void naturalArray(){
        System.out.print("Массив натуральных чисел: \n");
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = i+1;
        }
        printArray(array);
    }

    private static void randomArray(){
        System.out.print("\nМассив случайных чисел (-250,250): \n");
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = new Random().nextInt(500) - 250;
        }
        printArray(array);
    }

    private static void printArray(int[] array){
        System.out.print("Весь массив: \n");
        for (int j : array) {
            System.out.print(j + ", ");
        }
        System.out.println("\b\b");
        System.out.println("Элементы кратные трем:");
        for (int j : array) {
            if (j % 3 == 0 && j!= 0)
                System.out.print(j + ", ");
        }
        System.out.println("\b\b");
    }
}