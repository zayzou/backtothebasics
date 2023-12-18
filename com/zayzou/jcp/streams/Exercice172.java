package com.zayzou.jcp.streams;

import java.util.stream.IntStream;

public class Exercice172 {
    public static void main(String args[]) {
        int[] tab = {3, 5, -3, 8, 12, 4, 7, 4, 8, 3};
        long nb = IntStream.of(tab)
                .filter(xx -> xx > 0)
                .count();
        System.out.println("nb = " + nb);//9
        IntStream.of(tab)
                .filter(xx -> xx > 3)
                .sorted()
                .forEach(xx -> System.out.print(xx + " ")); //4,4,5,7,8,8,12
        System.out.println();//
        IntStream.of(tab)
                .filter(xx -> xx > 3)
                .sorted()
                .distinct()
                .forEach(xx -> System.out.print(xx + " ")); //4,5,7,8,12
        System.out.println();
        int s = IntStream.of(tab)
                .map(xx -> Math.abs(xx)) //3, 5, 3, 8, 12, 4, 7, 4, 8, 3
                .map(xx -> xx * xx)
//                .peek(value -> System.out.print(value + " "))
                .sum();//9, 25, 9, 64, 12, 16, 49, 16, 64, 9
        System.out.println("\nresultat = " + s);
    }
}


