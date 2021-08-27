package org.algo.astar;

import org.junit.jupiter.api.Test;

import java.util.List;

class AStarTest {

    AStar aStar = new AStar();

    @Test
    void runAlgorithm() {
        int[][] graph = new int[5][5];
        graph[0][0] = 0;
        graph[0][1] = 0;
        graph[0][2] = 0;
        graph[0][3] = 0;
        graph[0][4] = 0;

        graph[1][0] = 0;
        graph[1][1] = 1;
        graph[1][2] = 1;
        graph[1][3] = 1;
        graph[1][4] = 0;

        graph[2][0] = 0;
        graph[2][1] = 0;
        graph[2][2] = 0;
        graph[2][3] = 0;
        graph[2][4] = 0;

        graph[3][0] = 1;
        graph[3][1] = 0;
        graph[3][2] = 1;
        graph[3][3] = 1;
        graph[3][4] = 1;

        graph[4][0] = 0;
        graph[4][1] = 0;
        graph[4][2] = 0;
        graph[4][3] = 0;
        graph[4][4] = 0;


        List<Position> positionList = aStar.runAlgorithm(0,1,4,3,graph);

        positionList
                .forEach(position -> System.out.println("position = "+position));
    }
}