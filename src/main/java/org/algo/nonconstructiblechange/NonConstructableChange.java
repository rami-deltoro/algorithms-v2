package org.algo.nonconstructiblechange;

import java.util.Arrays;

public class NonConstructableChange {

    /*

        Brute force is complicated. for each number 1.....K
        Check if I can add any number to match K.

        O(nlogn) - sort array - merge sort/quick sort
        O(1) - no extra space
     */
    public int find(int[] coins) {
        Arrays.sort(coins);

        var currentChangeCreated = 0;
        for(var coin : coins) {
            final var maxChangeCanBeCreated = currentChangeCreated + 1;
            if(coin > maxChangeCanBeCreated) {
                return maxChangeCanBeCreated;
            }

            currentChangeCreated = currentChangeCreated + coin;
        }
        return currentChangeCreated + 1;
    }

}
