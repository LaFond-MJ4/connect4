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
    private GetLocation getLocation = new GetLocation();
    private Game token = new Game();

    public Board() {
    }

    int i;
    int j;
    int y;
    int p = 0;

    public void newBoard() {
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 7; j++) {
                this.gameBoard[i][j] = 3; // Three means no one has gone there
            }
        }
    }

    public void displayBoard(String player1, String player2,String token1, String token2) {
        for (i = 0; i < 6; i++) {
            System.out.print("|");
            for (j = 0; j < 7; j++) {
                boardFill(token1, token2);
            }
            System.out.println();
        }
        p++;
        playerPlacement(player1, player2, token1, token2);
    }

    public void boardFill(String token1, String token2) {
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

    public void playerPlacement(String player1, String player2, String token1, String token2) {
        if (p % 2 == 0) {
            System.out.println(player2 + ", it is your turn");
        } else {
            System.out.println(player1 + ", it is your turn");
        }
        String x = this.getLocation.askUser();
        y = Integer.parseInt(x);
        if (this.gameBoard[0][y] != 3) {
            System.out.println("This column is full");
            playerPlacement(player1, player2, token1, token2);
        }
        if (this.gameBoard[0][y] == 3) {
            for (i = 5; i >= 0; i--) {
                if (this.gameBoard[i][y] == 3) {
                    if (p % 2 == 0) {
                        this.gameBoard[i][y] = 2;
                        displayBoard(player1, player2, token1, token2);
                    } else {
                        this.gameBoard[i][y] = 1;
                        displayBoard(player1, player2, token1, token2);
                    }

                }
            }
        }
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
