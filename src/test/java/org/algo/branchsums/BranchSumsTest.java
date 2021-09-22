package org.algo.branchsums;

//
// import org.example.binarytreeimpl.BinaryTree;
import org.algo.binarytreeimpl.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.List;

class BranchSumsTest {

    private final BranchSums branchSums = new BranchSums();

    /*
                    5
               2            7
           1     3       6       8
               4               9
     */
    @Test
    void calculate() {
        final BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(6);
        binaryTree.add(7);
        binaryTree.add(8);
        binaryTree.add(9);
        binaryTree.add(5);
        binaryTree.add(2);
        binaryTree.add(1);


        final List<Integer> sums =  branchSums.calculate(binaryTree);
        System.out.println("sums = "+sums);
    }
}