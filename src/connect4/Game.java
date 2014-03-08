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
    gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());
    GetLocation location = new GetLocation();
    
    /* This will run till the game is over! */
    while (gameBoard.isGameNotOver()){
        System.out.println(player1.getPlayerName() + "'s turn");
        while (!gameBoard.dropPiece(Integer.parseInt(location.askUser()), 1)){
            System.out.println("Column is full please enter a valid move");
        }
        gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());
        
        gameBoard.checkBoard();
        if (!gameBoard.isGameNotOver()){
            System.out.println(player1.getPlayerName() + " Wins");
            player1.addWin();
            player2.addLoss();
            continue;
        }
        System.out.println(player2.getPlayerName() + "'s turn");
        while (!gameBoard.dropPiece(Integer.parseInt(location.askUser()), 2)){
            System.out.println("Column is full please enter a valid move");
        }
        gameBoard.displayBoard(player1.getPlayerToken(), player2.getPlayerToken());
        
        gameBoard.checkBoard();
        if (!gameBoard.isGameNotOver()){
            System.out.println(player2.getPlayerName() + " Wins");
            player2.addWin();
            player1.addLoss();
            continue;
        }
    }
}
}
