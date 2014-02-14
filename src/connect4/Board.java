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
    
    public void newBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                this.gameBoard[i][j] = 3; // Three means no one has gone there
            }
        }
    }
    public void displayBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(this.gameBoard[i][j]); // Three means no one has gone there
            }
            System.out.println();
        }
    }
}
