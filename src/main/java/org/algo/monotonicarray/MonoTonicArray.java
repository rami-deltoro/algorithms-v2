package org.algo.monotonicarray;

/*
    O(n) time
    O(1) space
 */
public class MonoTonicArray {

    public boolean check(int[] array) {
        if(array.length <=2) {
            return true;
        }

        int direction = array[1] - array[0];

        for(int i=2;i<array.length;i++) {
            while(direction ==0) {
                direction = array[i] - array[i-1];

            }


            if(breaksDirection(direction,array[i-1],array[i])) {
                return false;
            }
        }

        return true;
    }


    private boolean breaksDirection (int direction, int previousNum,int currentNum) {
        int difference = currentNum - previousNum;

        if(direction > 0) {
            return  difference < 0;
        }

        return difference > 0;
    }


    /*
    O(n) time
    O(1) space
 */
    public boolean check2(int[] array) {
        boolean isNonDecresing = true;
        boolean isNonIncreasing = true;

        for(int i=1;i<array.length;i++) {
            if(array[i] < array[i-1]) {
                isNonDecresing = false;
            }

            if(array[i] > array[i-1]) {
                isNonIncreasing = false;
            }
        }


        return isNonDecresing || isNonIncreasing;
    }
}
