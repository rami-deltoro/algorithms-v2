package org.example.productsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductSumTest {

    private final ProductSum productSum = new ProductSum();

    @Test
    void testFindSum() {
        Object[] objects = new Object[]{5,2,new Integer[]{7,-1},3,new Object[]{6,new Integer[]{-13,8},4}};

        int sum = productSum.findSum(objects);
        System.out.println(sum);

    }

}