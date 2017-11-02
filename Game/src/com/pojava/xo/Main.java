package com.pojava.xo;

import com.pojava.xo.controller.Game;
import com.pojava.xo.view.ConsoleView;
import com.pojava.xo.view.PaidConsoleView;

class Main {
    public static void main(String[] args) {
        Game game = new Game();
        ConsoleView consoleView = new ConsoleView(game);
        PaidConsoleView paidConsoleView = new PaidConsoleView(game);
        testGame(paidConsoleView);
    }
public static void testGame (ConsoleView view){
        view.printGameName();
        view.printPlayers();


}

}