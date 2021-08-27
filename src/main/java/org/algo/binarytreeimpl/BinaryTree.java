package org.algo.binarytreeimpl;

import lombok.Getter;

@Getter
public class BinaryTree {

    private BalanceBST balanceBST = new BalanceBST();

    private Node root;


    private boolean isBalanced;

    public BinaryTree() {
        isBalanced = false;
    }

    public BinaryTree(boolean isBalanced) {
        this.isBalanced = isBalanced;
    }


    public void add(int value) {
        final Node node = addRecursive(root, value);
        if(isBalanced) {
            root = balanceBST.balanceBST(node);
        } else {
            root = node;
        }
    }

    public boolean contains(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node addRecursive(final Node current,final int value) {
        if(current == null) {
            return new Node(value);
        }

        final int valueFromCurrentNode = current.getValue();

        if(value < valueFromCurrentNode) {
            current.setLeft(addRecursive(current.getLeft(),value));
        } else if(value > valueFromCurrentNode) {
            current.setRight(addRecursive(current.getRight(),value));
        } else {
            return current;
        }

        return current;
    }


    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.getValue()) {
            return true;
        }
        return value < current.getValue()
                ? containsNodeRecursive(current.getLeft(), value)
                : containsNodeRecursive(current.getRight(), value);
    }

    //Need to balance when deleting
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.getValue()) {
            if (current.getLeft() == null && current.getRight() == null) { // No children
                return null;
            }

            if (current.getRight() == null) { // 1 child
                return current.getLeft();
            }

            if (current.getLeft() == null) { // 1 child
                return current.getRight();
            }


            int smallestValue = findSmallestValue(current.getRight());
            current.setValue( smallestValue);
            current.setRight(deleteRecursive(current.getRight(), smallestValue));
            return current;


        }

        if (value < current.getValue()) {
           current.setLeft(deleteRecursive(current.getLeft(), value));
            return current;
        }

        current.setRight(deleteRecursive(current.getRight(), value));
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.getLeft() == null ? root.getValue() : findSmallestValue(root.getLeft());
    }
}
