package com.zayzou.extra.divers;

import java.util.Scanner;

public class InsctrucionDeControle {

    public static void main(String[] args) {
        boucleFor();
//        int limit = 10;
//        int i = 9;
//        int j = 9;
//        j += 1;
//
//        if (++i <= limit) System.out.println("I OK : " + i);
//        if (j <= limit) System.out.println("J OK: " + j);

    }

    /*
    •0 % pour un montant inférieur à 1 000 F,
    •1 % pour un montant supérieur ou égal à 1 000 F et inférieur à 2 000 F,
    •3 % pour un montant supérieur ou égal à 2 000 F et inférieur à 5 000 F,
    •5 % pour un montant supérieur ou égal à 5 000 F.”
     */
    public static void tva() {
        final double TVA = 21.6;
        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez le prix hors taxe");
        double prixHorsTaxe = sc.nextDouble();

        //Prix TTC=Prix HT+(Prix HT×Taux de taxe)
        double prixTTC = prixHorsTaxe * (1 + TVA / 100);

        System.out.println("Prix TTC : " + prixTTC);

        double remise = 0;
        if (prixTTC < 1000) {
            System.out.println("remise : " + remise);
        }
        if (prixTTC >= 1000 && prixTTC < 2000) {
            remise = prixTTC * .01;
            System.out.println("remise : " + remise);
        }
        if (prixTTC >= 2000 && prixTTC < 5000) {
            remise = prixTTC * .02;
            System.out.println("remise : " + remise);
        }
        if (prixTTC >= 5000) {
            remise = prixTTC * .03;
            System.out.println("remise : " + remise);
        }
        System.out.println("Net à payer : " + (prixTTC - remise));

    }

    public static void javaSwitch() {
        int n;
        System.out.println("Donnez un nombre entier>=0 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch (n) {
            case 0:
                System.out.println("null");
                break;
            case 1:
            case 2:
                System.out.println("petit");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("moyen");
                break;
            default:
                System.out.println("grand");

        }
    }

    public static void newJavaSwitch() {
        int n;
        System.out.println("Donnez un nombre entier>=0 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch (n) {
            case 0 -> System.out.println("null");
            case 1, 2 -> System.out.println("petit");
            case 3, 4, 5 -> System.out.println("moyen");
            default -> System.out.println("grand");
        }

        System.out.println("==============");
        System.out.println("Donnez une lettre de a-z : ");
        char c = "sa".charAt(0);
        var result = switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                yield "voyelle";
            }
            default -> {
                yield "consone";
            }
        };
        System.out.println(result);

    }

    public static void boucleFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int i = 0;
        for (; i < 5; i++) {
            System.out.println(i);
        }
        i = 0;
        for (; i < 5; ) {
            System.out.println(i);
            i++;
        }
    }
}
