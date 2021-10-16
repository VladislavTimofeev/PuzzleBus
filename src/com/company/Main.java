package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Загадка : Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш ответ: ");

        boolean isCompleted = false;

        for (int i = 0; i < 3; i++) {
            if (isCompleted) {
                break;
            }
            String answer = scanner.nextLine();
            switch (answer.toLowerCase()) {
                case "троллейбус":
                    System.out.println("Правильно!");
                    isCompleted = true;
                    break;
                case "сдаюсь":
                    System.out.println("Правильный ответ : Троллейбус");
                    break;
                default:
                    System.out.println("Подумай еще.");
            }
        }
    }

}
