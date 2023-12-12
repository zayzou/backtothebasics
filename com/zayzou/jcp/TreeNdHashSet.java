package com.zayzou.jcp;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeNdHashSet {

    public static void main(String[] args) {
 /*       HashSet<Integer> h = new HashSet<>();

        h.add(1);
        h.add(2);
        h.add(4);
        h.add(4);
        h.add(3);

        TreeSet<Integer> t = new TreeSet<>();

        t.add(1);
        t.add(2);
        t.add(4);
        t.add(4);
        t.add(3);
        affiche(t, h);


        h.remove(3);
        t.remove(4);

        affiche(t, h);

        boolean yes = t.contains(3);
        System.out.println(yes);*/

        operationEnsembliste();

    }

    private static void affiche(TreeSet<Integer> t, HashSet<Integer> h) {

        t.forEach(System.out::print);
        System.out.println();
        h.forEach(System.out::print);
        System.out.println();
    }

    public static void operationEnsembliste() {
        int t1[] = {2, 5, 6, 8, 9};
        int t2[] = {3, 6, 7, 9};

        HashSet<Integer> e1 = new HashSet<>();
        HashSet<Integer> e2 = new HashSet<>();
        for (int i : t1) {
            e1.add(i);
        }
        for (int i : t2) {
            e2.add(i);
        }
        //operation d'union e1 U e2 -> tout les elements de e1 et de e2 sont dans e1
        e1.addAll(e2);
        System.out.print("e1 U e2 : ");
        e1.forEach(e -> System.out.print(e + " "));
        System.out.println();
        e1 = resetE1(t1);


        //operation d'intersection e1 ∩ e2 -> que les elements qui existe dans les deux ensemble
        e1.retainAll(e2);
        System.out.print("e1  ∩  e2 : ");
        e1.forEach(e -> System.out.print(e + " "));
        System.out.println();
        e1 = resetE1(t1);


        //operation de complementaire e1 - e2 -> que les elements qui n'existe pas dans les deux ensemble
        e1.removeAll(e2);
        System.out.print("e1  -  e2 : ");
        e1.forEach(e -> System.out.print(e + " "));
    }

    private static HashSet<Integer> resetE1(int[] t1) {
        HashSet<Integer> e1;
        e1 = new HashSet<>();
        for (int i : t1) {
            e1.add(i);
        }
        return e1;
    }


}
