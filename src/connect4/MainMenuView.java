/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Jim Cendejas
 */
public class MainMenuView {
    
    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"S", "Statistics"},
        {"H", "Help"},
        {"X", "Exit Connect 4"}
    };
    
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        
    }
    
    public void getInput() {
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.mainMenuControl.startGame(1);
                    break;
                case "2":
                    this.mainMenuControl.startGame(2);
                    break;
                case "S":
                    this.mainMenuControl.displayStatsMenu();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "X":
                    System.exit(0);
                    break;
                default:
                    new Connect4Error().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("X"));
        return;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        
        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t=================================================================");
    }
}
