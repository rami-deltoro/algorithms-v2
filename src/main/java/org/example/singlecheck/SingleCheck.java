package org.example.singlecheck;

/*
    Input : array integers
    Goal : find if array has a single cycle.

 */
public class SingleCheck {

    public boolean hasSingleCycle(int[] array) {
        int numElementsVisited = 0;
        int currentIdx = 0;

        while(numElementsVisited < array.length){
            if(numElementsVisited > 0 && currentIdx == 0) {
                return false;
            }

            numElementsVisited++;
            currentIdx = getNextIdx(currentIdx,array);
        }

        return currentIdx == 0;

    }

    private int getNextIdx(int currentIdx, int[] array) {
        int jump = array[currentIdx];
        int nextIdx = currentIdx + jump % array.length;

        if(nextIdx >=0) {
            return nextIdx;
        } else {
            return nextIdx + array.length;
        }
    }
}
