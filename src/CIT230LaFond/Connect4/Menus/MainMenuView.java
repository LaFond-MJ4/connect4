/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT230LaFond.Connect4.Menus;

import java.util.Scanner;

/**
 *
 * @author Jim Cendejas
 */
public class MainMenuView implements DisplayInfo, EnterInfo {

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

    //@Override
    public void getInput(String command) {
        //String command;
        //Scanner inFile = new Scanner(System.in);

        do {
            try {
                //this.display();

                //command = inFile.nextLine();
                //command = command.trim().toUpperCase();

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
                        throw new MenuException("\n\t" + ErrorType.ERROR101.getMessage());
                }
            } catch (MenuException gex) {
                System.out.println("\n\t" + gex.getMessage());
            }
        } while (true);
    }

    @Override
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : MainMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t=================================================================");
    }

    @Override
    public void getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
