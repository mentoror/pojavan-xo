package com.pojavan.xo.model;

import com.pojavan.xo.util.CoordinateHelper;

import java.util.Arrays;

public class Board {

    public static final int FIELD_SIZE = 3;

    private Figure[][] figures = new Figure[FIELD_SIZE][FIELD_SIZE];

    public Figure[][] getFigures() {
        return figures;
    }

    public void initFigures() {
        System.out.println("sadf");
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
