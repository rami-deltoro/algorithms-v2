package org.example.binarytreeimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BalanceBST {

    public Node balanceBST(Node root) {
        if(root == null) return null;
        List<Node> inOrderList = new ArrayList<>();
        flattenTree(root, inOrderList);
        Collections.sort(inOrderList);
        return getBalancedBST(inOrderList, 0, inOrderList.size() - 1);
    }

    private void flattenTree(Node root, List<Node> inOrderList){
        if(root == null) return;
        flattenTree(root.getLeft(), inOrderList);
        inOrderList.add(root);
        flattenTree(root.getRight(), inOrderList);
    }

    //TODO check HackerRank on youtube about this algo.
    private Node getBalancedBST(List<Node> inOrderList, int left, int right){
        if(left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        final Node root = inOrderList.get(mid);
        root.setLeft(getBalancedBST(inOrderList, left, mid - 1));
        root.setRight(getBalancedBST(inOrderList, mid + 1, right));
        return root;
    }
}
