package com.zayzou.jcp.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Point5 {
    private int x, y;

    public Point5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static void traiteList(List<Point5> list,
                           Predicate<Point5> selection,
                           Comparator<Point5> comparator,
                           Consumer<Point5> affichage) {
        list.stream()
                .filter(e -> e.getX() > 0)
                .sorted(comparator)
                .forEach(Point5::affiche);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void affiche() {
        System.out.print(" [ " + x + ", " + y + "] ");
    }
}

public class Exercice173 {

    public static void main(String[] args) {
        Point5[] tab = {new Point5(2, 5), new Point5(-3, 4),
                new Point5(2, 3), new Point5(6, -3)};
        ArrayList<Point5> l = new ArrayList<>();

        Collections.addAll(l, tab);
        l.stream()
                .filter(e -> e.getX() > 0)
                .sorted(Comparator.comparing(Point5::getX))
                .forEach(Point5::affiche);
//        Point5.traiteList(
//                l,
//                p -> p.getX() > 0,
//                Comparator.comparing(Point5::getX),
//                Point5::affiche
//        );
    }
}
