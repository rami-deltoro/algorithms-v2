package org.algo.longestpeak;

import org.junit.jupiter.api.Test;

class LongestPeakTest {

    private LongestPeak longestPeak = new LongestPeak();

    @Test
    void find() {
        int[] array = new int[]{1,2,3,3,4,0,10,6,5,-1,-3,2,3};

        System.out.println(longestPeak.find(array));
    }
}