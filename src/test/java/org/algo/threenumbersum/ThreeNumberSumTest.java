package org.algo.threenumbersum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ThreeNumberSumTest {

    private ThreeNumberSum threeNumberSum = new ThreeNumberSum();

    @Test
    void calculate() {
        final int[] array = new int[]{-8,-10,9,8,2,13,7,12,-13,-5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        final List<Integer[]> triplets = threeNumberSum.calculate(array,4);

        triplets.forEach(integers -> System.out.println(Arrays.toString(integers)));
    }
}