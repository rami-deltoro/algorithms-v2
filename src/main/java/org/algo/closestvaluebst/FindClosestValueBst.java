package org.algo.closestvaluebst;

import org.algo.binarytreeimpl.BinaryTree;
import org.algo.binarytreeimpl.Node;


public class FindClosestValueBst {


    public int findClosestValueInBST(final BinaryTree binaryTree,int target) {
        return findClosestValueInBSTHelper(binaryTree.getRoot(),target,Integer.MAX_VALUE);
    }

    public int findClosestValueInBSTIteratively(final BinaryTree binaryTree,int target) {
        return findClosestValueInBSTHelperIteratively(binaryTree.getRoot(),target,Integer.MAX_VALUE);
    }

    /*
        avg : time & space O(log(n))
        worst : time & space O(n)
    */
    private int findClosestValueInBSTHelper(final Node node, int target, int closestValue) {
        if(node == null) {
            return closestValue;
        }

        final int nodeValue = node.getValue();

        if (Math.abs(target-closestValue) > Math.abs(target - nodeValue)) {
            closestValue = nodeValue;
        }

        if(target < nodeValue) {
            return findClosestValueInBSTHelper(node.getLeft(),target,closestValue);
        } else if(target > nodeValue) {
            return findClosestValueInBSTHelper(node.getRight(),target,closestValue);
        } else {
            return closestValue;
        }
    }

    /*
    avg : time & space O(log(n))
    worst : time O(n) | space O(1)
*/
    private int findClosestValueInBSTHelperIteratively(final Node node, int target, int closestValue) {
        Node currentNode = node;

        while(currentNode!=null) {
            if (Math.abs(target-closestValue) > Math.abs(target - currentNode.getValue())) {
                closestValue = currentNode.getValue();
            }

            if(target < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
            } else if(target > currentNode.getValue()) {
                currentNode = currentNode.getRight();
            } else {
                break;
            }
        }

        return closestValue;
    }

}
