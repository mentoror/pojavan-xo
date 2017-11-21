package com.pojavan.xo.model;

import com.pojavan.xo.util.CoordinateHelper;

import java.util.Arrays;

public class Board {

    public static final int FIELD_SIZE = 3;

    private Figure[][] figures = new Figure[FIELD_SIZE][FIELD_SIZE];

    public Figure[][] getFigures() {
        return figures;
    }

    public void initEmptyBoard() {
        // TODO initialize array here with empty fields
    }

    public void initBoard(boolean reverse) {
        // TODO initialize board with 'X' and 'O' values
        // if reverse == false
        // O O X
        // O X O
        // X O O

        // if reverse == true
        // X O O
        // O X O
        // O O X
    }

    public Figure getFigure(int x, int y) {
        return figures[x][y];
    }

    public boolean setFigure(int x, int y, Figure figure) {
        if (!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y))
            return false;

        figures[x][y] = figure;
        return true;
    }

    public void showBoard() {
        System.out.println(Arrays.deepToString(figures));
    }

}
