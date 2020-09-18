package com.rob.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueString {

    public static boolean isUnique(String testString) {
        Set<Character> chars = new HashSet<>();

            for (Character ch: testString.toCharArray()) {
                if (chars.contains(ch)) {
                    System.out.println("Duplicate is " + ch);
                    return false;
                } else {
                    chars.add(ch);
                }
            }
            return true;
    }

    public static void main(String[] args) {
        String test = "thequickbrownfox";
        System.out.println(isUnique(test));


        String test1 = "unique";
        System.out.println(isUnique(test1));

        String test2 = "blahblah";
        System.out.println(isUnique(test2));

    }


}
