/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bapperley
 */
public class StageResultsTest {
    
    public StageResultsTest() {
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
     * Test of getStage2Average method, of class StageResults.
     */
    @Test
    public void testGetStage2Average() {
        System.out.println("getStage2Average");
        StageResults instance = new StageResults();
        double expResult = 0.0;
        double result = instance.getStage2Average();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCredits method, of class StageResults.
     */
    @Test
    public void testGetTotalCredits() {
        System.out.println("getTotalCredits");
        StageResults instance = new StageResults();
        int expResult = 0;
        int result = instance.getTotalCredits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalMarks method, of class StageResults.
     */
    @Test
    public void testGetTotalMarks() {
        System.out.println("getTotalMarks");
        StageResults instance = new StageResults();
        double expResult = 0.0;
        double result = instance.getTotalMarks();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStage2Average method, of class StageResults.
     */
    @Test
    public void testSetStage2Average() {
        System.out.println("setStage2Average");
        double stage2Average = 0.0;
        StageResults instance = new StageResults();
        instance.setStage2Average(stage2Average);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isComplete method, of class StageResults.
     */
    @Test
    public void testIsComplete() {
        System.out.println("isComplete");
        StageResults instance = new StageResults();
        boolean expResult = false;
        boolean result = instance.isComplete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetValues method, of class StageResults.
     */
    @Test
    public void testResetValues() {
        System.out.println("resetValues");
        StageResults instance = new StageResults();
        instance.resetValues();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModuleMark method, of class StageResults.
     */
    @Test
    public void testAddModuleMark() {
        System.out.println("addModuleMark");
        int credits = 0;
        double mark = 0.0;
        StageResults instance = new StageResults();
        instance.addModuleMark(credits, mark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateAverageSoFar method, of class StageResults.
     */
    @Test
    public void testCalculateAverageSoFar() {
        System.out.println("calculateAverageSoFar");
        StageResults instance = new StageResults();
        double expResult = 0.0;
        double result = instance.calculateAverageSoFar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of predictClass method, of class StageResults.
     */
    @Test
    public void testPredictClass() {
        System.out.println("predictClass");
        StageResults instance = new StageResults();
        String expResult = "";
        String result = instance.predictClass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
