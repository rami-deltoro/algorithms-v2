package org.example.twonumbersum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {


    /*
        O(n) time & space
     */
    public int[] find(int[] array, int targetSum) {
        final var numbersMap = new HashMap<>();

        for(int number : array) {
            final var diff = targetSum - number;
            if(numbersMap.containsKey(diff)) {
                return new int[]{diff,number};
            } else {
                numbersMap.put(number,null);
            }
        }

        return new int[]{};
    }

    public int[] find2(int[] array, int targetSum) {
        Arrays.sort(array);
        var leftPointer = 0;
        var rightPointer = array.length -1;

        while(leftPointer < rightPointer) {
            var currentSum = array[leftPointer] + array[rightPointer];

            if(currentSum == targetSum) {
                return new int[]{array[leftPointer],array[rightPointer]};
            } else if (currentSum < targetSum) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return new int[]{};
    }

    public int[] find3(int[] array, int targetSum) {
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i] + array[j] == targetSum) {
                    return new int[]{array[i],array[j]};
                }
            }
        }

        return new int[]{};
    }



    }
