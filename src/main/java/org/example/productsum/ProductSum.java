package org.example.productsum;

/*
    time = O(N)
    space = O(N) -> Level of arrays.
 */
public class ProductSum {

    public int findSum(final Object[] objects) {
        return findSum(objects,1);
    }

    private int findSum(final Object[] objects,int multiplier) {
        int sum = 0;

        for(Object object : objects) {
            if(object instanceof Integer[]) {
                final Integer[] integerArray = (Integer[]) object;
                sum = sum + findSum(integerArray,multiplier+1);
            } else if(object instanceof Object[]) {
                final Object[] objectsArray = (Object[]) object;
                sum = sum + findSum(objectsArray,multiplier+1);
            } else {
                final Integer number = (Integer) object;
                sum = sum +number;
            }
        }

        return sum * multiplier;
    }
}
