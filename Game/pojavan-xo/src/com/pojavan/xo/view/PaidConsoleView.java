package com.pojavan.xo.view;

import com.pojavan.xo.controller.Game;

public class PaidConsoleView extends ConsoleView {

    public PaidConsoleView(Game game) {
        super(game);
    }

    @Override
    public void printGameName() {
        printLine();
        System.out.println(Game.GAME_NAME);
        printLine();
    }

    private void printLine() {
        System.out.println("***");
    }

}
