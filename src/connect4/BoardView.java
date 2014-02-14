/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author Jim
 */
public class BoardView {
    Board board = new Board();
    /*
    
    public void displayBoard() {
        
        this.printHeadRow();
        this.printDividerRow();
        
        for (int i = 0; i < this.board.rowCount; i++) {
            //location[] rowOfLocations = this.board.boardLocations[i];
            //this.printRow(i+1, rowOfLocations);
            this.printDividerRow();
        }
        
        System.out.println();
         
        return;
    }

    private void printHeadRow() {

        System.out.print("\n\t 1 ");
        int columnsInRow = this.board.columnCount;
        for (int i = 1; i < columnsInRow - 1; i++) {
            int col = i + 1;
            System.out.print(" " + col + " ");
        }
        
        System.out.print(" " + columnsInRow + " ");
    }

    private void printDividerRow() {

        System.out.print("\n\t |------");
        
        int columnsInRow = this.board.columnCount;
        for (int i = 1; i < columnsInRow - 1; i++) {
            System.out.print("------");
        }

        System.out.print("-----|");
    }

    private void printRow() {
        
        String letter = " ";
        if (rowLocations[0].player != null) {
            letter = rowLocations[0].player.marker;
        }
        System.out.print("\n\t" + rowNumber + " | " + letter + " |");

        for (int i = 1; i < rowLocations.length; i++) {
            if (rowLocations[i].player == null) {
                letter = " ";
            } else {
                letter = rowLocations[i].player.marker;
            }
            
            System.out.print(" " + letter + " |");
        }
    }
    */
}
