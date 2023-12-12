package com.zayzou.jcp.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Points implements Comparable<Points> {
    private int x;
    private int y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ']';
    }

    @Override
    public int compareTo(Points p1) {
        return this.getX() - p1.getX();
    }
}

public class NewMethodsComparator {

    public static void main(String[] args) {


        List<Points> list = Arrays.asList(new Points(2, 5), new Points(-2, 3),
                new Points(6, -3), new Points(-3, -2));


        System.out.println("Avant tri : ");
        list.forEach(e -> System.out.print(e));

        //we used the interface comparator<T> and the method compare
//        list.sort((p1, p2) -> ((Integer) (p1.getX())).compareTo((Integer) (p2.getX())));
        list.sort((p1, p2) -> p1.getX() - p2.getX());
        System.out.println("\nTri abcisse : ");
        list.forEach(e -> System.out.print(e));

        list.sort(Comparator.comparing(Points::getY));
        System.out.println("\nTri ordonnee : ");
        list.forEach(e -> System.out.print(e));

        list.sort(Comparator.comparing(Points::getY));
        System.out.println("\nTri ordonnee : ");
        list.forEach(e -> System.out.print(e));

        list.sort(Comparator.naturalOrder());
        System.out.println("\nTri ordre naturel  : ");
        list.forEach(e -> System.out.print(e));

        list.sort(Comparator.comparing(Points::getY).reversed());
        System.out.println("\nTri ordonee inverse  : ");
        list.forEach(e -> System.out.print(e));


    }
}
