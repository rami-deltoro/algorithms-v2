package org.example.validateBST;

import org.example.binarytreeimpl.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBSTTest {

    private ValidateBST validateBST = new ValidateBST();

    @Test
    void validateBST() {
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


        boolean isValid = validateBST.validateBST(binaryTree);

        System.out.println(isValid);

    }
}