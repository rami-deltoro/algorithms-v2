package org.example.movelementtoend;

import org.example.utilities.AlgoUtils;

public class MoveElementToEnd {


    public int[] move(int[] array, int toMove) {

        int i=0;
        int j = array.length-1;

        while(i < j) {
            while(array[j] == toMove) {
                j--;
            }

            if(i<j && array[i] == toMove) {
                AlgoUtils.swap(i,j,array);
            }

            i++;

        }

        return array;
    }
}
