package com.zayzou.jcp;


import java.util.*;

record Point(int x, int y) implements Comparable<Point> {

    @Override
    public int compareTo(Point p) {
        if (this.x < p.x) return -1;
        else if (this.x == p.x) return 0;
        else return 1;
    }
}

public class CollectionsAlgorithms {

    static Point p1 = new Point(1, 3);
    static Point p2 = new Point(2, 1);
    static Point p3 = new Point(5, 2);
    static Point p4 = new Point(3, 2);

    static LinkedList<Point> llp = new LinkedList<>(List.of(p1, p2, p3, p4));

    public static void main(String[] args) {
        Point max = Collections.max(llp);
        System.out.println("Max suivant l'ordre defini par compareTo de Point" + max);
        //Point max1 = Collections.max(llp, (Point p1, Point p2) -> p1.y() - p2.y());

        ArrayList<Integer> numbers = new ArrayList<>(List.of(4, 9, 2, 3, 6, 1, 0, -1, 8, 7));

        System.out.println("numbers before sort = " + numbers);
        Collections.sort(numbers);
        System.out.println("numbers after sort = " + numbers);
        numbers.sort((e1, e2) -> -1 * (e1 - e2));

        Collections.shuffle(numbers);
        System.out.println("numbers after shuffle = " + numbers);

        Collections.sort(numbers, (e1, e2) -> -1 * (e1 - e2));
        System.out.println("numbers after sort using custom comparator = " + numbers);
        //Collections.sort(numbers, (e1, e2) -> -1 * (e1 - e2)); | numbers.sort(Collections.reverseOrder());


    }


}
