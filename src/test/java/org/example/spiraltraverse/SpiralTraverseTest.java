package org.example.spiraltraverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralTraverseTest {

    private SpiralTraverse spiralTraverse = new SpiralTraverse();

    @Test
    void traverse() {
        int[][] array = new int[][]{
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}
        };

        spiralTraverse.traverseR(array)
                .forEach(System.out::println);
    }
}