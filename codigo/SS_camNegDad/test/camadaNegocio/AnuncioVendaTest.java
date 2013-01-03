/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaNegocio;

import java.util.Set;
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
public class AnuncioVendaTest {
    
    public AnuncioVendaTest() {
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
     * Test of getTipoVenda method, of class AnuncioVenda.
     */
    @Test
    public void testGetTipoVenda() {
        System.out.println("getTipoVenda");
        AnuncioVenda instance = null;
        ModoVenda expResult = null;
        ModoVenda result = instance.getTipoVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoVenda method, of class AnuncioVenda.
     */
    @Test
    public void testSetTipoVenda() {
        System.out.println("setTipoVenda");
        ModoVenda tipoVenda = null;
        AnuncioVenda instance = null;
        instance.setTipoVenda(tipoVenda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModosPagamento method, of class AnuncioVenda.
     */
    @Test
    public void testGetModosPagamento() {
        System.out.println("getModosPagamento");
        AnuncioVenda instance = null;
        Set expResult = null;
        Set result = instance.getModosPagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModosPagamento method, of class AnuncioVenda.
     */
    @Test
    public void testSetModosPagamento() {
        System.out.println("setModosPagamento");
        Set<String> modosPagamento = null;
        AnuncioVenda instance = null;
        instance.setModosPagamento(modosPagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnvioEstrangeiro method, of class AnuncioVenda.
     */
    @Test
    public void testIsEnvioEstrangeiro() {
        System.out.println("isEnvioEstrangeiro");
        AnuncioVenda instance = null;
        boolean expResult = false;
        boolean result = instance.isEnvioEstrangeiro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnvioEstrangeiro method, of class AnuncioVenda.
     */
    @Test
    public void testSetEnvioEstrangeiro() {
        System.out.println("setEnvioEstrangeiro");
        boolean envioEstrangeiro = false;
        AnuncioVenda instance = null;
        instance.setEnvioEstrangeiro(envioEstrangeiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCondicoesEnvio method, of class AnuncioVenda.
     */
    @Test
    public void testGetCondicoesEnvio() {
        System.out.println("getCondicoesEnvio");
        AnuncioVenda instance = null;
        String expResult = "";
        String result = instance.getCondicoesEnvio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCondicoesEnvio method, of class AnuncioVenda.
     */
    @Test
    public void testSetCondicoesEnvio() {
        System.out.println("setCondicoesEnvio");
        String condicoesEnvio = "";
        AnuncioVenda instance = null;
        instance.setCondicoesEnvio(condicoesEnvio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeguro method, of class AnuncioVenda.
     */
    @Test
    public void testGetSeguro() {
        System.out.println("getSeguro");
        AnuncioVenda instance = null;
        double expResult = 0.0;
        double result = instance.getSeguro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeguro method, of class AnuncioVenda.
     */
    @Test
    public void testSetSeguro() {
        System.out.println("setSeguro");
        double seguro = 0.0;
        AnuncioVenda instance = null;
        instance.setSeguro(seguro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecoEnvio method, of class AnuncioVenda.
     */
    @Test
    public void testGetPrecoEnvio() {
        System.out.println("getPrecoEnvio");
        AnuncioVenda instance = null;
        double expResult = 0.0;
        double result = instance.getPrecoEnvio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecoEnvio method, of class AnuncioVenda.
     */
    @Test
    public void testSetPrecoEnvio() {
        System.out.println("setPrecoEnvio");
        double p = 0.0;
        AnuncioVenda instance = null;
        instance.setPrecoEnvio(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMetodoEnvio method, of class AnuncioVenda.
     */
    @Test
    public void testGetMetodoEnvio() {
        System.out.println("getMetodoEnvio");
        AnuncioVenda instance = null;
        String expResult = "";
        String result = instance.getMetodoEnvio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMetodoEnvio method, of class AnuncioVenda.
     */
    @Test
    public void testSetMetodoEnvio() {
        System.out.println("setMetodoEnvio");
        String metodoEnvio = "";
        AnuncioVenda instance = null;
        instance.setMetodoEnvio(metodoEnvio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPossivelTrocar method, of class AnuncioVenda.
     */
    @Test
    public void testGetPossivelTrocar() {
        System.out.println("getPossivelTrocar");
        AnuncioVenda instance = null;
        boolean expResult = false;
        boolean result = instance.getPossivelTrocar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPossivelTrocar method, of class AnuncioVenda.
     */
    @Test
    public void testSetPossivelTrocar() {
        System.out.println("setPossivelTrocar");
        boolean b = false;
        AnuncioVenda instance = null;
        instance.setPossivelTrocar(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AnuncioVenda.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        AnuncioVenda instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AnuncioVenda.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AnuncioVenda instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class AnuncioVenda.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        AnuncioVenda instance = null;
        AnuncioVenda expResult = null;
        AnuncioVenda result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarLicitacao method, of class AnuncioVenda.
     */
    @Test
    public void testAdicionarLicitacao() {
        System.out.println("adicionarLicitacao");
        double valor = 0.0;
        AnuncioVenda instance = null;
        instance.adicionarLicitacao(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarProposta method, of class AnuncioVenda.
     */
    @Test
    public void testAdicionarProposta() {
        System.out.println("adicionarProposta");
        AnuncioVenda instance = null;
        instance.adicionarProposta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaTempoRestanteLeilao method, of class AnuncioVenda.
     */
    @Test
    public void testCalculaTempoRestanteLeilao() {
        System.out.println("calculaTempoRestanteLeilao");
        AnuncioVenda instance = null;
        long expResult = 0L;
        long result = instance.calculaTempoRestanteLeilao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
