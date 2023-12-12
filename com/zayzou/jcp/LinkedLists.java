package com.zayzou.jcp;

import java.util.*;

/**
 * Liste doublement chainé qui contient toujours deux pointeurs
 * Les operations d'ajout sont à O(1) et celle de l'acces à un element est
 * à O(N)
 */
public class LinkedLists {


    public static void main(String[] args) {
/*        int[] nums = {1, 2, 3, 4, 5, 6};
        //construction est parcours
        //liste vide
        LinkedList<Integer> l1 = new LinkedList<>(List.of(0, 0, 0));
        //liste initialise apartire d'un array
        LinkedList<Integer> l2 = new LinkedList<>(Collections.EMPTY_LIST);

        //Ajout d’un élément en fin de list
        System.out.println("Adding to Linkedlist");
        l1.add(1); // O(1)
        affiche(l1);
        l1.addLast(2); // O(1)
        affiche(l1);
        l1.addFirst(4); // O(1)
        affiche(l1);
        l1.add(1, 6); // O(k)
        affiche(l1);

        //Suppression d’un élément
        System.out.println("Removing from Linkedlist");
        l1.removeFirst(); // O(1)
        affiche(l1);
        l1.removeLast(); // O(1)
        affiche(l1);
        l1.remove(2); // O(k)
        affiche(l1);
        l1.remove(Integer.valueOf(6));
        affiche(l1);*/

        example2();

    }

    public static void example() {
        LinkedList<String> l1 = new LinkedList<>();

        System.out.println("Liste vide : ");
        affiche2(l1);

        //ajout en fin de liste
        l1.add("a");
        l1.add("d");
        System.out.println("Liste apres ajout de a,b : ");
        affiche2(l1);


        ListIterator<String> it = l1.listIterator();
        it.next();// on se place au premier element

        //on ajoute 2 elements
        it.add("c");
        it.add("b");
        System.out.println("Liste apres ajout de c,b : ");
        affiche2(l1);


        it = l1.listIterator();
        it.next();
        it.add("x");
        it.add("y");
        System.out.println("Liste apres ajout de x,y : ");
        affiche2(l1);

        it = l1.listIterator(l1.size()); // on se place on fin de liste
        while (it.hasPrevious()) { //on recherche le dernier b
            String ch = it.previous();
            if (ch.equals("b")) {
                it.remove(); //on le supprime
                break;
            }
        }
        affiche2(l1);

        it = l1.listIterator();
        it.next();
        it.next();//on se place sur le 2eme element
        it.set("z");//on remplace par z
        affiche2(l1);
    }

    public static void example2() {

        LinkedList<String> l1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez une suite de mot vide pour finir : ");
        while (true) {
            String ch = sc.nextLine();
            if (ch.isBlank()) break;
            l1.add(ch);
        }
        System.out.println("printing the linked list using the builting toString ");
        System.out.println(l1);

        //using iterator
        ListIterator<String> it = l1.listIterator();

        System.out.println("printing the linked list in order using next");
        //forward
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //backward
        it = l1.listIterator(l1.size());//pointing the last element in the linked list
        System.out.println("printing the linked list in reverse using previous");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }


    }


    private static void affiche(LinkedList<Integer> l1) {
        l1.forEach(e -> System.out.print(e + ", "));
        System.out.println();
    }

    private static void affiche2(LinkedList<String> l1) {
        ListIterator<String> it = l1.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
//        l1.forEach(e -> System.out.print(e + ", "));
        System.out.println();
    }
}
