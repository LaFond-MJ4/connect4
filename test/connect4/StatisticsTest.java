/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Madison
 */
public class StatisticsTest {
    
    public StatisticsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayPlayer method, of class Statistics.
     */
    @Test
    public void testDisplayPlayer() {
        //test 1
        int won = 3;
        int loss = 4;
        int tie = 6;
        System.out.println("Get winning Score - Test 1");
        Statistics instance = new Statistics();
        int expResult = 5;
        int result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
        
        
        //test 2
        won = -5;
        loss = 4;
        tie = 8;
        System.out.println("test 2");
        expResult = -7;
        result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
       
        
        //test 3
        won = 4;
        loss = -3;
        tie = -7;
        System.out.println("test 3");
        expResult = -7;
        result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
        
        //test 4
        won = 2;
        loss = 6;
        tie = -4;
        System.out.println("test 4");
        expResult = -7;
        result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
      
        
        //test 5
        won = 0;
        loss = 0;
        tie = 0;
        System.out.println("test 5");
        expResult = 0;
        result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
       
        
    }
    
}
