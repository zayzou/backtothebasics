package com.zayzou.extra.divers.interview;

import java.util.ArrayList;
import java.util.List;

public class Boxing {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        //convert a primitive to Wrapper class is auto-boxing
        integers.add(3);
        integers.add(4);
        //convert a Wrapped object into primitive type is unboxing
        int x = integers.get(0);

//        long i = 45l;
//        switch (i){
//
//        }
    }
}
