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
public class PlayersTest {
    
    public PlayersTest() {
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
     * Test of playerTurn method, of class Players.
     */
    @Test
    public void testPlayerTurn() {
        //test 1
        System.out.println("Test 1");
        int x = 1;
        Players instance = new Players();
        int expResult = 1;
        int result = instance.playerTurn(x);
        assertEquals(expResult, result);
        
        //test 2
        System.out.println("Test 2");
        x = 13;
        expResult = 13;
        result = instance.playerTurn(x);
        assertEquals(expResult, result);
        
        //test 3
        System.out.println("Test 3");
        x = 11;
        expResult = 11;
        result = instance.playerTurn(x);
        assertEquals(expResult, result);
        
        //test 4
        System.out.println("Test 4");
        x = 12;
        expResult = 12;
        result = instance.playerTurn(x);
        assertEquals(expResult, result);
        
        //test 5
        System.out.println("Test 1");
        x = 0;
        expResult = 0;
        result = instance.playerTurn(x);
        assertEquals(expResult, result);
    }
    }
    
    
    

