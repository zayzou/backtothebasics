package com.zayzou.jcp.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Point4 {
    private int x, y;

    public Point4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static void traiteList(List<Point4> list,
                           Predicate<Point4> selection,
                           Comparator<Point4> comparator,
                           Consumer<Point4> affichage) {
        List<Point4> temp = new ArrayList<>();

        list.forEach(e -> {
            if (e.getX() > 0) {
                temp.add(e);
            }
        });

        temp.sort(comparator);
        temp.forEach(Point4::affiche);
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

public class Exercice171 {

    public static void main(String[] args) {
        Point4[] tab = {new Point4(2, 5), new Point4(-3, 4),
                new Point4(2, 3), new Point4(6, -3)};
        ArrayList<Point4> l = new ArrayList<Point4>();
        Collections.addAll(l, tab);

        Point4.traiteList(
                l,
                p -> p.getX() > 0,
                Comparator.comparing(Point4::getX),
                Point4::affiche
        );
    }
}
