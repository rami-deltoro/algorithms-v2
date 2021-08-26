package org.example.sortedsquare;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquareTest {

    private final SortedSquare sortedSquare = new SortedSquare();

    @Test
    void bruteForce() {
        int[] input = new int[] {1,4,9};

        System.out.println(Arrays.toString(sortedSquare.bruteForce(input)));
    }

    @Test
    void optimal() {
        int[] input = new int[] {1,4,9};

        System.out.println(Arrays.toString(sortedSquare.optimal(input)));
    }
}