package by.paulent1y;

import java.util.Scanner;

public class Application {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Есть задачи 1, 2, 3, 4 (0 - выход из программы). Запускаем задачу №:");
        int answer = getNum();
        switch (answer){
            case 0:
                break;
            case 1:
                Task1.start();
                System.out.println("Задача " + answer + " закончена");
                break;
            case 2:
                Task2.start();
                System.out.println("Задача " + answer + " закончена");
                break;
            case 3:
                Task3.start();
                System.out.println("Задача " + answer + " закончена");
                break;
            case 4:
                Task4.start();
                System.out.println("Задача " + answer + " закончена");
                break;
            default:
                System.out.println("1, 2, 3 или 4 (0 - для завершения). Другого не дано");
                break;

        }

        if (answer!=0) {
            main(new String[]{});
        }
    }

    private static int getNum(){
        scanner = new Scanner(System.in);
        int answer = 0;
        try {
            answer = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Число от 0 до 4 ввести должен ты");
            getNum();
        }
        return answer;
    }
}
