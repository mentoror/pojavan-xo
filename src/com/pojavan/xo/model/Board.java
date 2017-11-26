package com.pojavan.xo.model;

import com.pojavan.xo.util.CoordinateHelper;

import java.util.Arrays;

public class Board {

    private static final int FIELD_SIZE = 3;

    private Figure[][] figures = new Figure[FIELD_SIZE][FIELD_SIZE];

    public Figure[][] getFigures() {
        return figures;
    }

    public void initEmptyBoard() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                figures[i][j] = new Figure("");
            }
        }
    }

    public void initBoard(boolean reverse) {
        if (reverse) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(String.format("i = %d. j = %d", i, j));
                    if (i == j) {
                        figures[i][j] = new Figure("X");
                    } else {
                        figures[i][j] = new Figure("0");

                    }
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(String.format("i = %d. j = %d", i, j));
                    if (i == (FIELD_SIZE - j - 1)) {
                        figures[i][j] = new Figure("X");
                    } else {
                        figures[i][j] = new Figure("0");

                    }
                }
            }

        }
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
