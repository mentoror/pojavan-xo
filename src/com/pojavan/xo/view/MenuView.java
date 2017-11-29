package com.pojavan.xo.view;

import java.util.Scanner;

public class MenuView {

    public void start(ConsoleView view) {
        System.out.println("1 - Start");
        System.out.println("2 - Print Board");
        System.out.println("3 - Options");
        System.out.println("4 - Save and Exit");
        System.out.println("5 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, select menu item: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Game Started");
                break;
            case 2:
                System.out.println("Here's your board:");
                view.showBoard();
                start(view);
                break;
            case 3:
                System.out.println("Options");
                // TODO Created nested menu for options
                break;
            case 4:
                System.out.println("Saving...");
            case 5:
                System.out.println("Bye-bye");
                System.exit(0);
                break;
            default:
                System.out.println("Sorry, please try again");
                start(view);
        }
    }
}
