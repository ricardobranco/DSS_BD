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
public class ComparadorUltimosAnuncTest {
    
    public ComparadorUltimosAnuncTest() {
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
     * Test of compare method, of class ComparadorUltimosAnunc.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Anuncio a = null;
        Anuncio b = null;
        ComparadorUltimosAnunc instance = new ComparadorUltimosAnunc();
        int expResult = 0;
        int result = instance.compare(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ComparadorUltimosAnunc.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ComparadorUltimosAnunc instance = new ComparadorUltimosAnunc();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
