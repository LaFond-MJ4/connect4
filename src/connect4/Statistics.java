/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author Madison
 */
public class Statistics {
    int score;
    int won;
    int loss;
    int tie;
    
    

    
    public Statistics(){
    }
    
    public int displayScore(int won, int loss, int tie){    
        if (won == 0 & loss == 0 & tie == 0){
            score = 0;
            return score;
        }
        score = won - loss + tie;
        return score; 
    } 
   public int stats(){
       return displayScore(won, loss, tie);
    }
}
