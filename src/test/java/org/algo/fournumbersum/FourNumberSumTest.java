package org.algo.fournumbersum;

import org.junit.jupiter.api.Test;

import java.util.List;

class FourNumberSumTest {

    private FourNumberSum fourNumberSum = new FourNumberSum();

    @Test
    void findQuadruplets() {
        int[] array = new int[]{7,6,4,-1,1,2};
        int target = 16;

        List<Quadruplet> quadruplets = fourNumberSum.findQuadruplets(array,target);

        quadruplets.forEach(System.out::println);
    }
}