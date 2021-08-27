package org.algo.insertionsort;

import org.algo.utilities.AlgoUtils;

/*
    O(N^2) time
    O(1) space
 */
public class InsertionSort {


    public int[] sort(int[] array) {
        for(int i = 1;i<array.length;i++) {
            int j=i;

            while (j>0 && array[j] < array[j-1]) {
                AlgoUtils.swap(j,j-1,array);
                j--;
            }
        }

        return array;
    }
}
