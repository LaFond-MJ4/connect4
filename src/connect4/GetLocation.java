/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Jim, Kyle, MJ
 */
public class GetLocation {
    String userInput;
    
    public String getLocation() {
        Scanner input = new Scanner(System.in);
        this.userInput = input.next();
        return userInput;
    }
    
    public String askUser() {
        while(true) {
            System.out.print("Please enter a column to drop your piece: ");
            this.userInput = getLocation();
            
            if (validateUserInput(this.userInput)) {
               return this.userInput;
            }
            System.out.println("Please enter a valid number(1-7)");
        }        
    }
    
    public Boolean validateUserInput(String userInput) {
       int test;
       try {
           test = Integer.parseInt(userInput);//tries to make a number out of the users' input
       }catch (NumberFormatException e) { // if it is not able to make a number it fails and returns false
           return false;
       }
       if (test < 1 || test > 7) { // the number must be 1-7 if not it will be false
           return false;
       }
       return true; 
    }
}
