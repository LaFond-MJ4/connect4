/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Madison
 */
public class Players {
    String player1;
    String player2;
    GetLocation getLocation = new GetLocation();
    
    public Players(){
    }
    
    public String player(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Player one's name:");
        player1 = input.nextLine();
        System.out.println("Please enter Player two's name:");
        player2 = input.nextLine();
        return "Welcome " + player1 + " and " + player2;
        
    }
    
    public void displayPlayer(){
        System.out.println(player());
    }
    
    public int playerTurn(){
        int x;
        for(x=0; x <= 42; x++ ){
            if(x % 2 == 0)
                System.out.println("Player one, it's your turn");
            if(x % 2 != 0){
                System.out.println("Player two, it is your turn");     
            }
            this.getLocation.askUser();
        }
        return x;
    }
    }
    
    
    

