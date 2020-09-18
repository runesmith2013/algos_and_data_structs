package com.rob.algo.dynamic;

public class Fibonacci {

    //--
    static int naiveFibonacci (int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;

        return naiveFibonacci(i-1) + naiveFibonacci(i - 2);
    }

    static int memoFibonnaci(int n) {
        return memoFibonnaci(n, new int[n+1]);
    }

    static int memoFibonnaci(int i, int[] memo) {
        if ( i == 0) return 0;
        if (i == 1) return 1;

        if (memo[i] == 0) {
            memo[i] = memoFibonnaci(i -1, memo) + memoFibonnaci( i -2, memo);
        }
        return memo[i];

    }

    static int bottomUpFib( int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i < n ; i++) {
            memo[i] = memo[i -1] + memo [i - 2];

        }
        return memo[n -1] + memo[n -2];
    }

    static int efficientBottomUpFib(int n) {
         if (n == 0) return 0;

         int a = 0;
         int b = 1;
         for (int i = 2; i < n; i++) {
             int c = a + b;
             a = b;
             b = c;
         }
         return a + b;
    }


    public static void main(String[] args) {
        System.out.println(naiveFibonacci(10));

        System.out.println(memoFibonnaci(30));
        System.out.println(bottomUpFib(40));
        System.out.println(efficientBottomUpFib(10000));


    }

}
