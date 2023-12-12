package com.zayzou.jcp.lambdas;

import java.util.function.*;

@FunctionalInterface
interface Calculator {
    static void staticMethod() {
        System.out.println("static method");
    }

    int calculate(int n);

    default void defaultMethod() {
        System.out.println("default method");
    }

    default void def2() {
        System.out.println("another def one");
    }
}

public class Lambdas {

    public static void main(String[] args) {
        int n = 3;
        Calculator carre = new Calculator() {
            @Override
            public int calculate(int n) {
                return n * n;
            }
        };
        int res = carre.calculate(n);
        System.out.println("using traditional anon class: " + res);

        Calculator doubleIt = e -> e * 2;
        System.out.println("using lambda with anon class: " + doubleIt.calculate(4));

        trait(5, x -> x * x);
        trait(5, Lambdas::caree1);

        //using standard functional interfaces:
        caree2(4, e -> e * e);
        polynom(8, e -> 2 * e * e + 3 * e + 5);
        isPositif(-1, e -> e > 0);
        isPositif(1, e -> e > 0);
        showMessage("zayzou", s -> System.out.println("Hi " + s + " 👋🏻"));

    }


    public static void trait(int n, Calculator calc) {
        System.out.println(calc.calculate(n));
    }

    public static int caree1(int n) {
        return n * n;
    }

    public static void caree2(int n, IntUnaryOperator intUnaryOperator) {
        System.out.println("using IntUnaryOperator: " + intUnaryOperator.applyAsInt(n));
    }

    public static void polynom(int n, UnaryOperator<Integer> unaryOperator) {
        System.out.println("using UnaryOperator<T>: " + unaryOperator.apply(n));
    }

    public static void isPositif(int n, IntPredicate predicate) {
        if (predicate.test(n)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    public static void showMessage(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }
}
