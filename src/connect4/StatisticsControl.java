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
public class StatisticsControl {
    public StatisticsControl(){
    
}
    private Statistics statistics = new Statistics();
    
    public void displayLastStatistics() {
        System.out.println();
        this.displayStatistics();             
        System.out.println( 
                "Your statistics for this last game were " + statistics.stats());
        displayStatistics();
    }
    public void displayAllStatistics() {
        System.out.println();
        this.displayStatistics();             
        System.out.println( 
                "Your statistics overall are display overall statistics here");
        displayStatistics();
    }
    public void displayStatistics() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
