package com.hillel.chergina.lesson6;

public class HomeworkShatle6 {
    public static void main(String[] args) {
        int a = 0;
            for (int i=1; i < 9; i++){
                if ( i != 4 ) {
                    System.out.println(i);
                    a++;
                }
            }
            for (int j = 1; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if ( k != 4 && j != 4) {
                        System.out.println(j +""+ k);
                        a++;
                    }
                }
            }
            System.out.println("100");
            for (int j = 1; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    for (int x = 0; x < 9; x++) {
                        if ( x != 4 && k != 4 && j != 4) {
                            System.out.println(j +""+ k + x);
                            a++;
                            if (a > 100) {
                                System.exit(0);
                            }
                        }
                    }
                }
            }
    }
}



