package com.zayzou.extra.divers;

import java.util.*;

public class Strings {
    public static int countDuplicates(String str) {
        Set<Character> duplicatesSet = new HashSet<>();
        for (int i = 0; i < str.length() - 1; i++) {
            char current = str.charAt(i);
            if (!duplicatesSet.contains(current)) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (current == str.charAt(j)) {
                        duplicatesSet.add(current);
                    }
                }
            }
        }
        return duplicatesSet.size();
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        if (str.isBlank() && str == null) {
            return Character.MIN_VALUE;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int occurence = 0;
            for (int j = 0; j < str.length(); j++) {
                if (c == str.charAt(j) && i != j) {
                    occurence++;
                    break;
                }
            }
            if (occurence == 0) {
                return c;
            }

        }
        return Character.MIN_VALUE;
    }


    public static String reverseLetters(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("parameter must not be empty !");

        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseLettersV2(String str) {
        char[] reversed = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            reversed[i] = str.charAt(str.length() - 1 - i);
        }
        return String.valueOf(reversed);
    }


    public static String reverseWordsV1(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return "";
        }

        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {

            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(" ");
        }

        return reversedString.toString();
    }

    public static boolean containsOnlyDigits(String str) {
        if (str == null || str.isBlank()) {
            return false;
        }
        return str.matches("[0-9]+");
    }

    public static void countingVowelsConsonants(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException();
        }
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        int countVowels = 0;
        int countConsonants = 0;
        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> countVowels++;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' ->
                        countConsonants++;
            }
        }
        System.out.println("Number of vowels = " + countVowels);
        System.out.println("Number of consonants = " + countConsonants);

    }

    public static void countingVowelsConsonantsV2(String str) {

        Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        str = str.toLowerCase();
        int countV = 0;
        int countC = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (allVowels.contains(c)) {
                countV++;
            } else if (c >= 'a' && c <= 'z') {
                countC++;
            }
        }
        System.out.println("Number of vowels = " + countV);
        System.out.println("Number of consonants = " + countC);

    }


    public static int[] twoSum(int[] nums, int target) {
        boolean result = false;
        int[] output = new int[2];
        if (Objects.isNull(nums)) {
            return output;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    result = true;
                }
            }
            if (result) {
                return output;
            }
        }
        return output;
    }

    public static void main(String[] args) {
//        String text = "Be strong, be fearless, be beautiful";
        String text = "soffi zahir is a software developper";
//        System.out.println(text);
//        System.out.println(reverseLetters(text));
//        System.out.println(reverseWordsV1(text));
//        System.out.println(containsOnlyDigits("2023"));
//        countingVowelsConsonants(text);
//        countingVowelsConsonantsV2(text);
//        String s=null;

        int[] nums = {23, 7, 11, 15};
        int target = 9;
        int[] sum = twoSum(nums, target);
        System.out.println(sum[0] + "," + sum[1]);

    }
}
