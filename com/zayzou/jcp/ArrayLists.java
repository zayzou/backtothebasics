package com.zayzou.jcp;


import java.util.*;

/**
 * ArrayList est interessante pour l'access au element puisque sont effecacite est en O(1)
 * par contre les operation d'ajout et de suppression sont à O(N) en moyenne
 * puisque il faut repositioner les elements après
 */
public class ArrayLists {


    public static void main(String[] args) {
/*
        //construction d'un ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(10);
        ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


        //ajout d'un element
        l1.add(3);//O(1) ajout en fin de vecteur
        l1.add(4);
        l1.add(-3);
        System.out.println(l1);

        l1.add(0, 0); //O(N-i) ~ O(N)
        System.out.println(l1);

        //supprimer un element
        //O(N) puisque les elements doivent être deplace
        //elle retourne l'element supprimé
        Integer i = l1.remove(0);
        System.out.println(l1);
        //On peut aussi supprimer l'element en donant sa valeur
        //retourne true si l'element a ete supprime false sinon
        boolean removed = l1.remove(Integer.valueOf(3)); //O(i) ~ O(N)
        if (removed) System.out.println(l1);

        l1.removeIf(e -> e < 0);
        System.out.println(l1);

        //Accès aux éléments
        System.out.println(l1.get(0)); //O(1)
        l1.set(0, 9);//O(1)
        System.out.println(l1.get(0));*/

        exemple();

    }

    public static void exemple() {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        System.out.println("La taille de la liste " + l1.size());

        //afficher avec la boucle for
        for (Integer i : l1) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        l1.remove(4);
        l1.remove(7);
        System.out.println(l1);

        l1.add(2, 2000);
        l1.add(2, 30000);
        System.out.println(l1);
        l1.set(2, 30);
        System.out.println(l1);
        l1.ensureCapacity(4);
        l1.trimToSize();
        

    }

}
