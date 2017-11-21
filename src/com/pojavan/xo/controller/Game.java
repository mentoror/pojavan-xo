package com.pojavan.xo.controller;

import com.pojavan.xo.model.Board;
import com.pojavan.xo.model.Player;
import com.pojavan.xo.util.CoordinateHelper;

import java.util.Arrays;

public class Game {

    public static final String GAME_NAME = "XO";

    private Board board;

    public Game(Board board, Player[] players) {
        this.board = board;
        this.players = players;
    }

    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public Player currentPlayer() {
        return null;
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
