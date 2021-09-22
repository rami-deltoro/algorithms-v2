package org.algo.nonconstructiblechange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonConstructableChangeTest {

    private final NonConstructableChange nonConstructableChange = new NonConstructableChange();

    @Test
    void find() {
        int[] array = new int[]{1,2,5};
        System.out.println(nonConstructableChange.find(array));
    }
}