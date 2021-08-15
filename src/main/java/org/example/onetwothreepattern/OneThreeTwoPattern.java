package org.example.onetwothreepattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
    O(1) : space
    O(N) : time
 */
public class OneThreeTwoPattern {

    public boolean check2(int[] nums) {
        Stack < Integer > stack = new Stack < > ();
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            min[i] = Math.min(min[i - 1], nums[i]);
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] > min[j]) {
                while (!stack.isEmpty() && stack.peek() <= min[j])
                    stack.pop();
                if (!stack.isEmpty() && stack.peek() < nums[j])
                    return true;
                stack.push(nums[j]);
            }
        }
        return false;
    }

}
