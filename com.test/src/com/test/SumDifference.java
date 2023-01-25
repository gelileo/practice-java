package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class SumDifference {

    public static String desc() {
        return """
                Sum the differences between consecutive pairs in the array in descending order.
                Example
                                
                  [2, 1, 10]  -->  9
                  In descending order: [10, 2, 1]
                                
                  Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
                                
                  If the array is empty or the array has only one element the result should be 0.
                """;
    }

    public static void run() {
        int[] input = {1,2,10};
        System.out.println("Sum of diffs of " + Arrays.toString(input) + " is: " + String.valueOf(sumOfDifferences(input)) );
    }

    private static int sumOfDifferences(int[] arr) {

        if (arr.length <= 1) {
            return 0;
        }

        Integer[] boxedArray = Arrays
                .stream(arr)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(boxedArray, Collections.reverseOrder());
//        System.out.println(Arrays.toString(boxedArray));
//        Optional<Integer> ret = Arrays.stream(boxedArray).reduce( (v1, v2) -> v1-v2);
//        return ret.map(Integer::intValue).orElse(0);

        // it's always the difference of the 1st substract by the last element"
        return boxedArray[0] - boxedArray[arr.length-1];
    }
}
