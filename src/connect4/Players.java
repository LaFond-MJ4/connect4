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
public class Players implements Serializable {
    private String playerName;
    private int ties = 0;
    private int wins = 0;
    private int losses = 0;
    private String token = "";
    
    GetLocation getLocation = new GetLocation();
    
    public Players(){
    }
    
    public void promptPlayerName(){
        System.out.print("What is your name? ");
        String name;
        Scanner inFile = new Scanner(System.in);                        
        name = inFile.nextLine();
        this.setPlayerName(name);
    }
    
    public void addWin(){
        this.wins++;
    }
    
    public void addLoss(){
        this.losses++;
    }
    
    public void addTie(){
        this.ties++;
    }
    
    public void promptForToken(){
        System.out.print("What do you want your token to be? ");

        while(true)
        {
            String tempToken;
            Scanner inFile = new Scanner(System.in);
            tempToken = inFile.nextLine();
            if (tempToken.length() == 1)
            {
                this.token = tempToken;
                break;
            }
            System.out.print("please chose a token that is one character: ");
        }
        
        
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getPlayerWins() {
        return wins;
    }

    public void setPlayerWins(int playerWins) {
        this.wins = playerWins;
    }

    public int getPlayerLosses() {
        return losses;
    }

    public void setPlayerLosses(int playerLosses) {
        this.losses = playerLosses;
    }

    public String getPlayerToken() {
        return token;
    }

    public void setPlayerToken(String playerToken) {
        this.token = playerToken;
    }

    public GetLocation getGetLocation() {
        return getLocation;
    }

    public void setGetLocation(GetLocation getLocation) {
        this.getLocation = getLocation;
    }
}