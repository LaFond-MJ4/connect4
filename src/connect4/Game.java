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
    int win;
    int loss;
    String player;
    // THIS NEEDS TO BE FIXED
    public Game() {
        win = 0;
        loss = 0;
        //player = playerName;
    }
    
    public void addWin() {
        ++win;
    }
    
    public void addLoss() {
        --loss;
    }
    
    public void getWinCount() {
        
    }
}