package org.example.binarytreeimpl;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

}
