/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Jim Cendejas
 */
public class Board {
    private int[][] gameBoard = new int[6][7];
    private boolean gameNotOver = true;

    public Board() {
    }
    
    int i;
    int j; 
       
    public void newBoard() {
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 7; j++) {
                this.gameBoard[i][j] = 3; // Three means no one has gone there
            }
        }
    }

    public void displayBoard(String token1, String token2) {
        for (i = 0; i < 6; i++) {
            System.out.print("|");
            for (j = 0; j < 7; j++) {
                boardFill(token1, token2);
            }
            System.out.println();
        }
    }
    public void boardFill(String token1, String token2){
        if (this.gameBoard[i][j] == 3) {
            System.out.print("_" + "|");
        } else if (this.gameBoard[i][j] == 1) {
            System.out.print(token1 + "|");
        } else {
            System.out.print(token2 + "|");
        }
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public boolean isGameNotOver() {
        return gameNotOver;
    }

    public void setGameOver(boolean gameNotOver) {
        this.gameNotOver = gameNotOver;
    }
}
