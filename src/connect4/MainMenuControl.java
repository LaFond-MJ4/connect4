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
public class MainMenuControl {
    
    public void startGame(long noPlayers) {
        if(noPlayers != 1 && noPlayers != 2) {
            System.out.println("startGame - invalid number of players specified.");
            return;
        }

        Game game = new Game();
        if (noPlayers == 1) {
            game = this.create("ONE_PLAYER");
        }
        else {
            game = this.create("TWO_PLAYER");
        }

        MainMenuView gameMenu = new MainMenuView();
        gameMenu.getInput();
    }
    
    public Game create(String gameType) {
        Game game = null;
        Players player1 = null;
        Players player2 = null;
        
        if (gameType == null) {
            System.out.println("MainCommands - create: gameType is null");
            return null;
        }
        /* THIS IS NOT WORKING
        
        if (gameType.equals(Game.ONE_PLAYER)) {
            game = new Game(Game.ONE_PLAYER);
            player1 = new Player(Player.REGULAR_PLAYER, game.PLAYER_A_DEFAULT_MARKER);
            player1.setName("Player 1");
            player2 = new Player(Player.COMPUTER_PLAYER, game.PLAYER_B_DEFAULT_MARKER);
            player2.setName("Player 2");
        }
        
        game.playerA = player1;
        game.playerB = player2;
                */
        return game;
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