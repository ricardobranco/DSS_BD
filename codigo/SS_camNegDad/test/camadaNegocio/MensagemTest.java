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
public class MensagemTest {
    
    public MensagemTest() {
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
     * Test of getId method, of class Mensagem.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Mensagem instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Mensagem.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Mensagem instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmissor method, of class Mensagem.
     */
    @Test
    public void testGetEmissor() {
        System.out.println("getEmissor");
        Mensagem instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.getEmissor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmissor method, of class Mensagem.
     */
    @Test
    public void testSetEmissor() {
        System.out.println("setEmissor");
        UtilizadorRegistado emissor = null;
        Mensagem instance = null;
        instance.setEmissor(emissor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReceptor method, of class Mensagem.
     */
    @Test
    public void testGetReceptor() {
        System.out.println("getReceptor");
        Mensagem instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.getReceptor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReceptor method, of class Mensagem.
     */
    @Test
    public void testSetReceptor() {
        System.out.println("setReceptor");
        UtilizadorRegistado receptor = null;
        Mensagem instance = null;
        instance.setReceptor(receptor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataEnvio method, of class Mensagem.
     */
    @Test
    public void testGetDataEnvio() {
        System.out.println("getDataEnvio");
        Mensagem instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDataEnvio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataEnvio method, of class Mensagem.
     */
    @Test
    public void testSetDataEnvio() {
        System.out.println("setDataEnvio");
        GregorianCalendar dataEnvio = null;
        Mensagem instance = null;
        instance.setDataEnvio(dataEnvio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssunto method, of class Mensagem.
     */
    @Test
    public void testGetAssunto() {
        System.out.println("getAssunto");
        Mensagem instance = null;
        String expResult = "";
        String result = instance.getAssunto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssunto method, of class Mensagem.
     */
    @Test
    public void testSetAssunto() {
        System.out.println("setAssunto");
        String assunto = "";
        Mensagem instance = null;
        instance.setAssunto(assunto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorpo method, of class Mensagem.
     */
    @Test
    public void testGetCorpo() {
        System.out.println("getCorpo");
        Mensagem instance = null;
        String expResult = "";
        String result = instance.getCorpo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorpo method, of class Mensagem.
     */
    @Test
    public void testSetCorpo() {
        System.out.println("setCorpo");
        String corpo = "";
        Mensagem instance = null;
        instance.setCorpo(corpo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLida method, of class Mensagem.
     */
    @Test
    public void testGetLida() {
        System.out.println("getLida");
        Mensagem instance = null;
        boolean expResult = false;
        boolean result = instance.getLida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLida method, of class Mensagem.
     */
    @Test
    public void testSetLida() {
        System.out.println("setLida");
        boolean lida = false;
        Mensagem instance = null;
        instance.setLida(lida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Mensagem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Mensagem instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Mensagem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mensagem instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Mensagem.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Mensagem instance = null;
        Mensagem expResult = null;
        Mensagem result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
