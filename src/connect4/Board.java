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

    int[][] gameBoard = new int[6][7];
    int i;
    int j;
    
    public void newBoard() {
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 7; j++) {
                this.gameBoard[i][j] = 1; // Three means no one has gone there
            }
        }
    }

    public void displayBoard() {
        for (i = 0; i < 6; i++) {
            System.out.print("|");
            for (j = 0; j < 7; j++) {
                boardFill();
                
            }
            System.out.println();
        }
    }
    public void boardFill(){
        if (this.gameBoard[i][j] == 3) {
                    System.out.print("_" + "|");
                } else if (this.gameBoard[i][j] == 1) {
                    System.out.print("_" + "|");
                } else {
                    System.out.print("_" + "|");
                }
    }
}
