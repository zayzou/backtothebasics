package com.zayzou.extra.divers;


/*
    Modifier la définition de la classe Point en supprimant la méthode affiche et en introduisant
    deux méthodes d’accès nommées abscisse et ordonnee fournissant respectivement l’abscisse
    et l’ordonnée d’un point. Adapter la méthode main en conséquence.
    */
class Point2 {
    private double x; // abscisse
    private double y; // ordonnee

    public Point2(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double abscisse() {
        return x;
    }

    public double ordonnee() {
        return y;
    }
}

public class Exercice27 {
    public static void main(String args[]) {
        Point2 a;
        a = new Point2(3, 5);
        System.out.println(a.abscisse() + "," + a.ordonnee());
        a.deplace(2, 0);
        System.out.println(a.abscisse() + "," + a.ordonnee());
        Point2 b = new Point2(6, 8);
        System.out.println(b.abscisse() + "," + b.ordonnee());
    }
}

