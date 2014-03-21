/*
    Java Project: Connect 4
    Authors: MJ Lafond & Jim Cendejas
 */

package connect4;
//import java.util.*;

import CIT230LaFond.Connect4.Menus.MainMenuView;

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
       Connect4 connect4 = new Connect4();
       connect4.display();
       
        /*
        If you need to test code do it just under here
        */ 
              
       //Players turn = new Players();
       //turn.playerTurn();
       
       MainMenuView mainMenu = new MainMenuView();
       //mainMenu.display();
       mainMenu.getInput();
       /* 
       Anything past here will not run as mainMenu ends the program
       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
       */
       
       GetLocation location = new GetLocation();
       location.askUser();
       
       //Statistics stats = new Statistics();
       //stats.stats();
      
       
       //HelpMenuView help = new HelpMenuView();
       //help.display();
       //help.getInput();
       
       //GetMarkerColor color = new GetMarkerColor();
       //color.input();

    }
    private void display(){
        System.out.println(this.instructions);
    }
    
}
