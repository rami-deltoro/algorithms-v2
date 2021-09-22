package org.algo.firstduplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstDuplicateTest {

    private final FirstDuplicate firstDuplicate = new FirstDuplicate();

    @Test
    void findFirstDuplicate() {
        int[] array = new int[]{2,1,5,2,3,3,4};

        int number = firstDuplicate.findFirstDuplicateMap(array);

        assertEquals(number,2);
    }

    @Test
    void findFirstDuplicateDontExist() {
        int[] array = new int[]{2,1,5,7,3,9,4};

        int number = firstDuplicate.findFirstDuplicateMap(array);

        assertEquals(number,-1);
    }


    @Test
    void findFirstDuplicateSet() {
        int[] array = new int[]{2,1,5,2,3,3,4};

        int number = firstDuplicate.findFirstDuplicateSet(array);

        assertEquals(number,2);
    }

    @Test
    void findFirstDuplicateSetDontExist() {
        int[] array = new int[]{2,1,5,7,3,9,4};

        int number = firstDuplicate.findFirstDuplicateSet(array);

        assertEquals(number,-1);
    }

    @Test
    void findFirstDuplicateOptimal() {
        int[] array = new int[]{2,1,5,2,3,3,4};

        int number = firstDuplicate.findFirstDuplicateOptimal(array);

        assertEquals(number,2);
    }

    @Test
    void findFirstDuplicateSetDontExistOptimal() {
        int[] array = new int[]{2,1,5,6,3,4};
        int number = firstDuplicate.findFirstDuplicateOptimal(array);

        assertEquals(number,-1);
    }
}