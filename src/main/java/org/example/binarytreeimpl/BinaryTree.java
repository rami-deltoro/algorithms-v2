package org.example.binarytreeimpl;

import lombok.Getter;

@Getter
public class BinaryTree {

    private Node root;



    public void add(int value) {
        root = addRecursive(root, value);
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
