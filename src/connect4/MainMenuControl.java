/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;


/**
 *
 * @author Jim Cendejas
 */
public class MainMenuControl extends Menu {
    
    public void startGame(long noPlayers) {
        test();
    
        Game game = new Game();
        if (noPlayers == 1) {
            game.playGame(1);
        }
        else {
            game.playGame(2);
        }

        MainMenuView gameMenu = new MainMenuView();
        gameMenu.getInput();
    }
    
    
    public void displayStatsMenu(){
       StatisticsMenu statsMenu = new StatisticsMenu();
       //statsMenu.display();
       statsMenu.getInput();
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
}