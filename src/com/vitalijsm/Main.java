package com.vitalijsm;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i<=4; i++ ) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }

            //System.out.println();
            //Ja aktivējam System.out.println();, tad iznāks taisnstūris ar 4*10
        }
        System.out.println();
        for (int l = 1; l<=5; l++ ) {
            for (int m = 1; m <= l; m++) {
                System.out.print("* ");
            }
            //System.out.println();
            //Ja aktivējam System.out.println();, tad iznāks trīsstūris ar 1 zvaigzni augšā un 5 zvaigznēm apakšā
        }
        System.out.println();
        for (int b = 1; b<=5; b++ ) {
            for (int c = b; c <= 5; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= b; c++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        for (int e = 1; e<=5; e++ ) {
            for (int f = e; f <= 5; f++) {
                System.out.print(" ");
            }
            for (int f = 1; f < e; f++) {
                System.out.print("* ");
            }
            for (int f = 1; f <= e; f++) {
                System.out.print("* ");
            }
        }

    }
}

