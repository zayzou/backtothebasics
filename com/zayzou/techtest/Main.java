package com.zayzou.techtest;

import java.util.*;


public class Main {


    public static long countVoywels(String str) {

        if (Objects.isNull(str) || str.isBlank()) {
            return -1;
        }
        //as suggested I used a set to stock the vowel
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        String strVowels = "aeiouy";
        //I discovered that String objects have access to a method that returns an intStream
        //I used it to filter the string in order to return only the vowels and i returned the count
        return str.chars().filter(c -> vowels.contains((char) c)).count();
//
    }


    //getting n elements with  highest frequency in an array
    public static List<Integer> frequences(int[] nums, int n) {


        if (nums.length < n) {
            throw new IndexOutOfBoundsException("n must not be greater than the length of nums");
        }
        //as suggested I used one way iteration to stock the frequencies of each element
        //     < nums[i], frequence>
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //if the element is new then put 0 else increment the old value
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        //to get the n most frequent element i iterated throuw the map entries using a stream
        //i sorted the map by reverse order to get the hiset values at the top
        //after that i limited the result to n and returned as list of entries<key,values>
        //to get only the values and eliminate the keys i used map to convert the return only the keys

        List<Integer> result =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(n)
                        .toList()
                        .stream()
                        .map(e -> e.getKey()).toList();


//        integerIntegerEntry.stream()
//                .map(e -> e.getValue()).toList();


        return result;
    }


    public static void main(String[] args) {

//        System.out.println(countVoywels(""));

        int[] nums = {1, 1, 3, 3, 3, 2, 2, 1};
        int n = 2;
        System.out.println(frequences(nums, n));

    }
}
