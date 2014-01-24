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
    int score1 = 100;
    int score2 = 100;
    int won1 = 100;
    int won2 = 100;
    
    public int player1Score(){
        return score1;
    }
    public int player2Score(){
        return score2;
    }
    public int player1Won(){
        return won1;
    }
    public int player2Won(){
        return won2;
    }
    public Statistics(int score1, int score2, int won1, int won2){
        this.score1 = score1;
        this.score2 = score2;
        this.won1 = won1;
        this.won2 = won2;
    }
    
    
}
