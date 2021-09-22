package org.algo.firstduplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
     naive : nested for loop
     O(N^2) time
     O(1) space

  */
public class FirstDuplicate {


    public int findFirstDuplicateSet(int[] array) {
        final Set<Integer> numberSet = new HashSet<>();

        for (int number : array) {

            if (numberSet.contains(number)) {
                return number;
            } else {
                numberSet.add(number);
            }
        }

        return -1;
    }


    public int findFirstDuplicateMap(int[] array) {
        final Map<Integer, Boolean> arrayMap = new HashMap<>();

        for (int number : array) {
            final Boolean isNumberInMap = arrayMap.get(number);

            if (isNumberInMap != null) {
                return number;
            } else {
                arrayMap.put(number, true);
            }
        }

        return -1;
    }

    /*
        O(n) time
        O(1) space
     */
    public int findFirstDuplicateOptimal(int[] array) {

        for (int number : array) {
            final var indexToLook = Math.abs(number) - 1;

            if (array[indexToLook] < 0) {
                return Math.abs(number);
            } else {
                array[indexToLook] = array[indexToLook] * (-1);
            }

        }

        return -1;
    }

}
