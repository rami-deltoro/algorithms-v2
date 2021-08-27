package org.algo.bsttraversal;

import org.algo.binarytreeimpl.BinaryTree;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BSTTraversalTest {

    private BSTTraversal bstTraversal = new BSTTraversal();

    private static final BinaryTree binaryTree = new BinaryTree(false);

    @BeforeAll
    public static void setup() {
        binaryTree.add(10);
        binaryTree.add(5);
        binaryTree.add(15);
        binaryTree.add(2);
        binaryTree.add(5);
        binaryTree.add(22);
        binaryTree.add(1);
    }


    @Test
    void inOrderTraverse() {
        bstTraversal.inOrderTraverse(binaryTree.getRoot(),new ArrayList<>())
                .forEach(System.out::println);
    }

    @Test
    void preOrderTraverse() {
        bstTraversal.preOrderTraverse(binaryTree.getRoot(),new ArrayList<>())
                .forEach(System.out::println);
    }

    @Test
    void postOrderTraverse() {
        bstTraversal.postOrderTraverse(binaryTree.getRoot(),new ArrayList<>())
                .forEach(System.out::println);
    }
}