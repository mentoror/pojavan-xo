package com.pojava.xo.view;

import com.pojava.xo.controller.Game;

public class ConsoleView {
    //контрроллер отвечает за логику  OVERRIDE - Переопеделния изменения метода родительского класа в класе наследника
private final Game game;

    public ConsoleView(Game game) {
        this.game = game;
    }

    public void printGameName(){
        System.out.println(Game.GAME_NAME);
    }
    public void printPlayers(){
        System.out.println(game.getPlayers());
    }
}
