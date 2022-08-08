package com.hillel.chergina.lesson6;

public class HomeworkShatle6 {
    public static void main(String[] args) {
            for (int i=1; i < 9; i++){
                if ( i != 4 ) {
                    System.out.println(i);
                }
            }
            for (int j = 1; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if ( k != 4 && j != 4) {
                        System.out.println(j +""+ k);
                    }
                }
            }
            System.out.println("100");
    }
}



