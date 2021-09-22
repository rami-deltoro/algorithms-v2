package org.algo.twonumbersum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoNumberSumTest {

    private final TwoNumberSum twoNumberSum = new TwoNumberSum();

    @Test
    void find() {
        var array = new int[]{1,2,3,4,5,6,7,8,-1,-2,-3,-4,-5,-6,-7,-8};
        var targetSum = 14;
        var result = twoNumberSum.findWithHashMap(array,targetSum);
        System.out.println("Result = "+ Arrays.toString(result));
    }

    @Test
    void findWithEmptyArray() {
        var array = new int[]{};
        var targetSum = 14;
        var result = twoNumberSum.findWithHashMap(array,targetSum);
        System.out.println("Result = "+ Arrays.toString(result));
    }

    @Test
    void fff() {
        var array = new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        var targetSum = 164;
        var result = twoNumberSum.findWithHashMap(array,targetSum);
        System.out.println("Result = "+ Arrays.toString(result));
    }

    @Test
    void find2() {
        var array = new int[]{1,2,3,4,5,6,7,8,-1,-2,-3,-4,-5,-6,-7,-8};
        var targetSum = 14;
        var result = twoNumberSum.sortAndFind(array,targetSum);
        System.out.println("Result = "+Arrays.toString(result));
    }
}