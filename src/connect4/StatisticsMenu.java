/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Madison
 */
public class  StatisticsMenu implements Serializable{
    private final static String[][] menuItems = {
        {"L", "last statistics"},
        {"O", "statistics overall"},         
        {"Q", "Quit statistics"}        
    };
    
    private StatisticsControl StatisticsControl = new StatisticsControl();
    
    public StatisticsMenu(){
    }
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "L":
                    this.StatisticsControl.displayLastStatistics();
                    break;
                case "O":
                    this.StatisticsControl.displayAllStatistics();
                    break;
                case "Q":
                    break;                  
                default: 
                    new Connect4Error().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

        // displays the help menu
    private final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < StatisticsMenu.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
