package com.zayzou.extra.divers;


class Point3 {
    private double x; // abscisse
    private double y; // ordonnee

    public Point3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double abscisse() {
        return x;
    }

    public double ordonnee() {
        return y;
    }

    public void hemothetie(double dx) {
        this.x *= dx;
        this.y *= dx;
    }


}

public class Exercice42 {

}
