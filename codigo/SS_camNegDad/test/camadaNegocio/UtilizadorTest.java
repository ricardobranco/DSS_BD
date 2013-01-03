/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaNegocio;

import java.util.Map;
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
public class UtilizadorTest {
    
    public UtilizadorTest() {
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
     * Test of getHistoricoAnunc method, of class Utilizador.
     */
    @Test
    public void testGetHistoricoAnunc() {
        System.out.println("getHistoricoAnunc");
        Utilizador instance = new Utilizador();
        Map expResult = null;
        Map result = instance.getHistoricoAnunc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHistoricoAnunc method, of class Utilizador.
     */
    @Test
    public void testSetHistoricoAnunc() {
        System.out.println("setHistoricoAnunc");
        Map<Integer, Anuncio> historicoAnunc = null;
        Utilizador instance = new Utilizador();
        instance.setHistoricoAnunc(historicoAnunc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Utilizador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Utilizador instance = new Utilizador();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Utilizador.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int idArg = 0;
        Utilizador instance = new Utilizador();
        instance.setId(idArg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Utilizador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Utilizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Utilizador.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Utilizador instance = new Utilizador();
        Utilizador expResult = null;
        Utilizador result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirAnuncVisit method, of class Utilizador.
     */
    @Test
    public void testInserirAnuncVisit() {
        System.out.println("inserirAnuncVisit");
        Anuncio a = null;
        Utilizador instance = new Utilizador();
        Anuncio expResult = null;
        Anuncio result = instance.inserirAnuncVisit(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAnuncVisit method, of class Utilizador.
     */
    @Test
    public void testRemoverAnuncVisit() {
        System.out.println("removerAnuncVisit");
        int codAnunc = 0;
        Utilizador instance = new Utilizador();
        Anuncio expResult = null;
        Anuncio result = instance.removerAnuncVisit(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarAnuncVisit method, of class Utilizador.
     */
    @Test
    public void testEncontrarAnuncVisit() {
        System.out.println("encontrarAnuncVisit");
        int codAnunc = 0;
        Utilizador instance = new Utilizador();
        Anuncio expResult = null;
        Anuncio result = instance.encontrarAnuncVisit(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeAnuncVisit method, of class Utilizador.
     */
    @Test
    public void testExisteAnuncVisit() {
        System.out.println("existeAnuncVisit");
        int codAnunc = 0;
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.existeAnuncVisit(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temAnuncVisits method, of class Utilizador.
     */
    @Test
    public void testTemAnuncVisits() {
        System.out.println("temAnuncVisits");
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.temAnuncVisits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullAnuncVisits method, of class Utilizador.
     */
    @Test
    public void testENullAnuncVisits() {
        System.out.println("eNullAnuncVisits");
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.eNullAnuncVisits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limparAnuncVisits method, of class Utilizador.
     */
    @Test
    public void testLimparAnuncVisits() {
        System.out.println("limparAnuncVisits");
        Utilizador instance = new Utilizador();
        instance.limparAnuncVisits();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
