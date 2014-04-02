/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.util.Random;

/**
 *
 * @author Jim Cendejas
 */
public class Game {

    public void playGame(int numPlayers) {
        if (numPlayers == 1) {
            onePlayerGame();
        } else {
            twoPlayerGame();
        }
    }

    /**
     * Returns a pseudo-random number between min and max, inclusive. The
     * difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value. Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

    // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public void onePlayerGame() {
        Players player1 = new Players();
        System.out.println("Player 1");
        player1.promptPlayerName();
        player1.promptForToken();

        Players player2 = new Players();
        player2.setPlayerName("Computer Player");
        if ("X".equals(player1.getPlayerToken()) || "x".equals(player1.getPlayerToken())){
            player2.setPlayerToken("O");      
        } else {
            player2.setPlayerToken("X");   
        }
        
        Board gameBoard = new Board();
        gameBoard.newBoard();
        gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());
        GetLocation location = new GetLocation();

        /* This will run till the game is over! */
        while (gameBoard.isGameNotOver()) {
            System.out.println(player1.getPlayerName() + "'s turn");
            while (!gameBoard.dropPiece(Integer.parseInt(location.askUser()), 1)) {
                System.out.println("Column is full please enter a valid move");
            }
            gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());

            gameBoard.checkBoard();
            if (!gameBoard.isGameNotOver()) {
                System.out.println(player1.getPlayerName() + " Wins");
                player1.addWin();
                continue;
            }
            System.out.println(player2.getPlayerName() + "'s turn");
            while (!gameBoard.dropPiece(Game.randInt(1,7), 2));
            gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());

            gameBoard.checkBoard();
            if (!gameBoard.isGameNotOver()) {
                System.out.println(player2.getPlayerName() + " Wins");
                player1.addLoss();
            }
        }
    }

    public void twoPlayerGame() {
        Players player1 = new Players();
        System.out.println("Player 1");
        player1.promptPlayerName();
        player1.promptForToken();

        Players player2 = new Players();
        System.out.println("Player 2");
        player2.promptPlayerName();
        player2.promptForToken();

        Board gameBoard = new Board();
        gameBoard.newBoard();
        gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());
        GetLocation location = new GetLocation();

        /* This will run till the game is over! */
        while (gameBoard.isGameNotOver()) {
            System.out.println(player1.getPlayerName() + "'s turn");
            while (!gameBoard.dropPiece(Integer.parseInt(location.askUser()), 1)) {
                System.out.println("Column is full please enter a valid move");
            }
            gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());

            gameBoard.checkBoard();
            if (!gameBoard.isGameNotOver()) {
                System.out.println(player1.getPlayerName() + " Wins");
                player1.addWin();
                player2.addLoss();
                continue;
            }
            System.out.println(player2.getPlayerName() + "'s turn");
            while (!gameBoard.dropPiece(Integer.parseInt(location.askUser()), 2)) {
                System.out.println("Column is full please enter a valid move");
            }
            gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());

            gameBoard.checkBoard();
            if (!gameBoard.isGameNotOver()) {
                System.out.println(player2.getPlayerName() + " Wins");
                player2.addWin();
                player1.addLoss();
            }
        }
    }
}
