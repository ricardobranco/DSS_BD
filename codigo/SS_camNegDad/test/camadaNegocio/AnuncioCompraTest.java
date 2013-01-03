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
public class AnuncioCompraTest {
    
    public AnuncioCompraTest() {
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
     * Test of getRespostas method, of class AnuncioCompra.
     */
    @Test
    public void testGetRespostas() {
        System.out.println("getRespostas");
        AnuncioCompra instance = null;
        Map expResult = null;
        Map result = instance.getRespostas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRespostas method, of class AnuncioCompra.
     */
    @Test
    public void testSetRespostas() {
        System.out.println("setRespostas");
        Map<Integer, Anuncio> respostas = null;
        AnuncioCompra instance = null;
        instance.setRespostas(respostas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AnuncioCompra.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        AnuncioCompra instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AnuncioCompra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AnuncioCompra instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class AnuncioCompra.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        AnuncioCompra instance = null;
        AnuncioCompra expResult = null;
        AnuncioCompra result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirResposta method, of class AnuncioCompra.
     */
    @Test
    public void testInserirResposta() {
        System.out.println("inserirResposta");
        Anuncio a = null;
        AnuncioCompra instance = null;
        Anuncio expResult = null;
        Anuncio result = instance.inserirResposta(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerResposta method, of class AnuncioCompra.
     */
    @Test
    public void testRemoverResposta() {
        System.out.println("removerResposta");
        int codAnunc = 0;
        AnuncioCompra instance = null;
        Anuncio expResult = null;
        Anuncio result = instance.removerResposta(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarResposta method, of class AnuncioCompra.
     */
    @Test
    public void testEncontrarResposta() {
        System.out.println("encontrarResposta");
        int codAnunc = 0;
        AnuncioCompra instance = null;
        Anuncio expResult = null;
        Anuncio result = instance.encontrarResposta(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeResposta method, of class AnuncioCompra.
     */
    @Test
    public void testExisteResposta() {
        System.out.println("existeResposta");
        int codAnunc = 0;
        AnuncioCompra instance = null;
        boolean expResult = false;
        boolean result = instance.existeResposta(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temRespostas method, of class AnuncioCompra.
     */
    @Test
    public void testTemRespostas() {
        System.out.println("temRespostas");
        AnuncioCompra instance = null;
        boolean expResult = false;
        boolean result = instance.temRespostas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullRespostas method, of class AnuncioCompra.
     */
    @Test
    public void testENullRespostas() {
        System.out.println("eNullRespostas");
        AnuncioCompra instance = null;
        boolean expResult = false;
        boolean result = instance.eNullRespostas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
