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
public class CategoriaTest {
    
    public CategoriaTest() {
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
     * Test of getNome method, of class Categoria.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Categoria instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Categoria.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Categoria instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoriaPai method, of class Categoria.
     */
    @Test
    public void testGetCategoriaPai() {
        System.out.println("getCategoriaPai");
        Categoria instance = null;
        Categoria expResult = null;
        Categoria result = instance.getCategoriaPai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoriaPai method, of class Categoria.
     */
    @Test
    public void testSetCategoriaPai() {
        System.out.println("setCategoriaPai");
        Categoria categoriaPai = null;
        Categoria instance = null;
        instance.setCategoriaPai(categoriaPai);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Categoria.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Categoria instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Categoria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Categoria instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Categoria.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Categoria instance = null;
        Categoria expResult = null;
        Categoria result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
