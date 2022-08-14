package com.hillel.chergina.lesson6;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10 +1);
//        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Поиграем?! Я загадал число. Отгадывай! У тебя есть три попытки! ");
        for (int i = 1; i <= 3; i++) {
            if (scanner.hasNextInt()) {
                int enteredValue = scanner.nextInt();
                if (enteredValue == a) {
                    System.out.println("Вау! Угадал!");
                    System.exit(0);
                } else {
                    System.out.println(enteredValue < a ? " Подсказка: больше" : "Подсказка: меньше");
                }
            } else {
                System.out.println("Введите число от 0 до 10");
                scanner.next();
            }
        }
        System.out.println("Эх Тыыыыыы!!! Все было так просто! Ты проиграл!");











////        int firstChance = resultScanner("1");
//        if (firstChance == a) {
//            System.out.println("Вау! Угадал!");
//            break;
//        } else {
//            System.out.println("Неа! У тебя есть еще две попытки! ");
//        }
//
//
////
//
//
//        static int resultScanner(String a) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Попытка №  " + a);
//            int firstChance=0;
//            if (scanner.hasNextInt()) {
//                firstChance = scanner.nextInt();
//            } else {
//                System.out.println("Вы ввели не правильное значение! Введите целое число:");
//                System.exit(0);
//            }
//            return firstChance;
//        }
//    }
    }
}

