package org.algo.selectionsort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SelectionSortTest {

    private SelectionSort selectionSort = new SelectionSort();


    @Test
    void sort() {
        int[] array = new int[]{933,2234,5554,34,3,2,1,77,66,544,3};

        int[] sortedArray = selectionSort.sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}