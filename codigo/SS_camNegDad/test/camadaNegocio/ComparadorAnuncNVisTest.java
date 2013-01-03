/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaNegocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author psfdc
 */
public class ComparadorAnuncNVisTest {
    
    public ComparadorAnuncNVisTest() {
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
     * Test of compare method, of class ComparadorAnuncNVis.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Anuncio a = null;
        Anuncio b = null;
        ComparadorAnuncNVis instance = new ComparadorAnuncNVis();
        int expResult = 0;
        int result = instance.compare(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ComparadorAnuncNVis.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ComparadorAnuncNVis instance = new ComparadorAnuncNVis();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
