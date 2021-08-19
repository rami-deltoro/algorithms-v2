package org.example.twonumbersum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumTest {

    private TwoNumberSum twoNumberSum = new TwoNumberSum();

    @Test
    void find() {
        var array = new int[]{1,2,3,4,5,6,7,8,-1,-2,-3,-4,-5,-6,-7,-8};
        var targetSum = 14;
        var result = twoNumberSum.find(array,targetSum);
        System.out.println("Result = "+result);
    }

    @Test
    void find2() {
        var array = new int[]{1,2,3,4,5,6,7,8,-1,-2,-3,-4,-5,-6,-7,-8};
        var targetSum = 14;
        Result result = twoNumberSum.find2(array,targetSum);
        System.out.println("Result = "+result);
    }
}