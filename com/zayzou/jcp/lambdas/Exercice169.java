package com.zayzou.jcp.lambdas;

import java.util.function.IntPredicate;

@FunctionalInterface
interface Selectif {
    boolean test(int x);
}

public class Exercice169 {


    public static void main(String[] args) {
        int[] tab = {1, 4, -2, 9, -3, 5, -3};
        System.out.println("--Les positifs de tab");
        affichage_selectif2(tab, e -> e > 0);


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
