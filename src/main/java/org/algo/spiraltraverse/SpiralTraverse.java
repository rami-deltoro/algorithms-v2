package org.algo.spiraltraverse;

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
    public List<Integer> spiralTraverse(final int[][] array) {
        final List<Integer>  result = new ArrayList<>();

        var startRow = 0;
        var endRow = array.length-1;
        var startCol = 0;
        var endCol = array[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            for(var i=startCol;i<=endCol;i++) { /* top border */
                result.add(array[startRow][i]);
            }

            for(var i=startRow+1;i<=endRow;i++) { //right border
                result.add(array[i][endCol]);
            }

            for(var i=endCol-1;i>=startCol;i--) { // bottom border
                // Handle the edge case when there's a single row
                // in the middle of the matrix. In this case, we don't
                // want to double-count the values in this row, which
                // we've already counted in the first for loop above.
                if (startRow == endRow) break;
                result.add(array[endRow][i]);
            }

            for(var i=endRow-1;i>startRow;i--) { // left border

                if (startCol == endCol) break;
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
