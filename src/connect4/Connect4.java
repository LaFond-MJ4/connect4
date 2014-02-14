/*
    Java Project: Connect 4
    Authors: MJ Lafond & Jim Cendejas
 */

package connect4;
import java.util.*;
/**
 *
 * @author MJ
 */
public class Connect4 {
    String instructions = "The name of the game is Connect 4 \n"
            + "Player 1 and Player 2 will take turns putting their pieces within the grid \n"
            + "Once someone gets 4 in a row, they are the winner!";  ;
    public Connect4(){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Players output = new Players();
        output.displayPlayer();

       Connect4 connect4 = new Connect4();
       connect4.display();
       
       Piece gamePiece = new Piece();
       gamePiece.player = 1;
       gamePiece.DisplayPlayer();
       
       Statistics stats = new Statistics();
       stats.stats();
       
       Players turn = new Players();
       turn.turn();
       
       StatisticsMenu statsMenu = new StatisticsMenu();
       statsMenu.display();
       statsMenu.getInput();
       
       HelpMenuView help = new HelpMenuView();
       help.display();
       help.getInput();
       
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.display();
       mainMenu.getInput();
       
       GetMarkerColor color = new GetMarkerColor();
       color.input();
    }
     private void display(){
     System.out.println(this.instructions);
}
    
}
