package org.example.twonumbersum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumTest {

    private TwoNumberSum twoNumberSum = new TwoNumberSum();

    @Test
    void find() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,-1,-2,-3,-4,-5,-6,-7,-8};
        int targetSum = 14;
        Result result = twoNumberSum.find(array,targetSum);
        System.out.println("Result = "+result);
    }

    @Test
    void find2() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,-1,-2,-3,-4,-5,-6,-7,-8};
        int targetSum = 14;
        Result result = twoNumberSum.find2(array,targetSum);
        System.out.println("Result = "+result);
    }
}