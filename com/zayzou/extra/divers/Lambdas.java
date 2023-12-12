package com.zayzou.extra.divers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

enum Gender {
    MALE, FEMALE
}

class Person {
    private String name;
    private Gender gender;
    private int age;

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.gender + " " + this.age;
    }
}

public class Lambdas {


    public static void main(String[] args) {
    /*    Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("From the thred");
            }
        });*/
        Thread th = new Thread(() -> System.out.println("From thread 2"));
        th.start();
        System.out.println("From main");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        //external iterator
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }
        System.out.println();

        //enhanced for loop
        for (int n : numbers) {
            System.out.print(n);
        }
        System.out.println();

        //internal iterator
        numbers.forEach(n -> System.out.print(n));
        System.out.println();
        numbers.forEach(System.out::print);

        //double the even numbers and total;

        System.out.println();
        int sum = numbers.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum();
        System.out.println(sum);


        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6);

        //double the even numbers and save to list;

        Set<Integer> doubleOfEven =
                numbers2.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .collect(Collectors.toSet());
//                        .collect(Collectors.toList());
        System.out.println(doubleOfEven);
        System.out.println("============");
        List<Person> people = createPeople();
        people.forEach(System.out::println);

        //create a map of people with name and age as key and person as value
        System.out.println(
                people.stream()
                        .collect(toMap(
                                person -> person.getName() + "-" + person.getAge(),
                                person -> person
                        )));

        //create a map with key is name and value all people with that name
        System.out.println(
                people.stream()
                        .collect(groupingBy(person -> person.getName())));


        //create a map with key is name and value the ages of that people
        System.out.println(
                people.stream()
                        .collect(groupingBy(Person::getName,
                                mapping(person -> person.getAge(), toList()))));

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);


        //find the double of the first even number greater than 3
        //imperative style:
        int result = 0;
        for (int e : numbers3) {
            if (e % 2 == 0 && e > 3) {
                result = e * 2;
                break;
            }
        }
        System.out.println(result);

        //with lambdas and stream
        System.out.println(numbers3.stream()
                .filter(Lambdas::isGT3)
                .filter(Lambdas::isEven)
                .map(Lambdas::doubleIt)
                .findFirst());

        //changing characteristic of a stream
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        numbers4.stream()
                .filter(Lambdas::isEven)
                .sorted()
                .distinct()
                .forEach(System.out::println);


        //infinite stream:
        //basic example ?
//        System.out.println(Stream.iterate(100, e -> e + 1));
        int k = 121, n = 51;
        int total = 0;
        int count = 0;
        while (count < n) {
            if (k % 2 == 0 && Math.sqrt(k) > 20) {
                total += k * 2;
                count++;
            }
            k++;
        }

        System.out.println(total);
        k = 121;
        n = 51;
        //using infinite stream
        System.out.println(Stream.iterate(k, e -> e + 1)
                .filter(Lambdas::isEven)
                .filter(e -> Math.sqrt(e) > 20)
                .mapToInt(e -> e * 2)
                .limit(n)
                .sum()
        );
    }

    //create reference methods
    public static boolean isGT3(int n) {
        return n > 3;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int doubleIt(int n) {
        return n * 2;
    }

    public static List<Person> createPeople() {
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("Sara", Gender.FEMALE, 22),
                new Person("Bob", Gender.MALE, 20),
                new Person("Bob", Gender.MALE, 40),
                new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32),
                new Person("Jack", Gender.MALE, 2),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jill", Gender.FEMALE, 12)
        );
    }

}


