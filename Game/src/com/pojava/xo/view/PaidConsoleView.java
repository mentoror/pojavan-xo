package com.pojava.xo.view;

import com.pojava.xo.controller.Game;

public class PaidConsoleView extends ConsoleView {
    public PaidConsoleView(Game game) {
        super(game);
    }
    //контрроллер отвечает за логику

    @Override
    //джава вызовет этот метод потому что она идет по иерархии и вызывает последний метод
    public void printGameName(){
        printLine();
        System.out.println(Game.GAME_NAME);
        printLine();
    }

    private void printLine() {
        System.out.println("****");
    }
}
