package org.algo.sortedsquare;

import java.util.Arrays;

public class SortedSquare {


    /*
        Time : O(nlogn) - Go through each element and then sort
        Space : O(n) - new array of size n

        works with unsorted arrays as well
     */
    public int[] bruteForce(final int[] inputArray) {
        final var sortedSquareArray = new int[inputArray.length];

        for(int i = 0;i<inputArray.length;i++) {
            sortedSquareArray[i] = (int) Math.pow(inputArray[i],2);
        }

        Arrays.sort(sortedSquareArray);

        return sortedSquareArray;
    }

    /*
        Because input is Sorted it is a hint to solve in linear time.

        works only with sorted arrays

        when going further into the negatives/positives the abs gets larger , and the squares too.

        O(n) time
        O(n) space
     */
    public int[] optimal(final int[] inputArray) {
        final var sortedSquareArray = new int[inputArray.length];

        var startIndex = 0;
        var endIndex = inputArray.length-1;

        for(int i = inputArray.length-1;i>=0;i--) {
            var sortedArrayElement = 0;
            if(Math.abs(inputArray[endIndex]) > Math.abs(inputArray[startIndex])) {
                sortedArrayElement = (int) Math.pow(inputArray[endIndex],2);
                endIndex--;
            } else {
                sortedArrayElement = (int) Math.pow(inputArray[startIndex],2);
                startIndex++;
            }

            sortedSquareArray[i] = sortedArrayElement;
        }

        return sortedSquareArray;
    }

}
