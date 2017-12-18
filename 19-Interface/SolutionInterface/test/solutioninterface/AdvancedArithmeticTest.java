/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutioninterface;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pondi Brian
 */
public class AdvancedArithmeticTest {
    
    public AdvancedArithmeticTest() {
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
     * Test of divisorSum method, of class AdvancedArithmetic.
     */
    @Test
    public void testDivisorSum() {
        System.out.println("divisorSum");
        int n = 0;
        AdvancedArithmetic instance = new AdvancedArithmeticImpl();
        int expResult = 0;
        int result = instance.divisorSum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AdvancedArithmeticImpl implements AdvancedArithmetic {

        public int divisorSum(int n) {
            return 0;
        }
    }
    
}
