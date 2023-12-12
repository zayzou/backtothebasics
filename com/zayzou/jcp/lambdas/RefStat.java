package com.zayzou.jcp.lambdas;


interface Calculateur {
    int calcul(int n);
}

public class RefStat {

    public static void main(String[] args) {
        //traite(5,n-> n * n);
        traite(5, RefStat::caree);
//        traite(12, n -> 2 * n * n + 3 * n + 5);
        traite(12, RefStat::trinome);
    }

    public static int caree(int n) {
        return n * n;
    }

    public static int trinome(int n) {
        return 2 * n * n + 3 * n + 5;
    }

    public static void traite(int n, Calculateur c) {
        int res = c.calcul(n);
        System.out.println("calcule (" + n + ") = " + res);
    }
}
