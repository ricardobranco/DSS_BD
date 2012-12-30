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
public class TrocaTest {
    
    public TrocaTest() {
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
     * Test of getAnuncioComp method, of class Troca.
     */
    @Test
    public void testGetAnuncioComp() {
        System.out.println("getAnuncioComp");
        Troca instance = null;
        Anuncio expResult = null;
        Anuncio result = instance.getAnuncioComp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnuncioComp method, of class Troca.
     */
    @Test
    public void testSetAnuncioComp() {
        System.out.println("setAnuncioComp");
        Anuncio anuncioComp = null;
        Troca instance = null;
        instance.setAnuncioComp(anuncioComp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Troca.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Troca instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Troca.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Troca instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Troca.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Troca instance = null;
        Troca expResult = null;
        Troca result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
