package com.pojavan.xo;

import com.pojavan.xo.controller.Game;
import com.pojavan.xo.model.Board;
import com.pojavan.xo.model.Player;
import com.pojavan.xo.view.ConsoleView;

class Main {

    public static void main(String[] args) {
        final Board board = new Board();

        final Game game = new Game(board, new Player[]{
                new Player("Player #1", "X"),
                new Player("Player #2", "O")
        });

        final ConsoleView consoleView = new ConsoleView(game);
        testGame(consoleView);
    }


    public static void testGame(ConsoleView view) {
        view.printPlayers();
        view.start();
    }

}