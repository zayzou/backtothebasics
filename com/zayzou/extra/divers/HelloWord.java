package com.zayzou.extra.divers;

import java.io.PrintStream;
import java.util.Scanner;

class HelloWord {
    public static void main(String[] args) {
        operateurDecalage();
    }

    public static void opertateurJava() {
//        var x = 7;
//        var y = x = 3;
//        float x = 1e30f;
//        float y;
//        y = x * x;
//        System.out.println(y);
//        float zero = 0;
//        System.out.println(zero);
//        float z = y / zero;
//        System.out.println(z);
//
//        float po = Float.POSITIVE_INFINITY;
//        float ne = Float.NEGATIVE_INFINITY;
//        System.out.println(ne / po);


        int n = 20;
        float q = 3.f;
        float r = 0.f;
        System.out.println(n * q + r);


    }

    public static void convertion() {
        byte b1 = 50, b2 = 100;
        int n;
        n = b1 * b2;
        System.out.println(b1 + "*" + b2 + " = " + n);

        int n1 = 100000, n2 = 200000;
        long p;
        p = n1 * n2;
        System.out.println(n1 + "*" + n2 + " = " + p);

    }

    public static void lesChar() {
        char c1 = 'A';
        int n = c1 + 1;
        System.out.println((char) n);
    }

    public static void incrementation() {
        int i = 0;
        System.out.println("i++ : " + (i++));
        int j = 0;
        System.out.println("++j : " + (++j));
    }

    public static void operateurDecalage() {
        int n = 4;
        System.out.println("n<<2 : " + (n << 2));
        System.out.println("n>>2 : " + (n >> 2));
    }

    private static void variableJava() {
        String tête = "ma tête";
        System.out.println(tête);
        int ldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfa = 0;
        System.out.println(ldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfaldkalkdaldkalkdalkdalsdklakdslkdalkdaslkasldkaslkdalskdlaskdlaskdlkasldkasldkalskdlakflakflakldfa);
    }

    private static void calculeRacine() {

        final int NFOIS = 5;
        double x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Methode pour calculer la racine carrées ");
        for (int i = 0; i < NFOIS; i++) {
            x = sc.nextDouble();
            if (x < 0) {
                System.out.println(x + " ne peut pas avoir de racine carrée");
            } else {
                System.out.println("La racine carrée de " + x + " est " + Math.sqrt(x));
                System.out.println("Calcule terminé !");
            }

        }

    }

    private static void example01() {
        PrintStream o = System.out;
        o.println("Hello java");

        int n;
        double x;
        n = 5;
        x = 2 * n + 1.5;
        o.println("n = " + n);
        o.println("x =" + x);
        double y;
        y = n * x + 12;
        o.println("y = " + y);
    }

    private static void afficheCar() {

        final char carDeb = 0, carFin = 100;
        for (char c = carDeb; c <= carFin; c++) {
            System.out.println(c + " : " + (int) c);
        }
    }
}
