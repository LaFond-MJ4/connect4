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
    String nameFirst;
    String nameLast;
    int player;
    String instructions = "The name of the game is Connect 4 \n"
            + "Player 1 and Player 2 will take turns putting their pieces within the grid \n"
            + "Once someone gets 4 in a row, they are the winner!";  ;
    
    
    public String getName(){ 
      return nameFirst + " " + nameLast;  
    }
    public int numberOfPlayers(){
        return player;
    }
    public String displayHelp(){
        return instructions;
    }
    
    public Connect4(String nameFirst, String nameLast, int player){
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.player = player;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String nameFirst = input.next();
        String nameLast = input.next();
       
        System.out.println("Enter number of players:");
        int player = input.nextInt();
        
        Connect4 game = new Connect4(nameFirst, nameLast, player);

       System.out.println("Welcome " + game.getName() + "\nI see you are "
               + "playing with " + game.numberOfPlayers() + " players. "
               + "\nHere are the rules:\n" + game.displayHelp());
       

       

    }
    
}
