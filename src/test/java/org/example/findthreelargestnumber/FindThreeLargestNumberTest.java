package org.example.findthreelargestnumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindThreeLargestNumberTest {

    private FindThreeLargestNumber findThreeLargestNumber = new FindThreeLargestNumber();


    @Test
    void findThreeLargestNumber() {
        Integer[] array = new Integer[]{6,7,8,9,1,2,3,10,23,99,100,2003,34,55};
        Integer[] threeLargest = findThreeLargestNumber.findThreeLargestNumber(array);
        System.out.println(Arrays.toString(threeLargest));
    }
}