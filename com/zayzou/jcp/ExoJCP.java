package com.zayzou.jcp;

import java.util.*;
import java.util.stream.IntStream;

//java collection
public class ExoJCP {

    public static void main(String[] args) {
      /*  ListeTriee liste = new ListeTriee(new LinkedList<>());
        liste.add("c");
        liste.affiche();
        liste.add("b");
        liste.affiche();
        liste.add("f");
        liste.affiche();
        liste.add("e");
        liste.affiche();*/


        Index monIndex = new Index();
        monIndex.ajouter("Java", 25);
        monIndex.ajouter("C++", 45);
        monIndex.ajouter("Java", 12);
        monIndex.ajouter("objet", 15);
        monIndex.ajouter("polymorphisme", 45);
        monIndex.liste();
    }

    private static void linkedListIntro() {
        LinkedList<Integer> liste = new LinkedList<Integer>();
        liste.add(3);
        liste.add(5);
        liste.add(3);
        liste.add(12);
        liste.add(3);
        System.out.println(liste);//3,5,3,12,3
        liste.remove(3);
        System.out.println(liste);//3,5,3,3
        liste.remove(3);
        System.out.println(liste);//3,5,3
        Iterator<Integer> it = liste.iterator();
        while (it.hasNext()) if (it.next() == 3) it.remove();
        System.out.println(liste);//5
    }

    public static void arrayListManipulation() {
        AbstractList<Integer> tab = new ArrayList<>();
        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(-3);
        tab.add(4);
        tab.add(5);
        tab.add(-2);
        tab.add(-5);
        ListIterator<Integer> iterator = tab.listIterator();
        //affichage dans l'ordre naturel
/*        //solution1
        System.out.println(tab);

        //solution2
        for (Integer i : tab) {
            System.out.print(i + " ");
        }
        System.out.println();

        //solution 3

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //solution 4
        for (int i = 0; i < tab.size(); i++) {
            System.out.print(tab.get(i) + " ");
        }
        System.out.println();*/

        //solution Z
        System.out.println("solution z: ");
        tab.forEach(e -> System.out.print(e + " "));
        System.out.println();

        //affichage dans l'ordre inverse
/*        //solution 1
        iterator = tab.listIterator(tab.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        //solution 2
        for (int i = tab.size() - 1; i >= 0; i--) {
            System.out.print(tab.get(i) + " ");
        }
        System.out.println();*/

        //solution z
        System.out.println("solution z: ");
        tab.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println();

        //affichage des rangs pair
/*        //solution 1
        iterator = tab.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            if (iterator.hasNext()) iterator.next();//skip the odd one
        }
        System.out.println();

        //solution 2
        for (int i = 0; i < tab.size(); i += 2) {
            System.out.print(tab.get(i) + " ");
            //skip the odd ones
        }
        System.out.println();*/
        System.out.println("solution z: TBD!");

        //mise à zero des valeurs negatifs
/*        iterator = tab.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                iterator.set(0);
            }
        }
        System.out.println("mise à zero 1: " + tab);
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) < 0) {
                tab.set(i, 0);
            }
        }
        System.out.println("mise à zero 2: " + tab);*/

        tab.stream().map(e -> e < 0 ? 0 : e).forEach(e -> System.out.print(e + " "));
    }

    public static void triCollection() {
        record Cercle(int x, int y, double rayon) implements Comparable<Cercle> {

            @Override
            public int compareTo(Cercle cercle) {
                return Double.compare(this.rayon, cercle.rayon);
            }
        }
        ArrayList<Cercle> liste = new ArrayList<Cercle>();
        Cercle c1 = new Cercle(5, 3, 5.0);
        Cercle c2 = new Cercle(1, 9, 3.5);
        Cercle c3 = new Cercle(2, 9, 2.5);
        liste.add(c1);
        liste.add(c2);
        liste.add(c3);

        System.out.println("Cercles before sorting " + liste);
        Collections.sort(liste, (Cercle o1, Cercle o2) -> (int) (o1.rayon() - o2.rayon()));
        System.out.println("Cercles after sorting with r" + liste);
        Collections.sort(liste, (Cercle o1, Cercle o2) -> (int) (o1.x() - o2.x()));
        System.out.println("Cercles after sorting with x" + liste);

        Collections.sort(liste);
        System.out.println("Cercles after sorting with rayon using Comparable" + liste);
    }
}


class ListeTriee {
    private LinkedList<String> list;

    public ListeTriee(LinkedList<String> list) {
        this.list = list;
    }

    public void add(String element) {
        //get the index of the first element greater than element
        OptionalInt first = IntStream
                .rangeClosed(0, list.size() - 1)
                .filter(i -> list.get(i).compareTo(element) > 0)
                .findFirst();

        if (first.isPresent()) {
            this.list.add(first.getAsInt(), element);
        } else {
            this.list.add(element);
        }
    }

    public void affiche() {
        System.out.println(this.list);
    }
}

class Index {

    private TreeMap<String, TreeSet<Integer>> index;
    private TreeMap<Integer, TreeSet<String>> indexPage;

    public Index() {
        this.index = new TreeMap<>();
    }

    public void ajouter(String entree, int numero) {
        TreeSet<Integer> tree =
                !this.index.containsKey(entree) ? new TreeSet<Integer>() : this.index.get(entree);
        tree.add(numero);
        this.index.put(entree, tree);

    }

    public void creationIndexPage() {
        for (Map.Entry<String, TreeSet<Integer>> index : this.index.entrySet()) {
            
            System.out.print(index.getKey() + " : ");
            for (Integer integer : index.getValue()) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }

    public void liste() {
        System.out.println("Affichage de la liste des index par ordre alphabétique des entrée :");
        for (Map.Entry<String, TreeSet<Integer>> index : this.index.entrySet()) {
            System.out.print(index.getKey() + " : ");
            for (Integer integer : index.getValue()) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }

    public void listeIndexPage() {
        System.out.println("Affichage de la liste des index par ordre alphabétique des entrée :");
        for (Map.Entry<Integer, TreeSet<String>> index : this.indexPage.entrySet()) {
            System.out.print(index.getKey() + " : ");
            for (String entree : index.getValue()) {
                System.out.print(entree + " ");
            }
            System.out.println();
        }

    }
}
