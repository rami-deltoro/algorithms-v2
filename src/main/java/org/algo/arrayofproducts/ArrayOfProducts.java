package org.algo.arrayofproducts;

import java.util.Arrays;

public class ArrayOfProducts {

    /*
    Non optimal / brute force

    O(n^2) time
    O(n) Space

    ton of repeated work. repeated same multiplications
     */
    public int[] arrayOfProductsBruteForce(int[] array) {
        var result = new int[array.length];

        for(var i=0;i<array.length;i++) {
            var product=1;

            for(var j=0;j<array.length;j++) {
                if(i!=j) {
                    product = product*array[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

    /*
    Use brute force, walk through and try to find a more optimal solution.
        optimal

        store multiplications , avoid repeated multiplications

        left+right used for result array
        left = has product for each indices of the left
        right = has product for each indices of the right

        O(n) time
        O(n) Space
     */
    public int[] arrayOfProductsLeftRight(int[] array) {
        var left = new int[array.length];
        var right = new int[array.length];
        var result = new int[array.length];

        Arrays.fill(left,1);
        Arrays.fill(right,1);
        Arrays.fill(result,1);

        var product = 1;
        for (var i=0;i<left.length;i++) {
            left[i] = product;
            product=product*array[i];
        }

        product = 1;
        for (var i=right.length-1;i>=0;i--) {
            right[i] = product;
            product=product*array[i];
        }

        for(var i=0;i<result.length;i++) {
            result[i] = left[i]*right[i];
        }

        return result;
    }

    public int[] arrayOfProductsLeftOnly(int[] array) {
        var result = new int[array.length];

        Arrays.fill(result,1);

        var product = 1;
        for (var i=0;i<result.length;i++) { //setup like a left array
            result[i] = product;
            product=product*array[i];
        }


        product = 1;
        for (var i=result.length-1;i>=0;i--) {
            result[i] = result[i] * product;
            product = product*array[i];
            System.out.println("i = "+i+" product = "+product+" array[i]="+array[i]);

        }

        return result;
    }
}
