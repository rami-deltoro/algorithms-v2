package org.example.monotonicarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonoTonicArrayTest {

    private MonoTonicArray monoTonicArray = new MonoTonicArray();


    @Test
    void check() {

        int[] array = new int[]{-5,-10,-100,-100,-200};

        boolean isMonotonic = monoTonicArray.check(array);

        System.out.println(isMonotonic);
    }
}