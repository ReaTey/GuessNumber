package io.gameonjava;

class Player {

    private int number = 0;

    private String playerName = "";

    Player(String name) {
        if (name == null || name.equals("")) {
            System.out.println("wrong Player name!");
            this.playerName = "UnnamedUser";
        } else {
            this.playerName = name;
        }
    }

    Player guess() {
        number = (int)(Math.random() * 10);
        return this;
    }

    int getNumber() {
        return number;
    }

    String getPlayerName() {
        return playerName;
    }

}
