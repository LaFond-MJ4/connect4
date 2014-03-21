/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT230LaFond.Connect4.Menus;

/**
 *
 * @author Madison
 */
public class HelpMenuControl {
    
    public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Connect 4 consists of 10 columns and 10 rows."
                        + "\n\tYou play on the board by putting your pieces into the "
                        + "\n\tsquares provided and try to get 4 in a row.");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tConnect 4 is played by 2 players. The players take turns placing"
                         + "\n\ttheir pieces onto the board. The way to win the game is"
                         + "\n\tto get 4 in a row. The 4 pieces can be diagonal, "
                         + "\n\thorizontal or vertical."
                ); 
        displayHelpBorder();
    }
    
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA computer player acts in the place of Player 2 if you do not have"
                        + "\n\tanother person to play with. The computer player is an"
                        + "\n\tautomated player and will place pieces onto the board when"
                        + "\n\tit is the computer players turn."
                ); 
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
