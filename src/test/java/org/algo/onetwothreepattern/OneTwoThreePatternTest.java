package org.algo.onetwothreepattern;

import org.junit.jupiter.api.Test;

class OneTwoThreePatternTest {

    private OneThreeTwoPattern oneTwoThreePattern = new OneThreeTwoPattern();

    @Test
    void check() {
        //int[] array = AlgoUtils.createAscendingArray(15000);
        //int[] array = new int[]{1,2,3,4};
        //int[] array = new int[]{3,1,4,2};

//        array[1000] = 3;
//        array[1001] = 1;
//        array[1002] = 4;
//        array[1003] = 2;

        //array[5500] = 1000;

        int[] array = new int[]{3,5,0,3,4};

        boolean is123Pattern = oneTwoThreePattern.check2(array);

        System.out.println(is123Pattern);
    }
}