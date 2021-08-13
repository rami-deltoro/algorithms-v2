package org.example.branchsums;

import org.example.binarytreeimpl.BinaryTree;
import org.example.binarytreeimpl.Node;

import java.util.ArrayList;
import java.util.List;

/*
    O(n) time & space
 */
public class BranchSums {


    public List<Integer> calculate(final BinaryTree binaryTree) {
        final List<Integer> sums = new ArrayList<>();
        calculateBranchSums(binaryTree.getRoot(), 0,sums);
        return sums;
    }

    private void calculateBranchSums(final Node node, int runningSum, List<Integer> sums ) {
        if(node == null) {
            return;
        }

        final int newRunningSum = runningSum + node.getValue();

        if(node.getLeft() == null && node.getRight() == null) {
            sums.add(newRunningSum);
            return;
        }

        calculateBranchSums(node.getLeft(),newRunningSum,sums);
        calculateBranchSums(node.getRight(),newRunningSum,sums);
    }
}
