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
    String name;
    int player;
    String instructions = "The name of the game is Connect 4 \n"
            + "Player 1 and Player 2 will take turns putting their pieces within the grid \n"
            + "Once someone gets 4 in a row, they are the winner!";  ;
    
    
    public String getName(){ 
      return name;  
    }
    public int numberOfPlayers(){
        return player;
    }
    public String displayHelp(){
        return instructions;
    }
    
    public Connect4(String name, int player){
        this.name = name;
        this.player = player;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String name = input.next();
       
        System.out.println("Enter number of players:");
        int player = input.nextInt();
        
        Connect4 game = new Connect4(name, player);

       System.out.println("Welcome " + game.getName() + "\n I see you are "
               + "playing with " + game.numberOfPlayers() + " players. "
               + "\n Here are the rules:\n" + game.displayHelp());
    }
    
}
