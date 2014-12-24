package com.coder.wars.engine.board;

import com.coder.wars.engine.players.Player;
import com.coder.wars.engine.units.Unit;

/**
 * Created by vlad on 24.12.2014.
 */
public abstract class Board {

    protected Tile[][] boardMatrix;
    protected int rowsCount;
    protected int columnsCount;
    protected int playerCount;

    public Tile[][] getBoardMatrix() {
        return boardMatrix;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public int getColumnsCount() {
        return columnsCount;
    }

    public abstract void readFromMap(String mapFilePath);

}
