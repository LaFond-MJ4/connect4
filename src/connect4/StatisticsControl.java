/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.io.Serializable;

/**
 *
 * @author Madison
 */
public class StatisticsControl extends Menu implements Serializable{

    public StatisticsControl() {

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

    private void displayStatistics() {
        System.out.println(
                "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String[][] players = {{"Bob", "7"}, {"Shelly", "5"}, {"Steve", "3"}, {"Carol","7"}, {"Jake","1"}};
        InsertionSort(players);
        for (int i = 0; i < players.length; i++) {
            System.out.print(players[i][0]);
            System.out.print(" ");
            System.out.println(players[i][1]);
        }
    }

    private static void InsertionSort(String[][] num) {
        int j;  // the number of items sorted so far
        int key;  // the item to be inserted
        int i;

        for (j = 1; j < num.length; j++) // Start with 1 (not 0)
        {
            key = Integer.parseInt(num[j][1]);
            String temp = num[j][0];
            for (i = j - 1; (i >= 0) && (Integer.parseInt(num[i][1]) < key); i--) // Smaller values are moving up
            {
                num[i + 1][0] = num[i][0];
                num[i + 1][1] = num[i][1];
            }
            num[i + 1][1] = Integer.toString(key);  // Put the key in its proper location
            num[i + 1][0] = temp;
        }
    }
}
