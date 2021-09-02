package org.algo.smallestdifference;

import java.util.Arrays;

/*

Find the two closest numbers
 time : O(nlog(n) + mlog(m)
 space : O(1) space


 naive : two for loops - keep track of diff

take advantage of sorting


 */
public class SmallestDifference {

    public int[] find(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        var indexArrayOne = 0;
        var indexArrayTwo = 0;
        var smallestDiff = Integer.MAX_VALUE;
        var currentDiff = Integer.MAX_VALUE;
        var smallestPair = new int[0];
        final var arrayOneLength = arrayOne.length;
        final var arrayTwoLength = arrayTwo.length;

        while(indexArrayOne < arrayOneLength && indexArrayTwo < arrayTwoLength) {
            int firstNum = arrayOne[indexArrayOne];
            int secondNum = arrayTwo[indexArrayTwo];

            if(firstNum < secondNum) {
                currentDiff = secondNum - firstNum;
                indexArrayOne++;
            } else if(secondNum < firstNum) {
                currentDiff = firstNum - secondNum;
                indexArrayTwo++;
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
