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
public class ImagemTest {
    
    public ImagemTest() {
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
     * Test of getNome method, of class Imagem.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Imagem instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Imagem.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Imagem instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class Imagem.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        Imagem instance = null;
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPath method, of class Imagem.
     */
    @Test
    public void testSetPath() {
        System.out.println("setPath");
        String path = "";
        Imagem instance = null;
        instance.setPath(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Imagem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Imagem instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Imagem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Imagem instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Imagem.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Imagem instance = null;
        Imagem expResult = null;
        Imagem result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
