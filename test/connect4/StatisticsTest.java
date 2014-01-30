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
        int won = 0;
        int loss = 0;
        int tie = 0;
        System.out.println("Get winning Score - Test 1");
        Statistics instance = new Statistics();
        int expResult = 0;
        int result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        //test 2
        won = 2;
        loss = 1;
        tie = 0;
        System.out.println("test 2");
        expResult = 1;
        result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        //test 3
        won = 1;
        loss = 1;
        tie = 1;
        System.out.println("test 3");
        expResult = 1;
        result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        //test 4
        won = 8;
        loss = 0;
        tie = 0;
        System.out.println("test 4");
        expResult = 8;
        result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        //test 5
        won = 6;
        loss = 6;
        tie = 6;
        System.out.println("test 5");
        expResult = 6;
        result = instance.displayScore(won, loss, tie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }
    
}
