package org.example.bsttraversal;

import org.example.binarytreeimpl.Node;

import java.util.List;

public class BSTTraversal {

    public List<Integer> inOrderTraverse(Node node,List<Integer> integerList) {
        if(node!=null) {
            inOrderTraverse(node.getLeft(),integerList);
            integerList.add(node.getValue());
            inOrderTraverse(node.getRight(),integerList);
        }

        return integerList;
    }

    public List<Integer> preOrderTraverse(Node node,List<Integer> integerList) {
        if(node!=null) {
            integerList.add(node.getValue());
            preOrderTraverse(node.getLeft(),integerList);
            preOrderTraverse(node.getRight(),integerList);
        }

        return integerList;
    }

    public List<Integer> postOrderTraverse(Node node,List<Integer> integerList) {
        if(node!=null) {
            postOrderTraverse(node.getLeft(),integerList);
            postOrderTraverse(node.getRight(),integerList);
            integerList.add(node.getValue());
        }

        return integerList;
    }
}
