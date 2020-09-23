package com.rob.datastruct.recursive;

import java.util.Arrays;

public class TripleStep {

    private static int counter;

    static void countPermutations(int n) {
        counter ++;
        if (n <= 0 ) {
           return;
        }

        if (n > 1) {
            countPermutations(n - 1);
        }

        if (n >= 2) {
            countPermutations(n - 2);
        }
        if (n >= 3) {
            countPermutations(n - 3);
        }
    }

    static int countWays(int n) {
        int[] memo = new int[n +1] ;
        Arrays.fill(memo, -1);

        return countWays (n, memo);
    }

    static int countWays (int n, int [] memo) {
        if (n < 0) {
            return 0;
        } else if (n ==0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = countWays(n-1, memo)+ countWays (n-2, memo)+ countWays (n-3, memo);
            return memo[n];
        }
    }


    public static void main(String[] args) {
        //countPermutations(37);
        System.out.println(countWays(37));
       // System.out.println(counter);
    }




}
