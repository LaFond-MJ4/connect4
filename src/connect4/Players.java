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
    int x;
    
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
    
    public int playerTurn(int x){
        if(x == 0){
        System.out.println("Player one \n\tIt is your turn");
                }
        if(x == 2){
            System.out.println("Player one \n\tIt is your turn");
        }
        if(x == 4){
            System.out.println("Player one \n\tIt is your turn");
        }
        if(x == 6){
            System.out.println("Player one \n\tIt is your turn");
        } 
        if(x == 8){
            System.out.println("Player one \n\tIt is your turn");
        }
        if(x == 10){
            System.out.println("Player one \n\tIt is your turn");
        }
           
        if(x == 10 + 1){ 
            System.out.println("Invalid");
        }
        if(x == 13 - 1){
            System.out.println("Invalid");
        }
        if(x == 13){
            System.out.println("Invalid");
        }
        if(x == 1){        
           System.out.println("Player two \n\tIt is your turn");
        }
        if(x == 3){        
           System.out.println("Player two \n\tIt is your turn");
        }
        if(x == 5){        
           System.out.println("Player two \n\tIt is your turn");
        }
        if(x == 7){        
           System.out.println("Player two \n\tIt is your turn");
        }
        if(x == 9){        
           System.out.println("Player two \n\tIt is your turn");
        }
        return (short) x;
    }
    public void turn(){
        System.out.println(playerTurn(x));
    }
    }
    
    
    

