package org.example.twonumbersum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {


    /*
        O(n) time
        O(n) space
     */
    public int[] findWithHashMap(final int[] array, final int targetSum) {
        final var numbersMap = new HashMap<>();

        for(var number : array) {
            final var diff = targetSum - number;
            if(numbersMap.containsKey(diff)) {
                return new int[]{diff,number};
            } else {
                numbersMap.put(number,null);
            }
        }

        return new int[]{};
    }

    /*
        O(n) time
        O(1) space
     */
    public int[] sortAndFind(int[] array, int targetSum) {
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

    /*
        O(n^2) time
        O(n^2) space
     */
    public int[] bruteForce(final int[] numbers, final int targetSum) {
        final var numbersArrayLength = numbers.length;

        for(var i=0;i<numbersArrayLength;i++) {
            for(var j=i+1;j<numbersArrayLength;j++) {
                if(numbers[i] + numbers[j] == targetSum) {
                    return new int[]{numbers[i],numbers[j]};
                }
            }
        }

        return new int[]{};
    }


    }
