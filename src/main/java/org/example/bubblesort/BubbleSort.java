package org.example.bubblesort;

import java.io.StringReader;

/*
    O(n^2) time
    O(1) space
 */
public class BubbleSort {

    public int[] sort(final int[] array) {
        boolean isSorted = false;

        int counter = 0; //optimization - dont go to the last element after each loop
        while (!isSorted) {
            isSorted = true;
            for(int i=0;i<array.length-1-counter;i++) {
                if(array[i] > array[i+1]) {
                    swap(i,i+1,array);
                    isSorted = false;
                }
            }
            counter++;
        }

        return array;
    }


    private void swap(int i,int j,int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
