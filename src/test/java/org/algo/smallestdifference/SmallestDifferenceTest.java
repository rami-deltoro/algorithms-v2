package org.algo.smallestdifference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SmallestDifferenceTest {

    private SmallestDifference smallestDifference =  new SmallestDifference();


    @Test
    void find() {
        int[] arrayOne = new int[]{-1,3,5,10,20,28};
        int[] arrayTwo = new int[]{15,17,26,134,135};

        int[] diff = smallestDifference.find(arrayOne,arrayTwo);

        System.out.println(Arrays.toString(diff));
    }
}