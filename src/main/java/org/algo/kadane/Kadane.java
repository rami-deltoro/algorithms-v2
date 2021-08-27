package org.algo.kadane;

/**
 *  Input :  Array of integer values
 *  Goal : Find the largest sum in any sublist in the input array
 */
public class Kadane {

    public int calculate(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];

        for(int i=1;i<array.length;i++) {
            maxEndingHere = Math.max(array[i],maxEndingHere);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }

        return maxSoFar;
    }
}
