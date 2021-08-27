package org.algo.threenumbersum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
O(n^2) time
O(n) space
 */
public class ThreeNumberSum {


    public List<Triplet> calculate(int[] array,int target) {
        Arrays.sort(array);
        final List<Triplet> triplets = new ArrayList<>();

        for (int i=0;i<array.length-2;i++) {
            int left = i+1;
            int right = array.length-1;

            while(left < right) {
                int currentSum = array[i] + array[left] + array[right];

                if(currentSum==target) {
                    triplets.add(new Triplet(array[i],array[left],array[right]));
                    left++;
                    right--;
                } else if(currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return triplets;

    }
}
