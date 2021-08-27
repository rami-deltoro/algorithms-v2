package org.algo.astar;

public class Node implements Comparable<Node>{

    private int row;
    private int column;
    private int value;
    private int distanceFromStart; //G Score
    private int estimatedDistanceToEnd; //F Score
    private Node cameFrom;



    public Node(final int row,final int column, final int value) {
        this.row=row;
        this.column=column;
        this.value=value;

        distanceFromStart = Integer.MAX_VALUE;
        estimatedDistanceToEnd = Integer.MAX_VALUE;

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }


    public int getValue() {
        return value;
    }


    public int getDistanceFromStart() {
        return distanceFromStart;
    }

    public void setDistanceFromStart(int distanceFromStart) {
        this.distanceFromStart = distanceFromStart;
    }


    public void setEstimatedDistanceToEnd(int estimatedDistanceToEnd) {
        this.estimatedDistanceToEnd = estimatedDistanceToEnd;
    }

    public Node getCameFrom() {
        return cameFrom;
    }

    public void setCameFrom(Node cameFrom) {
        this.cameFrom = cameFrom;
    }

    @Override
    public int compareTo(Node other) {
        if (this.estimatedDistanceToEnd == other.estimatedDistanceToEnd) {
            return 0;
        } else if (this.estimatedDistanceToEnd < other.estimatedDistanceToEnd) {
            return -1;
        } else {
            return 1;
        }
    }
}
