package org.algo.findthreelargestnumber;

/*
    O(n) time
    O(1) space
 */
public class FindThreeLargestNumber {


    public Integer[] findThreeLargestNumber(Integer[] array) {
        final Integer[] threeLargest = new Integer[3];
        for(int num : array) {
            updateLargest(threeLargest,num);
        }
        return threeLargest;
    }


    private Integer[] updateLargest(Integer[] threeLargest,int num) {
        if(threeLargest[2] == null || num > threeLargest[2]) {
            shiftAndUpdate(threeLargest,num,2);
        } else if(threeLargest[1] == null || num > threeLargest[1]) {
            shiftAndUpdate(threeLargest,num,1);
        } else if(threeLargest[0] == null || num > threeLargest[0]) {
            shiftAndUpdate(threeLargest,num,0);

        }

        return threeLargest;
    }

    private void shiftAndUpdate(final Integer[] threeLargest,int num, int index) {
        for(int i=0;i<index+1;i++) {
            System.out.println("i="+i+"index="+index);
            if(i==index) {
                threeLargest[i] = num;
            } else {
                threeLargest[i] = threeLargest[i+1];
            }
        }
    }
}
