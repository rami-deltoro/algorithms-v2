package org.example.fournumbersum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 O(N^2) time
 O(N^2) space
 */
public class FourNumberSum {


    public List<Quadruplet>  findQuadruplets(int[] array, int targetSum) {
        final Map<Integer, List<Integer[]>> allPairSums = new HashMap<>();
        final List<Quadruplet> quadruplets = new ArrayList<>();

        for(int i=1;i<array.length-1;i++) {
            for(int j=i+1;j<array.length;j++) { //add quadruplets by looking at i pointer and forward
                int currentSum = array[i] + array[j];
                int difference = targetSum - currentSum;
                if(allPairSums.containsKey(difference)) {
                    for (Integer[] pair : allPairSums.get(difference)) {
                        quadruplets.add(new Quadruplet(array[i],array[j],pair[0],pair[1]));
                    }
                }
            }
            for(int k=0;k<i;k++) {                 //add pairs to hashmap by looking at i and before
                int currentSum = array[i] + array[k];
                final List<Integer[]> pairs = allPairSums.getOrDefault(currentSum,new ArrayList<>());
                pairs.add(new Integer[]{array[k],array[i]});
                allPairSums.put(currentSum,pairs);
            }
        }

        return quadruplets;
    }


}
