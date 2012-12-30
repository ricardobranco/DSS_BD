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
public class ModoVendaTest {
    
    public ModoVendaTest() {
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
     * Test of getId method, of class ModoVenda.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ModoVenda instance = new ModoVendaImpl();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ModoVenda.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int idArg = 0;
        ModoVenda instance = new ModoVendaImpl();
        instance.setId(idArg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ModoVenda.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ModoVenda instance = new ModoVendaImpl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ModoVenda.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ModoVenda instance = new ModoVendaImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ModoVendaImpl extends ModoVenda {
    }
}
