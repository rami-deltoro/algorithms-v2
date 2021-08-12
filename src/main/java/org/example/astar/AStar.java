package org.example.astar;

import java.util.*;

public class AStar {

    public List<Position> runAlgorithm(final int startRow, final int startColumn,final int endRow, final int endColumn,final int[][] graph) {
        final Node[][] nodes = initializeNode(graph);

        final Node startNode = nodes[startRow][startColumn];
        final Node endNode = nodes[endRow][endColumn];

        startNode.setDistanceFromStart(0);
        startNode.setEstimatedDistanceToEnd(calculateManhattanDistance(startNode,endNode));

        final PriorityQueue<Node> nodesToVisit = new PriorityQueue<>();

        nodesToVisit.add(startNode);


        while (!nodesToVisit.isEmpty()) {
            Node currentMinDistanceNode = nodesToVisit.remove();

            if(currentMinDistanceNode == endNode) {
                break;
            }

            final List<Node> neighbors = getNeighboringNodes(currentMinDistanceNode,nodes);

            for(Node neighbor : neighbors) {
                final int tentativeDistanceToNeighbor = currentMinDistanceNode.getDistanceFromStart() + 1;

                if(neighbor.getValue() == 1 || tentativeDistanceToNeighbor >= neighbor.getDistanceFromStart()) {
                    continue;
                }

                neighbor.setCameFrom(currentMinDistanceNode);
                neighbor.setDistanceFromStart(tentativeDistanceToNeighbor);
                neighbor.setEstimatedDistanceToEnd(tentativeDistanceToNeighbor + calculateManhattanDistance(neighbor,endNode));

                if(!nodesToVisit.contains(neighbor)) {
                    nodesToVisit.add(neighbor);
                }
            }

        }

        return reconstructPath(endNode);

    }

    private List<Position> reconstructPath(Node endNode) {
        if (endNode.getCameFrom() ==null) {
            return new ArrayList<>();
        }

        Node currentNode = endNode;

        final List<Position> path = new ArrayList<>();

        while (currentNode!=null) {
            path.add(new Position(currentNode.getRow(),currentNode.getColumn()));
            currentNode = currentNode.getCameFrom();
        }
        Collections.reverse(path);

        return path;
    }

    private List<Node> getNeighboringNodes(final Node node,final Node[][] nodes) {
        final List<Node> neighbors = new ArrayList<>();

        final int numRow = nodes.length;
        final int numColumns = nodes[0].length;

        final int row = node.getRow();
        final int column = node.getColumn();

        if(row < numRow - 1) { //DOWN
            neighbors.add(nodes[row+1][column]);
        }

        if(row > 0 ) { //UP
            neighbors.add(nodes[row-1][column]);
        }

        if(column < numColumns -1) { //RIGHT
            neighbors.add(nodes[row][column+1]);
        }

        if(column > 0) {
            neighbors.add(nodes[row][column-1]);
        }

        return neighbors;
    }

    private int calculateManhattanDistance(Node currentNode, Node endNode) {
        int currentRow = currentNode.getRow();
        int currentColumn = currentNode.getColumn();
        int endRow = endNode.getRow();
        int endColumn = endNode.getColumn();

        return Math.abs(currentRow - endRow) + Math.abs(currentColumn - endColumn);
    }

    private Node[][] initializeNode(final int[][] graph) {
        int width = graph.length;
        int length = graph[0].length;

        final Node[][] nodes = new Node[width][length];

        for(int i=0;i<width;i++) {
            for(int j=0;j<length;j++) {
                nodes[i][j] = new Node(i,j,graph[i][j]);
            }
        }

        return nodes;
    }
}
