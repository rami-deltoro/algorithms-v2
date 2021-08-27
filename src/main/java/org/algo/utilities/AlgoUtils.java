package org.algo.utilities;

public class AlgoUtils {

    public static void swap(int i,int j,int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] createAscendingArray(int size) {
        int[] array = new int[size];

        for (int i=0;i<size;i++) {
            array[i] = i;
        }

        return array;
    }
}
