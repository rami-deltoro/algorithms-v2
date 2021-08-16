package org.example.movelementtoend;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveElementToEndTest {

    private MoveElementToEnd moveElementToEnd = new MoveElementToEnd();

    @Test
    void move() {
        int[] array = new int[]{2,1,2,2,2,3,4,2};
        int moveTo = 2;

        int[] arrayReturned = moveElementToEnd.move(array,moveTo);

        System.out.println(Arrays.toString(array));
    }
}