package org.algo.threenumbersum;

import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeNumberSumTest {

    private ThreeNumberSum threeNumberSum = new ThreeNumberSum();

    @Test
    void calculate() {
        final int[] array = new int[]{-8,-6,1,2,3,5,6,12};

        final List<Triplet> triplets = threeNumberSum.calculate(array,0);

        triplets.forEach(System.out::println);
    }
}