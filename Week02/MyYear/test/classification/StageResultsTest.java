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
    
    private StageResults empty; // will have no credits and no marks
    private StageResults full; // will have 120 credits and marks
    private StageResults halfFull; // will have 60 credits and some marks

    
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
        // empty - object that starts with default values
        empty = new StageResults();

        // full - object with 120 credits-worth of marks but no
        // initial stage2Average
        full = new StageResults();
        full.addModuleMark(120, 50.0);

        // halfFull - object with 60 credits worth of marks and
        // no initial stage2Average
        halfFull = new StageResults();
        halfFull.addModuleMark(60, 50.0);
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
        //StageResults instance = new StageResults();
        //boolean expResult = false;
        //boolean result = instance.isComplete();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertFalse("empty object", empty.isComplete());
        assertTrue("full object", full.isComplete());
        assertFalse("half full object", halfFull.isComplete());
    }

    /**
     * Test of resetValues method, of class StageResults.
     */
    @Test
    public void testResetValues() {
        System.out.println("Testing resetValues");

        // Set the state of the 'full' object to zeroes
        full.resetValues();

        // Set expected results
        int expIntResult = 0;
        double expDoubleResult = 0.0;

        // Now check each attribute to test that the reset has worked
        assertEquals("credits", expIntResult, full.getTotalCredits());
        assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);

        // Put the 'full' object back to its original state
        full.addModuleMark(120, 50.0);
    }

    /**
     * Test of addModuleMark method, of class StageResults.
     */
    @Test
    public void testAddModuleMark() {
        System.out.println("Testing addModuleMark");
        
        empty.addModuleMark(10, 10);
        
        int expCreditResult = 10;
        double expMarkResult = 10;
        
        assertEquals("credits", expCreditResult, empty.getTotalCredits());
        assertEquals("marks", expMarkResult, empty.getTotalMarks(), 0.0);
        
        empty = new StageResults();
        
        empty.addModuleMark(20, 20);
        
        expCreditResult = 20;
        expMarkResult = 40;
        
        assertEquals("credits", expCreditResult, empty.getTotalCredits());
        assertEquals("marks", expMarkResult, empty.getTotalMarks(), 0.0);
        
        empty = new StageResults();
        
        
        empty.addModuleMark(40, 40);
        
        expCreditResult = 40;
        expMarkResult = 160;
        
        assertEquals("credits", expCreditResult, empty.getTotalCredits());
        assertEquals("marks", expMarkResult, empty.getTotalMarks(), 0.0);
        
        empty = new StageResults();
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
