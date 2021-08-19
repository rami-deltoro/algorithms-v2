package org.example.maxsubset;

import java.util.Arrays;

public class MaxSubset {

        /*
    O(n) time
    O(1) space
     */
    public int find2(int[] array) {
        if(array.length <1) {
            return 0;
        } else if(array.length == 1) {
            return array[0];
        }

        int second = array[0];
        int first = Math.max(array[0],array[1]);

        for(int i=2;i<array.length;i++) {
            int current = Math.max(first,second+array[i]);

            second = first;
            first = current;
        }

        return first;


    }
    /*
    O(n) time
    O(n) space
     */
    public int find(int[] array) {
        if(array.length <1) {
            return 0;
        } else if(array.length == 1) {
            return array[0];
        }

        int[] maxSums = new int[array.length];
        maxSums[0] = array[0];
        maxSums[1] = Math.max(array[0],array[1]);

        for(int i=2;i<array.length;i++) {
            maxSums[i] = Math.max(maxSums[i-1],maxSums[i-2]+array[i]);
        }

        return maxSums[array.length-1];
    }
}
