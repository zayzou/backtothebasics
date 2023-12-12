package com.zayzou.jcp;

import java.util.*;

public class HashTreeMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] keys = {"a", "z", "e", "r", "t"};
        int[] values = {3, 6, 1, -2, 5};
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

//        Integer integer = map.containsKey("a") ? map.get("a") : -1;//check if key exists
        Integer integer = map.getOrDefault("a", -1);
        System.out.println(integer + " exists on the map");

        Integer i = map.remove("r");
        System.out.println(i + " has been removed from the map");

        map.putIfAbsent("r", 30);
        System.out.println(map);
        boolean b = map.containsValue(30);
        System.out.println("does map contains value 30 ? " + (b ? "yes !" : "no"));

        Set<String> keySet = map.keySet();
        System.out.println("keys : " + keySet);
        Collection<Integer> collection = map.values();
        System.out.println("values : " + collection);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry);
        }


    }
}
