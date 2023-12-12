package com.zayzou.jcp.lambdas;

interface Distanciable {
    int distance(Point p1, Point p2);
}

interface DistanciableDe {
    int distance_a(Point p1);
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distance1(Point p) {
        return p.x - this.x;
    }

    public int distance2(Point p) {
        return p.y - this.y;
    }

    public int distance(Point p) {
        return p.x - this.x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class RefMethClasse {

    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(3, 8);
        Distanciable dis = (p11, p21) -> p21.getX() - p11.getX();
        System.out.println("distance entre p1 et p2 = " + dis.distance(p1, p2));
        Distanciable dis1 = Point::distance1;
        System.out.println("distance entre p1 et p2 = " + dis1.distance(p1, p2));
        Distanciable dis2 = Point::distance2;
        System.out.println("distance entre p1 et p2 = " + dis2.distance(p1, p2));


        //Reference a une methode associe à un objet
        System.out.println("========================");
        DistanciableDe de = p1::distance1;

        System.out.println("distance entre p1 et p2 = " + de.distance_a(p2));


    }

}
