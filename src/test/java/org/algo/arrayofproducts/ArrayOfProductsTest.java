package org.algo.arrayofproducts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfProductsTest {

    private final ArrayOfProducts arrayOfProducts = new ArrayOfProducts();


    @Test
    public void test() {
        int[] array = new int[]{5,1,4,2};

        int[] result = arrayOfProducts.arrayOfProductsBruteForce(array);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test2() {
        int[] array = new int[]{5,1,4,2};

        int[] result = arrayOfProducts.arrayOfProductsLeftRight(array);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test3() {
        int[] array = new int[]{5,1,4,2};

        int[] result = arrayOfProducts.arrayOfProductsLeftOnly(array);
        System.out.println(Arrays.toString(result));
    }


    @Test
    public void test4() {
        int[] array = new int[]{3,2,1,6};

        int[] result = arrayOfProducts.arrayOfProductsBruteForce(array);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test5() {
        int[] array = new int[]{3,2,1,6};

        int[] result = arrayOfProducts.arrayOfProductsLeftRight(array);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test6() {
        int[] array = new int[]{3,2,1,6};

        int[] result = arrayOfProducts.arrayOfProductsLeftOnly(array);
        System.out.println(Arrays.toString(result));
    }

}