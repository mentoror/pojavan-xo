package com.pojavan.xo;

import com.pojavan.xo.controller.Game;
import com.pojavan.xo.model.Board;
import com.pojavan.xo.view.ConsoleView;
import com.pojavan.xo.view.PaidConsoleView;

class Main {

    public static void main(String[] args) {
        final Game game = new Game();
        final ConsoleView consoleView = new ConsoleView(game);
        final PaidConsoleView paidConsoleView = new PaidConsoleView(game);

        //testGame(paidConsoleView);

        // Hello, ololo

        final Board board = new Board();
        board.initFigures();
        board.showBoard();

        game.initPlayers();
        game.showPlayers();
    }


    public static void testGame(ConsoleView view) {
        view.printGameName();
        view.printPlayers();
    }

}