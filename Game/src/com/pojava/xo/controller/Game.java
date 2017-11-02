package com.pojava.xo.controller;

import com.pojava.xo.model.Player;

public class Game {
    //Model View Controller
    //
public static final String GAME_NAME = "XO";

private Player[] players;

    public Player[] getPlayers() {
        return players;
    }
    public Player currentPlayer(){
        return null;
    }

public boolean move(int x, int y){
        return true;
}



}



