package com.hillel.chergina.lesson7;

import java.sql.SQLOutput;

public class Homework7 {
    public static void main(String[] args) {
        int [] regbi1 = new int[25];
        int [] regbi2 = new int[25];
        int Sum1 = 0;
        int Sum2 = 0;

        for (int i=0; i < 25; i++) {
            regbi1[i] = randomResult(18,40);
            System.out.print(regbi1[i] + " ");

            Sum1 = Sum1 + regbi1[i];

        }
        System.out.println();
        System.out.println("Средний возраст игроков 1 команды = " + (int) Sum1/25);
        for (int i=0; i < 25; i++) {
            regbi2[i] = randomResult(18,40);
            System.out.print(regbi2[i] + " ");

            Sum2 = Sum2 + regbi2[i];

        }
        System.out.println();
        System.out.println("Средний возраст игроков 2 команды = " + (int) Sum2/25);
    }
    static int randomResult(int a, int b){
        int result = a + (int)(Math.random()*(b-a));
        return result;
    }
}
