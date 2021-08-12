package org.example.twonumbersum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {


    /*
        O(n) time & space
     */
    public Result find(int[] array, int targetSum) {
        final Map<Integer,Integer> numbersMap = new HashMap<>();

        for(int number : array) {
            int diff = targetSum - number;
            if(numbersMap.containsKey(diff)) {
                return new Result(diff,number);
            } else {
                numbersMap.put(number,null);
            }
        }

        return new Result(0,0);
    }

    public Result find2(int[] array, int targetSum) {
        Arrays.sort(array);
        int leftPointer = 0;
        int rightPointer = array.length -1;

        while(leftPointer < rightPointer) {
            int currentSum = array[leftPointer] + array[rightPointer];

            if(currentSum == targetSum) {
                return new Result(array[leftPointer],array[rightPointer]);
            } else if (currentSum < targetSum) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return new Result(0,0);
    }

}
