package com.rob.problems.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class Removals {

    // Add any helper functions you may need here

    class Tracker {
        int val;
        int position;

        public Tracker(int val, int position) {
            this.val = val;
            this.position = position;
        }
    }


    int[] findPositions(int[] arr, int x) {
        // Write your code here
        int[] results = new int[x];

        Queue<Tracker> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++ ){
            Tracker tracker = new Tracker(arr[i], i+1);
            queue.add(tracker);
        }

        for (int count = 0; count < x ; count++) {
            int max = 0;
            int toRemove = 0;
            int queuesize = queue.size();
            List<Tracker> elements = new ArrayList<>();
            for (int i = 0; i < x && i < queuesize; i++) {

                //-- pop x elements from the front of the queue
                Tracker tracker = queue.remove();
                if (tracker.val > max) {
                    max = tracker.val;
                    toRemove = i;
                }
                elements.add(tracker);

            }

            //-- remove largest
            int position = elements.get(toRemove).position;
            results[count] = position;
            elements.remove(toRemove);

            //-- decrement by 1
            for (Tracker t : elements) {
                t.val--;
            }

            //-- push back to the queue
            for (Tracker t : elements) {
                queue.add(t);
            }
        }
        return results;
    }












    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom, but they are otherwise not editable!
    int test_case_number = 1;
    void check(int[] expected, int[] output) {
        int expected_size = expected.length;
        int output_size = output.length;
        boolean result = true;
        if (expected_size != output_size) {
            result = false;
        }
        for (int i = 0; i < Math.min(expected_size, output_size); i++) {
            result &= (output[i] == expected[i]);
        }
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        }
        else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printIntegerArray(expected);
            System.out.print(" Your output: ");
            printIntegerArray(output);
            System.out.println();
        }
        test_case_number++;
    }
    void printIntegerArray(int[] arr) {
        int len = arr.length;
        System.out.print("[");
        for(int i = 0; i < len; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }

    public void run() {
        int n_1 = 6;
        int x_1 = 5;
        int[] arr_1 = {1, 2, 2, 3, 4, 5};
        int[] expected_1 = {5, 6, 4, 1, 2 };
        int[] output_1 = findPositions(arr_1, x_1);
        check(expected_1, output_1);

        int n_2 = 13;
        int x_2 = 4;
        int[] arr_2 = {2, 4, 2, 4, 3, 1, 2, 2, 3, 4, 3, 4, 4};
        int[] expected_2 = {2, 5, 10, 13};
        int[] output_2 = findPositions(arr_2, x_2);
        check(expected_2, output_2);

        // Add your own test cases here

    }

    public static void main(String[] args) {
        new Removals().run();
    }

}
