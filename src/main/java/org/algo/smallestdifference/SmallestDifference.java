package org.algo.smallestdifference;

import java.util.Arrays;

/*
 time : O(nlog(n) + mlog(m)
 space : O(1) space
 */
public class SmallestDifference {

    public int[] find(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int idxOne = 0;
        int idxTwo = 0;
        int smallestDiff = Integer.MAX_VALUE;
        int currentDiff = Integer.MAX_VALUE;
        int[] smallestPair = new int[0];

        while(idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];

            if(firstNum < secondNum) {
                currentDiff = secondNum - firstNum;
                idxOne++;
            } else if(secondNum < firstNum) {
                currentDiff = firstNum - secondNum;
                idxTwo++;
            } else {
                return new int[]{firstNum,secondNum};
            }

            if(smallestDiff > currentDiff) {
                smallestDiff = currentDiff;
                smallestPair = new int[]{firstNum,secondNum};
            }
        }

        return smallestPair;
    }
}
