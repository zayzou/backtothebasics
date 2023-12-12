package com.zayzou.jcp.lambdas;

import java.util.function.IntPredicate;

@FunctionalInterface
interface Selectif {
    boolean test(int x);
}

public class Exercice169 {


    public static void main(String[] args) {
        int[] tab = {1, 4, -2, 9, -3, 5, -3};
        System.out.println("-- Les positifs ");
        affichage_selectif2(tab, e -> e > 0);
        System.out.println("\nAvec referece à une methode ");
        affichage_selectif2(tab, Exercice169::positifs);

        System.out.println();
        System.out.println("-- Les negatifs :");
        affichage_selectif2(tab, e -> e < 0);
        System.out.println("\nAvec referece à une methode ");
        affichage_selectif2(tab, Exercice169::negatifs);
        System.out.println();
        System.out.println("-- Les pairs :");
        affichage_selectif2(tab, e -> e % 2 == 0);
        System.out.println("\nAvec referece à une methode ");
        affichage_selectif2(tab, Exercice169::pairs);

    }

    public static boolean positifs(int n) {
        return n > 0;
    }

    public static boolean negatifs(int n) {
        return n < 0;
    }

    public static boolean pairs(int n) {
        return n % 2 == 0;
    }

    public static void affichage_selectif(int[] tab, Selectif afficher) {
        for (int i : tab) {
            if (afficher.test(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static void affichage_selectif2(int[] tab, IntPredicate afficher) {
        for (int i : tab) {
            if (afficher.test(i)) {
                System.out.print(i + " ");
            }

        }
    }
}
