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
public class AvaliacaoTest {
    
    public AvaliacaoTest() {
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
     * Test of getId method, of class Avaliacao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Avaliacao instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Avaliacao.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Avaliacao instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvaliador method, of class Avaliacao.
     */
    @Test
    public void testGetAvaliador() {
        System.out.println("getAvaliador");
        Avaliacao instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.getAvaliador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvaliador method, of class Avaliacao.
     */
    @Test
    public void testSetAvaliador() {
        System.out.println("setAvaliador");
        UtilizadorRegistado avaliador = null;
        Avaliacao instance = null;
        instance.setAvaliador(avaliador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Avaliacao.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Avaliacao instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Avaliacao.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        GregorianCalendar data = null;
        Avaliacao instance = null;
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassificacao method, of class Avaliacao.
     */
    @Test
    public void testGetClassificacao() {
        System.out.println("getClassificacao");
        Avaliacao instance = null;
        double expResult = 0.0;
        double result = instance.getClassificacao();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassificacao method, of class Avaliacao.
     */
    @Test
    public void testSetClassificacao() {
        System.out.println("setClassificacao");
        double classificacao = 0.0;
        Avaliacao instance = null;
        instance.setClassificacao(classificacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class Avaliacao.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        Avaliacao instance = null;
        String expResult = "";
        String result = instance.getComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentario method, of class Avaliacao.
     */
    @Test
    public void testSetComentario() {
        System.out.println("setComentario");
        String comentario = "";
        Avaliacao instance = null;
        instance.setComentario(comentario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Avaliacao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Avaliacao instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Avaliacao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Avaliacao instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Avaliacao.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Avaliacao instance = null;
        Avaliacao expResult = null;
        Avaliacao result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
