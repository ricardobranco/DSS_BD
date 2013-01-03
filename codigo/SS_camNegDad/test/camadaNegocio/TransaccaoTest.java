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
public class TransaccaoTest {
    
    public TransaccaoTest() {
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
     * Test of getAnuncio method, of class Transaccao.
     */
    @Test
    public void testGetAnuncio() {
        System.out.println("getAnuncio");
        Transaccao instance = null;
        Anuncio expResult = null;
        Anuncio result = instance.getAnuncio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnuncio method, of class Transaccao.
     */
    @Test
    public void testSetAnuncio() {
        System.out.println("setAnuncio");
        Anuncio anuncio = null;
        Transaccao instance = null;
        instance.setAnuncio(anuncio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendedor method, of class Transaccao.
     */
    @Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        Transaccao instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.getVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendedor method, of class Transaccao.
     */
    @Test
    public void testSetVendedor() {
        System.out.println("setVendedor");
        UtilizadorRegistado vendedor = null;
        Transaccao instance = null;
        instance.setVendedor(vendedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComprador method, of class Transaccao.
     */
    @Test
    public void testGetComprador() {
        System.out.println("getComprador");
        Transaccao instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.getComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComprador method, of class Transaccao.
     */
    @Test
    public void testSetComprador() {
        System.out.println("setComprador");
        UtilizadorRegistado comprador = null;
        Transaccao instance = null;
        instance.setComprador(comprador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Transaccao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Transaccao instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Transaccao.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Transaccao instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Transaccao.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Transaccao instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Transaccao.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        GregorianCalendar data = null;
        Transaccao instance = null;
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Transaccao.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Transaccao instance = null;
        double expResult = 0.0;
        double result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Transaccao.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        double valor = 0.0;
        Transaccao instance = null;
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModoPagamento method, of class Transaccao.
     */
    @Test
    public void testGetModoPagamento() {
        System.out.println("getModoPagamento");
        Transaccao instance = null;
        String expResult = "";
        String result = instance.getModoPagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModoPagamento method, of class Transaccao.
     */
    @Test
    public void testSetModoPagamento() {
        System.out.println("setModoPagamento");
        String modoPagamento = "";
        Transaccao instance = null;
        instance.setModoPagamento(modoPagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMorada method, of class Transaccao.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        Transaccao instance = null;
        String expResult = "";
        String result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMorada method, of class Transaccao.
     */
    @Test
    public void testSetMorada() {
        System.out.println("setMorada");
        String moradaFact = "";
        Transaccao instance = null;
        instance.setMorada(moradaFact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodPostalFact method, of class Transaccao.
     */
    @Test
    public void testGetCodPostalFact() {
        System.out.println("getCodPostalFact");
        Transaccao instance = null;
        String expResult = "";
        String result = instance.getCodPostalFact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodPostalFact method, of class Transaccao.
     */
    @Test
    public void testSetCodPostalFact() {
        System.out.println("setCodPostalFact");
        String codPostal = "";
        Transaccao instance = null;
        instance.setCodPostalFact(codPostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalidadeFact method, of class Transaccao.
     */
    @Test
    public void testGetLocalidadeFact() {
        System.out.println("getLocalidadeFact");
        Transaccao instance = null;
        String expResult = "";
        String result = instance.getLocalidadeFact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalidadeFact method, of class Transaccao.
     */
    @Test
    public void testSetLocalidadeFact() {
        System.out.println("setLocalidadeFact");
        String localidade = "";
        Transaccao instance = null;
        instance.setLocalidadeFact(localidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaisFact method, of class Transaccao.
     */
    @Test
    public void testGetPaisFact() {
        System.out.println("getPaisFact");
        Transaccao instance = null;
        String expResult = "";
        String result = instance.getPaisFact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaisFact method, of class Transaccao.
     */
    @Test
    public void testSetPaisFact() {
        System.out.println("setPaisFact");
        String pais = "";
        Transaccao instance = null;
        instance.setPaisFact(pais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Transaccao.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Transaccao instance = null;
        char expResult = ' ';
        char result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Transaccao.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        char estado = ' ';
        Transaccao instance = null;
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Transaccao.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Transaccao instance = null;
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Transaccao.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        Transaccao instance = null;
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Transaccao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Transaccao instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Transaccao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Transaccao instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Transaccao.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Transaccao instance = null;
        Transaccao expResult = null;
        Transaccao result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
