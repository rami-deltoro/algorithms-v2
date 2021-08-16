package org.example.spiraltraverse;

import java.util.ArrayList;
import java.util.List;


public class SpiralTraverse {

    /*
O(N) time
O(N) space
 */
    public List<Integer> traverseR(int[][] array) {
        final List<Integer> result = new ArrayList<>();
        spiralFill(array,0,array.length-1,0,array[0].length-1,result);
        return result;
    }


    public void spiralFill(int[][] array,int startRow, int endRow,int startCol,int endCol, List<Integer> result) {
        if(startRow > endRow || startCol > endCol) {
            return;
        }

        for(int i=startCol;i<endCol+1;i++) { //top border
            result.add(array[startRow][i]);
        }

        for(int i=startRow+1;i<endRow+1;i++) { //right border
            result.add(array[i][endCol]);
        }

        for(int i=endCol-1;i>=startCol;i--) { // bottom border
            result.add(array[endRow][i]);
        }

        for(int i=endRow-1;i>startRow+1;i--) { // left border
            result.add(array[i][startCol]);
        }

        spiralFill(array,startRow+1,endRow-1,startCol+1,endCol-1,result);
    }

    /*
O(N) time
O(N) space
 */
        public List<Integer>  traverse(int[][] array) {
        final List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int endRow = array.length-1;
        int startCol = 0;
        int endCol = array[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            for(int i=startCol;i<endCol+1;i++) { //top border
                result.add(array[startRow][i]);
            }

            for(int i=startRow+1;i<endRow+1;i++) { //right border
                result.add(array[i][endCol]);
            }

            for(int i=endCol-1;i>=startCol;i--) { // bottom border
                result.add(array[endRow][i]);
            }

            for(int i=endRow-1;i>startRow+1;i--) { // left border
                result.add(array[i][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return result;
    }

}
