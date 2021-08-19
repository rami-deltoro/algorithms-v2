package org.example.validateBST;

import org.example.binarytreeimpl.BinaryTree;
import org.example.binarytreeimpl.Node;

public class ValidateBST {

    public boolean validateBST(BinaryTree binaryTree) {
        return validateBST(binaryTree.getRoot(),Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean validateBST(Node node,int minValue,int maxValue) {
        if(node==null) {
            return true;
        }

        int nodeValue = node.getValue();

        if(nodeValue < minValue || nodeValue >= maxValue) {
            return false;
        }

        boolean isLeftValid = validateBST(node.getLeft(),minValue,nodeValue);
        return isLeftValid && validateBST(node.getRight(),nodeValue,maxValue);

    }
}
