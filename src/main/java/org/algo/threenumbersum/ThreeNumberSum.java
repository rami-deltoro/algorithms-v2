package org.algo.threenumbersum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
O(n^2) time
O(n) space
 */
public class ThreeNumberSum {


    public List<Integer[]> calculate(int[] array,int target) {
        Arrays.sort(array);
        final List<Integer[]> triplets = new ArrayList<>();

        for (var i=0;i<array.length-2;i++) {
            var leftIndex = i+1;
            var rightIndex = array.length-1;

            while(leftIndex < rightIndex) {
                var currentSum = array[i] + array[leftIndex] + array[rightIndex];

                if(currentSum==target) {
                    triplets.add(new Integer[]{array[i],array[leftIndex],array[rightIndex]});
                    leftIndex++;
                    rightIndex--;
                } else if(currentSum < target) {
                    leftIndex++;
                } else {
                    rightIndex--;
                }
            }
        }

        return triplets;

    }
}
