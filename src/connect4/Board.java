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
            System.out.print("|");
            for (int j = 0; j < 7; j++) {
                boardFill(i,j);
                
            } 
            System.out.println();          
        }
    }
    public void boardFill(int i, int j){
        if (this.gameBoard[i][j] == 3){
            System.out.print("_" + "|");
        }
        else if(this.gameBoard[i][j] == 1){
           System.out.print("_" + "|"); 
        }
        else {
            System.out.print("_" + "|");
        }
            
    }
}
