package org.example.binarysearch;

public class BinarySearch {


    public int search(int[] array, int target) {
        return binarySearchHelper(array,target,0,array.length-1);
    }

    public int searchI(int[] array, int target) {
        return binarySearchHelperI(array,target,0,array.length-1);
    }


    /*
    O(logN) time
    O(1) space
 */
    private int binarySearchHelperI(int[] array, int target,int leftPointer, int rightPointer) {
        while (leftPointer <= rightPointer) {
            final int middlePointer = (int) Math.floor((leftPointer+rightPointer) / 2);

            final int valueAtMiddle = array[middlePointer];

            if (target == valueAtMiddle) {
                return middlePointer;
            } else if (target < valueAtMiddle) {
                rightPointer = middlePointer - 1;
            } else {
                leftPointer = middlePointer - 1;
            }
        }

        return Integer.MIN_VALUE;
    }

    /*
        O(logN) time
        O(logN) space
     */
    private int binarySearchHelper(int[] array, int target,int leftPointer, int rightPointer) {
        if (leftPointer > rightPointer) {
            return Integer.MIN_VALUE;
        }

        final int middlePointer = (int) Math.floor((leftPointer+rightPointer) / 2);

        final int valueAtMiddle = array[middlePointer];

        if (target == valueAtMiddle) {
            return middlePointer;
        } else if (target < valueAtMiddle) {
            return binarySearchHelper(array,target,leftPointer,middlePointer -1);
        } else {
            return binarySearchHelper(array,target,middlePointer +1,rightPointer);
        }
    }
}
