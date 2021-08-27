package org.algo.bubblesort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    void sort() {
        int[] array = new int[]{5,1,3,90,-5,102,45,32,22};
        int[] sortedArray = bubbleSort.sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}