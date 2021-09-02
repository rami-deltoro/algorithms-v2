package org.algo.smallestdifference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SmallestDifferenceTest {

    private SmallestDifference smallestDifference =  new SmallestDifference();


    @Test
    void find() {
        int[] arrayOne = new int[]{-1,5,8,10,35,102};
        int[] arrayTwo = new int[]{100,-10,34,16,73,88};

        int[] diff = smallestDifference.find(arrayOne,arrayTwo);

        System.out.println(Arrays.toString(diff));
    }
}