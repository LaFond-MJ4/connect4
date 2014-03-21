/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT230LaFond.Connect4.Menus;

import connect4.Connect4Error;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Madison
 */
public class  StatisticsMenu implements Serializable, EnterInfo, DisplayInfo{
    private final static String[][] menuItems = {
        {"L", "last statistics"},
        {"O", "statistics overall"},         
        {"Q", "Quit statistics"}        
    };
    
    private final StatisticsControl StatisticsControl = new StatisticsControl();
    
    public StatisticsMenu(){
    }
    
    @Override
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
            }
        } while (!command.equals("Q"));  
    }

        // displays the help menu
    @Override
    public void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        
        for (String[] menuItem : StatisticsMenu.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
