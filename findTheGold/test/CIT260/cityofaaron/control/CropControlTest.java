/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.cityofaaron.control;

import CIT260.cityofaaron.beans.CropData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maximus
 */
public class CropControlTest {
    
    public CropControlTest() {
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
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand_0args() {
        System.out.println("buyLand");
        int expResult = 0;
        int result = CropControl.buyLand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand_3args() {
        System.out.println("buyLand");
        int priceOfLand = 0;
        int acresToBuy = 0;
        CropData = null;
        CropControl instance = new CropControl();
        int expResult = 0;
        int result = instance.buyLand(priceOfLand, acresToBuy, <error>);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testBuyLand method, of class CropControl.
     */
    @Test
    public void testTestBuyLand() {
        System.out.println("testBuyLand");
        CropControl instance = new CropControl();
        instance.testBuyLand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payOffering method, of class CropControl.
     */
    @Test
    public void testPayOffering() {
        System.out.println("payOffering");
        int harvest = 0;
        int expResult = 0;
        int result = CropControl.payOffering(harvest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
