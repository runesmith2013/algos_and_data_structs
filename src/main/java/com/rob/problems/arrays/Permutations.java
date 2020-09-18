package com.rob.problems.arrays;


import java.util.Map;
import java.util.HashMap;


public class Permutations {


    public static boolean isPermutation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        for (Character ch : s1.toCharArray()) {
            charCounts.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }

        for (Character ch : s2.toCharArray()) {
            charCounts.compute(ch, (k, v) -> v == null ? -1 : v - 1);
        }

        return !charCounts.values().stream().anyMatch(value -> {
            System.out.println(value);
            return value != 0;
        });

    }

    public static void main(String[] args) {
        String t1 = "taco";
        String t2 = "otac";

        System.out.println(isPermutation(t1, t2));

        t1 = "hello";
        t2 = "submarine";
        System.out.println(isPermutation(t1, t2));

        t1 = "hello";
        t2 = "pello";
        System.out.println(isPermutation(t1, t2));

    }


}
