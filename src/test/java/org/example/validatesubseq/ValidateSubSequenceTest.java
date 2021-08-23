package org.example.validatesubseq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSubSequenceTest {

    private ValidateSubSequence validateSubSequence = new ValidateSubSequence();

    @Test
    void isValidWithWhile() {
        var array = new int[]{10,3,24,30,1,-4,7,32};
        var sequence = new int[]{3,1,7,32};

        assertTrue(validateSubSequence.isValidWithWhile(array,sequence));
    }

    @Test
    void isNotValidWithWhile() {
        var array = new int[]{10,3,24,30,1,-4,7,32};
        var sequence = new int[]{3,10,7,32};

        assertFalse(validateSubSequence.isValidWithWhile(array,sequence));
    }

    @Test
    void isValidWithFor() {
        var array = new int[]{10,3,24,30,1,-4,7,32};
        var sequence = new int[]{3,1,7,32};

        assertTrue(validateSubSequence.isValidWithFor(array,sequence));
    }

    @Test
    void isNotValidWithFor() {
        var array = new int[]{10,3,24,30,1,-4,7,32};
        var sequence = new int[]{3,10,7,32};

        assertFalse(validateSubSequence.isValidWithFor(array,sequence));
    }
}