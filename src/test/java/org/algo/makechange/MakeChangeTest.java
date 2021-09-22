package org.algo.makechange;

import org.junit.jupiter.api.Test;

class MakeChangeTest {

    private final MakeChange makeChange = new MakeChange();


    @Test
    void calculate() {
        int[] denom = new int[]{1,5,10,25};
        int n = 10;

        System.out.println(makeChange.calculate(n,denom));
    }


    @Test
    void calculate2() {
        int[] denom = new int[]{5};
        int n = 9;

        System.out.println(makeChange.calculate(n,denom));
    }
}