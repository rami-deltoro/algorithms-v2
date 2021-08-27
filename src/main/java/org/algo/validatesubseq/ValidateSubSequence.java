package org.algo.validatesubseq;

/*
Valid sub sequence :
- same order on original


Traverse both arrays


 */
public class ValidateSubSequence {


    /*
    O(n) time
    O(1) space
     */
    public boolean isValidWithWhile(int[] array, int[] sequence) {
        var arrayIndex = 0;
        var seqIndex = 0;

        while(arrayIndex < array.length && seqIndex < sequence.length) {
            final var hasFoundMatch = array[arrayIndex] == sequence[seqIndex];

            if(hasFoundMatch) {
                seqIndex++;
            }

            arrayIndex++;
        }

        return seqIndex == sequence.length;
    }

        /*
    O(n) time
    O(1) space
     */
    public boolean isValidWithFor(int[] array, int[] sequence) {
        var seqIndex = 0;

        for(int value : array) {
            if(seqIndex == sequence.length) {
                break;
            }

            final var hasFoundMatch = sequence[seqIndex] == value;

            if(hasFoundMatch) {
                seqIndex++;
            }
        }

        return seqIndex == sequence.length;
    }
}
