package com.pojavan.xo.model;

public class Player {

    private final String playerName;

    private final String figure;

    public Player(String playerName, String figure) {
        this.playerName = playerName;
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public String getPlayerName() {
        return playerName;
    }
}
