package com.pojavan.xo.controller;

import com.pojavan.xo.model.Player;
import com.pojavan.xo.util.CoordinateHelper;

import java.util.Arrays;

public class Game {

    public static final String GAME_NAME = "XO";

    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }

    public Player currentPlayer() {
        return null;
    }

    public void initPlayers() {
        // TODO initialize players
    }

    public void showPlayers() {
        System.out.println(Arrays.toString(players));
    }

    public boolean move(int x, int y) {
        if (!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y)) {
            return false;
        }
        return true;
    }
}
