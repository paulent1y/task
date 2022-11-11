package by.paulent1y;

import java.util.Random;

public class Task3 {

    private final static int ARRAY_LENGTH = 40;

    public static void main(String[] args) {

        //вводить массивы ручками то еще удовольствие, со школы помню, так что тут просто сгенерированные

        System.out.println("Задание 3: \nСоставить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        System.out.print("Исходный массив натуральных чисел: \n");

        int[] nat = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            nat[i] = i+1;
        }

        printArray(nat, false);
        System.out.println("Элементы кратные трем:");
        printArray(nat, true);

        System.out.print("\nИсходный массив случайных чисел (-250,250): \n");
        int[] rand = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            rand[i] = new Random().nextInt(500) - 250;
        }
        printArray(rand, false);
        System.out.println("Элементы кратные трем:");
        printArray(rand, true);
    }

    private static void printArray(int[] array, boolean multipleOf3){
        for (int i = 0; i < array.length; i++) {
            if (multipleOf3 && !(array[i]%3==0))
                continue;
            System.out.print(array[i] + ", ");
        }
        System.out.println("\b\b");
    }
}