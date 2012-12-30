/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaNegocio;

import java.util.GregorianCalendar;
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
public class LeilaoTest {
    
    public LeilaoTest() {
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
     * Test of getPrecoActual method, of class Leilao.
     */
    @Test
    public void testGetPrecoActual() {
        System.out.println("getPrecoActual");
        Leilao instance = null;
        double expResult = 0.0;
        double result = instance.getPrecoActual();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecoActual method, of class Leilao.
     */
    @Test
    public void testSetPrecoActual() {
        System.out.println("setPrecoActual");
        double precoActual = 0.0;
        Leilao instance = null;
        instance.setPrecoActual(precoActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecoBase method, of class Leilao.
     */
    @Test
    public void testGetPrecoBase() {
        System.out.println("getPrecoBase");
        Leilao instance = null;
        Double expResult = null;
        Double result = instance.getPrecoBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecoBase method, of class Leilao.
     */
    @Test
    public void testSetPrecoBase() {
        System.out.println("setPrecoBase");
        Double precoBase = null;
        Leilao instance = null;
        instance.setPrecoBase(precoBase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFim method, of class Leilao.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        Leilao instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDataFim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFim method, of class Leilao.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        GregorianCalendar dataFim = null;
        Leilao instance = null;
        instance.setDataFim(dataFim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnLicitacoes method, of class Leilao.
     */
    @Test
    public void testGetnLicitacoes() {
        System.out.println("getnLicitacoes");
        Leilao instance = null;
        int expResult = 0;
        int result = instance.getnLicitacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnLicitacoes method, of class Leilao.
     */
    @Test
    public void testSetnLicitacoes() {
        System.out.println("setnLicitacoes");
        int nLicitacoes = 0;
        Leilao instance = null;
        instance.setnLicitacoes(nLicitacoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Leilao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Leilao instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Leilao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Leilao instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Leilao.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Leilao instance = null;
        Leilao expResult = null;
        Leilao result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaTempoRestante method, of class Leilao.
     */
    @Test
    public void testCalculaTempoRestante() {
        System.out.println("calculaTempoRestante");
        Leilao instance = null;
        long expResult = 0L;
        long result = instance.calculaTempoRestante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
