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
public class Game {
    
public void playGame(int numPlayers){
    if (numPlayers == 1){
        onePlayerGame();
    }
    else
    {
        twoPlayerGame();
    }   
}

public void onePlayerGame(){
    
}

public void twoPlayerGame(){
    Players player1 = new Players();
    System.out.println("Player 1");
    player1.promptPlayerName();
    player1.promptForToken();
    Players player2 = new Players();
    System.out.println("Player 2");
    player2.promptPlayerName();
    player2.promptForToken();
    
    Board gameBoard = new Board();
    gameBoard.newBoard();
    gameBoard.displayBoard(player1.getPlayerName(), player2.getPlayerName(), player1.getPlayerToken(), player2.getPlayerToken());
    /* This will run till the game is over! */
    while (gameBoard.isGameNotOver()){
        gameBoard.playerPlacement(player1.getPlayerName(), player2.getPlayerName(), player1.getPlayerToken(), player2.getPlayerToken());
        gameBoard.setGameOver(true);
    }  
}
}