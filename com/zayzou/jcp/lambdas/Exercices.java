package com.zayzou.jcp.lambdas;

import java.util.function.IntPredicate;

interface Affichable {
    boolean afficher(int n);
}

public class Exercices {

    public static void main(String[] args) {
        int[] tab = {1, 4, -2, 9, -3, 5, -3, 12, 7, -11, 0, 6};

        System.out.println("-- Les positifs : ");
        affichageSelectif2(tab, ee -> ee > 0);
        affichageSelectif(tab, ee -> ee > 0);
        affichageSelectif(tab, Exercices::filtragePositifs);

        System.out.println("\n-- Les négatifs : ");
        affichageSelectif(tab, ee -> ee < 0);
        affichageSelectif2(tab, ee -> ee < 0);
        affichageSelectif(tab, Exercices::filtrageNegatifs);

        System.out.println("\n-- Les pairs : ");
        affichageSelectif(tab, ee -> (ee % 2 == 0));
        affichageSelectif2(tab, ee -> (ee % 2 == 0));
        affichageSelectif(tab, Exercices::filtragePairs);


    }

    public static boolean filtrageNegatifs(int n) {
        return n < 0;
    }

    public static boolean filtragePairs(int n) {
        return n % 2 == 0;
    }

    public static boolean filtragePositifs(int n) {
        return n > 0;
    }


    private static void affichageSelectif2(int[] tab, Affichable a) {
        for (int i : tab) {
            if (a.afficher(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void affichageSelectif(int[] tab, IntPredicate predicate) {
        for (int i : tab) {
            if (predicate.test(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}
