package org.algo.astar;

import lombok.Data;

@Data
public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
