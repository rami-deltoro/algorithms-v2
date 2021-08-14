package org.example.selectionsort;

import org.example.utilities.AlgoUtils;

/*
    O(n^2) time
    O(1) space
 */
public class SelectionSort {

    public int[] sort(int[] array) {
        int currentIndex = 0;

        while(currentIndex < array.length-1) {
            int smallestIndex = currentIndex;
            for(int i=currentIndex+1;i < array.length;i++) {
                if(array[smallestIndex] > array[i]) {
                    smallestIndex = i;
                }
            }
            AlgoUtils.swap(currentIndex,smallestIndex,array);
            currentIndex++;
        }

        return array;
    }
}
