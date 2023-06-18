package com.codecool;

public class Display {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public Display() {

    }

    public void printMenu() {
        System.out.println("BattleShip is starting...........");
        System.out.println("                                    |__\n" +
                "                                     |\\/\n" +
                "                                     ---\n" +
                "                                     / | [\n" +
                "                              !      | |||\n" +
                "                            _/|     _/|-++'\n" +
                "                        +  +--|    |--|--|_ |-\n" +
                "                     { /|__|  |/\\__|  |--- |||__/\n" +
                "                    +---------------___[}-_===_.'____                 /\\\n" +
                "                ____`-' ||___-{]_| _[}-  |     |_[___\\==--            \\/   _\n" +
                " __..._____--==/___]_|__|_____________________________[___\\==--____,------' .7\n" +
                "|                                                                     BB-61/\n" +
                " \\_________________________________________________________________________|");

    }

    public void printMessages(String message) {
        System.out.println(message);
    }
    public void printMainMenuOption() {
        System.out.println("Press : \n" +
                "\t 0 - Play \n" +
                "\t 1 - Print game Rules \n" +
                "\t 2 - Exit Game \n");
    }

    public void printExitMessage() {
        System.out.println("Have a nice day");
    }

    public void gameRules() {
        System.out.println(" under construction");
    }

    public void printBoard(Board board) {
        System.out.print("   ");
        for (int i = 0; i < board.getSizeX(); i++) {
            if (i < 10) {
                System.out.print(i + "  ");

            } else {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        for (int row = 0; row < board.getSizeX(); row++) {
            if (row < 10) {
                System.out.print(row + "  ");
            } else {
                System.out.print(row + " ");
            }

            for (int col = 0; col < board.getSizeY(); col++) {
                switch (board.getSquare(row,col).getCharacter()) {
                    case 'O':
                        System.out.print(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET + " ");
                        break;
                    case 'H':
                        System.out.print(ANSI_RED_BACKGROUND + " " + ANSI_RESET + " ");
                        break;
                    case 'S':
                        System.out.print(ANSI_YELLOW_BACKGROUND + " " + ANSI_RESET + " ");
                        break;
                    case 'M':
                        System.out.print(ANSI_BLACK_BACKGROUND + " " + ANSI_RESET + " ");
                        break;
                    case 'E':
                        System.out.print(ANSI_GREEN_BACKGROUND + " " + ANSI_RESET + " ");
                        break;


                }
        }
            System.out.println();

        }
    }
}
