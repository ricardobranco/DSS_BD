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
public class VendaDirectaTest {
    
    public VendaDirectaTest() {
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
     * Test of getnPropostas method, of class VendaDirecta.
     */
    @Test
    public void testGetnPropostas() {
        System.out.println("getnPropostas");
        VendaDirecta instance = null;
        int expResult = 0;
        int result = instance.getnPropostas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnPropostas method, of class VendaDirecta.
     */
    @Test
    public void testSetnPropostas() {
        System.out.println("setnPropostas");
        int nPropostas = 0;
        VendaDirecta instance = null;
        instance.setnPropostas(nPropostas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class VendaDirecta.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        VendaDirecta instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class VendaDirecta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        VendaDirecta instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class VendaDirecta.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        VendaDirecta instance = null;
        VendaDirecta expResult = null;
        VendaDirecta result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
