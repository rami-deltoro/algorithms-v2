package org.algo.binarytreeimpl;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Node implements Comparable<Node>{

    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    //TODO review comparator/comparable
    @Override
    public int compareTo(final Node otherNode) {
        final int otherValue = otherNode.getValue();

        if(this.value > otherValue) {
            return 1;
        } else if(this.value < otherValue) {
            return -1;
        } else {
            return 0;
        }
    }
}
