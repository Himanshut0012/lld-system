package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());


    }
}