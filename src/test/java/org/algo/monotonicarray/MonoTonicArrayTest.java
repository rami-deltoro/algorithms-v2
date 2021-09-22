package org.algo.monotonicarray;

import org.junit.jupiter.api.Test;

class MonoTonicArrayTest {

    private final MonoTonicArray monoTonicArray = new MonoTonicArray();


    @Test
    void check() {

        int[] array = new int[]{-5,-10,-100,-100,-200};

        boolean isMonotonic = monoTonicArray.check(array);

        System.out.println(isMonotonic);
    }
}

