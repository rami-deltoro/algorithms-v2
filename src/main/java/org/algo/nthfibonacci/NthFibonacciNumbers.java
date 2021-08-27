package org.algo.nthfibonacci;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacciNumbers {


    public long getNthFib(final int n) {
        final Map<Integer, Long> memoize = new HashMap<>();
        memoize.put(1, 0L);
        memoize.put(2, 1L);

        return getNthFib(n,memoize);
    }

    /*
        O(n) Time
        O(n) Space
     */
    private long getNthFib(final int n, final Map<Integer, Long> memoize) {
        if(memoize.containsKey(n)) {
            return memoize.get(n);
        }
        memoize.put(n, getNthFib(n - 1, memoize) + getNthFib(n - 2, memoize));
        return memoize.get(n);
    }

    /*
    O(n) Time
    O(1) Space
 */
    public int getNthFib2(final int n) {
        int[] lastTwo = new int[]{0, 1};
        int counter = 3;

        while (counter <= n) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }

        return n > 1 ? lastTwo[1] : lastTwo[0];
    }

}
