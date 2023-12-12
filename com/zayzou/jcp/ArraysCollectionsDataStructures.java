package com.zayzou.jcp;

import java.util.*;


record Melon(String type, double weight) {
}

class Fruit
        implements Comparable<Fruit> {

    private String name;
    private float weight;

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Fruit o) {
        return (int) (this.weight - o.weight);
    }

}

public class ArraysCollectionsDataStructures {

    public static int compare(int x, int y) {
        return x - y;
    }


    public static void main(String[] args) {

        Fruit banana = new Fruit("banana", 34.f);
        Fruit ananas = new Fruit("ananas", 54.f);

        if (banana.compareTo(ananas) < 0) {
            System.out.println(banana.getName() + " est inférieur à " + ananas.getName());
        } else if (banana.compareTo(ananas) > 0) {
            System.out.println(banana.getName() + " est superieur à " + ananas.getName());
        } else {
            System.out.println(banana.getName() + " est égale à " + ananas.getName());
        }

        System.out.println("string".compareTo("strings"));
        Comparator<Fruit> fruitComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        int[] nums = {1, 4, 6, 7, 8, 43, 5, 7, 3, 21, 46};
/*        Melon[] melons = {
                new Melon("Red One", 34),
                new Melon("Blue One", 23.5),
                new Melon("Juicy One", 44),
        };

        Melon[] melons2 = {
                new Melon("Pastek One", 28.3),
                new Melon("Juicy One", 44),
        };*/

        List<Melon> melonList = new ArrayList<>();
        melonList.add(new Melon("Red One", 34));
        melonList.add(new Melon("Blue One", 23.5));
        melonList.add(new Melon("Juicy One", 44));


        Collection<Melon> melonCollection = new ArrayList<>();
        melonCollection.add(new Melon("Pastek One", 28.3));
        melonCollection.add(new Melon("Juicy One", 44));

        //addall E U F | removeAll E - F | retailAll E & F
        melonList.retainAll(melonCollection);
        melonList.forEach(melon -> System.out.println(melon));
        System.out.println(melonList.size());
        System.out.println(melonCollection.contains(new Melon("Not Juicy One", 44)));
        System.out.println(melonCollection.toString());

       /* ListIterator<Melon> it;
        it = melonList.listIterator();
        while (it.hasNext()) {
            it.next();
            if (it.hasPrevious()) {
                System.out.println(it.previous().type());
                it.next();
            }
        }*/


//        Arrays.sort(melons, Comparator.comparingDouble(Melon::weight));
//       Arrays.sort(melons, (Melon o1, Melon o2) -> Double.compare(o1.weight(), o2.weight()));
//             new Comparator<Melon>() {
//            @Override
//            public int compare(Melon o1, Melon o2) {
//                return (int) (o1.weight() - o2.weight());
//            }
//        });

      /*  for (Melon melon : melons) {
            System.out.println(melon);
        }*/


//        Arrays.sort(nums);
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }

        /*System.out.println(Arrays.toString(nums));

        Arrays.fill(nums, -1);
        System.out.println(Arrays.toString(nums));*/
    }
}
