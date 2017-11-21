package com.pojavan.xo.view;

import com.pojavan.xo.controller.Game;
import com.pojavan.xo.model.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    public static final String SEPARATOR_SYMBOL = "-";
    public static final int SEPARATOR_ITEMS_COUNT = 12;
    private final Game game;

    public ConsoleView(Game game) {
        this.game = game;
    }

    public void start() {
        getCoordinate("X");
        getCoordinate("Y");
    }

    public void printGameName() {
        System.out.println(Game.GAME_NAME);
    }

    public void printPlayers() {
        /*for (int i = 0; i < game.getPlayers().length; i++) {
            System.out.println(game.getPlayers()[i].getPlayerName());
        }
*/
        for (Player player : game.getPlayers()) {
            System.out.println(player.getPlayerName());
        }
    }

    public void showBoard() {
        for (int i = 0; i < 3; i++) {
            showBoardLine(i);
        }
    }

    private void showBoardLine(int row) {
        for (int i = 0; i < 3; i++) {
            System.out.print(game.getBoard().getFigure(row, i));
        }
        System.out.println();
        printLineSeparator(SEPARATOR_ITEMS_COUNT);
    }

    private void printLineSeparator(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(SEPARATOR_SYMBOL);
        }
        System.out.println();
    }

    private int getCoordinate(String coordinateName) {
        int tryCount = 0;
        while (tryCount < 3) {
            System.out.println(String.format("Please input coordinate for %s: ", coordinateName));
            try {
                final Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                tryCount++;
                System.out.println("Invalid coordinate.");
            }
        }
        return -1;
    }
}
