package com.zayzou.extra.divers;


class Point {
    private char nom;
    private double abs;

    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abs = abscisse;
    }

    public void affiche() {
        System.out.println("(" + this.abs + " : " + this.nom + ")");
    }

    public void translate(double dx) {
        this.abs += dx;
    }

}

public class Exercice24 {

    public static void main(String[] args) {
        Point p = new Point('c', 3);
        p.affiche();
        p.translate(4);
        p.affiche();
    }
}
