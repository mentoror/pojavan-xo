package com.pojavan.xo.controller;

import com.pojavan.xo.model.Player;

public class Game {

    public static final String GAME_NAME = "XO";

    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(int x, int y) {
        return true;
    }
}
