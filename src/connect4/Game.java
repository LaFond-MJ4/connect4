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
    
    public Game(String playerName) {
        win = 0;
        loss= 0;
        player = playerName;
    }
    
    public void addWin() { 
        ++win;
    }
    
    public void addLoss() {
        --loss;
    }
    
    public void checkScore() {
        if () {
            
        }
    }
  
    public void winAGame(Game a, Game b) {
    win = win + 1;
 
  }
}

