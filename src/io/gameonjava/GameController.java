package io.gameonjava;

class GameController {

    private Player[] p = {new Player("Mykola"),
                          new Player("Taras"),
                          new Player("Andrii")};

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
            System.out.println("------------------------------------");
            System.out.println("The secret number is: " + secretNumber);
            System.out.println("------------------------------------");

            for (int i = 0; i < p.length; i++) {
                playerGuess[i] = p[i].guess().getNumber();
            }
            Player winner = whoIsWin(playerGuess, secretNumber);

            if (winner != null) {
                for (int i = 0; i < 3; i++) {
                    System.out.println(this.p[i].getPlayerName() + " thinks it is: " + playerGuess[i]);
                }
                System.out.println("We have a winner! It\'s a player " + winner.getPlayerName());
                break;
            } else {
                for (int i = 0; i < 3; i++) {
                    System.out.println(this.p[i].getPlayerName() + " thinks it is: " + playerGuess[i]);
                }
            }
            System.out.println();
        }
    }

}
