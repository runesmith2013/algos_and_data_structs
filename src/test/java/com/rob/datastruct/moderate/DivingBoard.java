package com.rob.datastruct.moderate;

import java.util.HashSet;

public class DivingBoard {


    public static void printAllLengths(int k) {

        for (int i = 0 ; i < k ; i++) {
            System.out.println("Shorter: " + i +" longer:" + (k - i));
            System.out.println("longer: " + i +" shorter:" + (k - i));

        }

    }

    HashSet<Integer> allLengths(int k, int shorter, int longer) {
         HashSet<Integer> lengths = new HashSet<>();
         getAllLengths(k,0,shorter, longer, lengths);
         return lengths;
    }

    void getAllLengths(int k, int total, int shorter, int longer, HashSet<Integer> lengths) {
        //-- break clause
        if (k == 0) {
            lengths.add(total);
            return;
        }

        getAllLengths(k -1, total + shorter, shorter, longer, lengths);
        getAllLengths(k -1, total + longer, shorter, longer, lengths);

    }


    public static void main(String[] args) {
        printAllLengths(5);;
    }


}
