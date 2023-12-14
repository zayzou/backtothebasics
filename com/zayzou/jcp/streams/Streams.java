package com.zayzou.jcp.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

/*
        //source d'un Stream

        //à partir d'une collection :
        List<Integer> list = List.of(1, 2, 4, 5, 67, 7, 53, 2);
        list.stream().limit(1).forEach(System.out::println);

        //à partir d'une liste de valeur
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 73, 2, 67, 8);
        int[] tab = {1, 4, 6, 89, 9, 98, 6, 54, 32};
        IntStream intStream1 = IntStream.of(tab);

        //avec la fonction generate
        Stream.generate(() -> "Bonjour")
                .limit(1)
                .forEach(System.out::println);

        DoubleStream.generate(Math::random)
                .limit(1)
                .forEach(System.out::println);

        //à partir d'une methode iterative
        Stream.iterate(0, (e -> e + 2))
                .limit(4)
                .forEach(System.out::println);
        IntStream.range(0, 4).forEach(System.out::print);
        System.out.println();
        IntStream.rangeClosed(0, 4).forEach(System.out::print);
        System.out.println();

        //creation d'un stream parallel
        Stream.of(1, 3, 4, 5).parallel().forEach(System.out::println);
*/

        //à partir d'un flux ou une autre source
        try {
            String file = "/Users/z.soffi/Documents/Personel/my_devs/basics/com/zayzou/jcp/file";
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.lines()
//                    .parallel()
                    .filter((l) -> l.contains("z"))
                    .map(l -> l.replace("z", "Z"))
                    .forEachOrdered(System.out::println);
        } catch (Exception e) {

        }


    }
}
