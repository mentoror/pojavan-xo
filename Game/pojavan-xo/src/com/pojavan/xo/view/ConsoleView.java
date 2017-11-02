package com.pojavan.xo.view;

import com.pojavan.xo.controller.Game;

public class ConsoleView {

    private final Game game;

    public ConsoleView(Game game) {
        this.game = game;
    }

    public void printGameName() {
        System.out.println(Game.GAME_NAME);
    }

    public void printPlayers() {
        System.out.println(game.getPlayers());
    }
}
