/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.util.Scanner;

/**
 *
 * @author Madison
 */
public class GetMarkerColor {
    Players player = new Players();
    
    public String getColor() {

        String marker1 = null;
        String marker2 = null;
        Scanner in = new Scanner(System.in);

        boolean valid = false;
        while (!valid) {
            System.out.print("Player 1 please enter the desired letter that "
                    + "you want your marker to be: ");
            
            marker1 = in.nextLine();
            
            if (marker1 == null || marker1.length() < 1) {
                continue;
            }
            valid = true;
            
            boolean valid2 = false;
            while (!valid2) {
                System.out.print("Player 2 please enter the desired letter that "
                        + "you want your marker to be: ");

                marker2 = in.nextLine();

                if (marker2 == null || marker2.length() < 1) {
                    continue;
                }

                if (marker1.equals(marker2) || marker2.equals(marker1)) {
                    System.out.println("That letter is already in use. Please enter another letter.");
                    continue;
                }
                valid2 = true;
            }

        }
        return " Player 1 you are " + marker1 + "\nPlayer 2 you are " + marker2;
    }

    public void input() {
        System.out.println(getColor());
    }
}
