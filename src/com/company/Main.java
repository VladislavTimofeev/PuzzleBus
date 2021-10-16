package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш ответ: ");
        String answer = scanner.nextLine();

        switch (answer.toLowerCase()){
            case "троллейбус":
                System.out.println("Правильно!");
                break;
            case "сдаюсь":
                System.out.println("Правильный ответ : Троллейбус");
                break;
            default:
                System.out.println("Подумай еще.");
        }
    }
}
