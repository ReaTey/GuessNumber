package io.gameonjava;

class GameController {

    private Player[] p = {new Player("Mykola"), new Player("Taras"), new Player("Andrii")};

    private Player whoIsWin(final int[] playerGuess, final int secretNumber) {

        for (int i = 0; i < 3; i++) {
            if (playerGuess[i] == secretNumber) {
                return p[i];
            }
        }

        return null;
    }

    void startGame() {

        int[] playerGuess = new int[3];

        int secretNumber;

        while (true) {
            secretNumber = (int)(Math.random() * 10);

            System.out.println("The secret number is: " + secretNumber);

            for (int i = 0; i < p.length; i++) {
                playerGuess[i] = p[i].guess().getNumber();
            }

            Player winner = whoIsWin(playerGuess, secretNumber);

            if (winner != null) {
                System.out.println("We have a winner it\'s player " + winner.getPlayerName());
                break;
            } else {
                System.out.println("p1 thinks it is: " + playerGuess[0]);
                System.out.println("p2 thinks it is: " + playerGuess[1]);
                System.out.println("p3 thinks it is: " + playerGuess[2]);
            }
        }
    }

}
