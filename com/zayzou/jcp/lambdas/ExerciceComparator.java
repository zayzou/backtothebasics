package com.zayzou.jcp.lambdas;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


class Point3 implements Comparable<Point3> {
    private int x, y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static void traiteListe(List<Point3> liste,
                            Predicate<Point3> selection,
                            Comparator<Point3> tri,
                            Consumer<Point3> affichage
    ) {
        List<Point3> l = new ArrayList<>();
        liste.forEach(e -> {
            if (selection.test(e)) l.add(e);
        });

        l.sort(tri);

        l.forEach(affichage);
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

    @Override
    public int compareTo(Point3 p) {
        return Integer.compare(this.x, p.getY());
    }


}

public class ExerciceComparator {

    public static void main(String[] args) {
        List<Point3> points = new ArrayList<>(List.of(new Point3(2, 5), new Point3(-3, 4),
                new Point3(2, 3), new Point3(6, -3)));

        Point3.traiteListe(
                points,
                point3 -> point3.getX() > 0,
                Comparator.comparing(Point3::getX),
                Point3::affiche);


        System.out.println();
        Point3.traiteListe(
                points,
                point3 -> true,
                Comparator.comparingInt(p -> (p.getX() + p.getY())),
                e -> System.out.print("(" + e.getX() + "," + e.getY() + ") "));
    }


}
