package org.example.insertionsort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    private InsertionSort insertionSort = new InsertionSort();

    @Test
    void sort() {
        int[] array = new int[]{44,33,22,0,1,5,-5,225,445,43,21};
        int[] sortedArray = insertionSort.sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}