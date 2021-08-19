package org.example.maxsubset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubsetTest {

    private MaxSubset maxSubset = new MaxSubset();

    @Test
    void find() {
        int[] array = new int[]{7,10,12,7,9,14};

        System.out.println(maxSubset.find2(array));
    }
}