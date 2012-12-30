/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaNegocio;

import java.util.GregorianCalendar;
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
public class UtilizadorRegistadoTest {
    
    public UtilizadorRegistadoTest() {
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
     * Test of getUsername method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        UtilizadorRegistado instance = null;
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        UtilizadorRegistado instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        UtilizadorRegistado instance = null;
        char expResult = ' ';
        char result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        char estado = ' ';
        UtilizadorRegistado instance = null;
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        UtilizadorRegistado instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMorada method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMorada method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetMorada() {
        System.out.println("setMorada");
        String morada = "";
        UtilizadorRegistado instance = null;
        instance.setMorada(morada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodPostal method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetCodPostal() {
        System.out.println("getCodPostal");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getCodPostal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodPostal method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetCodPostal() {
        System.out.println("setCodPostal");
        String codPostal = "";
        UtilizadorRegistado instance = null;
        instance.setCodPostal(codPostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalidade method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetLocalidade() {
        System.out.println("getLocalidade");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getLocalidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalidade method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetLocalidade() {
        System.out.println("setLocalidade");
        String localidade = "";
        UtilizadorRegistado instance = null;
        instance.setLocalidade(localidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getPais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPais method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        String pais = "";
        UtilizadorRegistado instance = null;
        instance.setPais(pais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInfPessoal method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetInfPessoal() {
        System.out.println("getInfPessoal");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getInfPessoal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInfPessoal method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetInfPessoal() {
        System.out.println("setInfPessoal");
        String infPessoal = "";
        UtilizadorRegistado instance = null;
        instance.setInfPessoal(infPessoal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagem method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetImagem() {
        System.out.println("getImagem");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getImagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagem method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetImagem() {
        System.out.println("setImagem");
        String imagem = "";
        UtilizadorRegistado instance = null;
        instance.setImagem(imagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContacto method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetContacto() {
        System.out.println("getContacto");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getContacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContacto method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetContacto() {
        System.out.println("setContacto");
        String contacto = "";
        UtilizadorRegistado instance = null;
        instance.setContacto(contacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        UtilizadorRegistado instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNasc method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetDataNasc() {
        System.out.println("getDataNasc");
        UtilizadorRegistado instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDataNasc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdade method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        GregorianCalendar dn = null;
        UtilizadorRegistado instance = null;
        instance.setIdade(dn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersSeguidos method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetUsersSeguidos() {
        System.out.println("getUsersSeguidos");
        UtilizadorRegistado instance = null;
        Map expResult = null;
        Map result = instance.getUsersSeguidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsersSeguidos method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetUsersSeguidos() {
        System.out.println("setUsersSeguidos");
        Map<String, UtilizadorRegistado> usersSeguidos = null;
        UtilizadorRegistado instance = null;
        instance.setUsersSeguidos(usersSeguidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnviadas method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetEnviadas() {
        System.out.println("getEnviadas");
        UtilizadorRegistado instance = null;
        Map expResult = null;
        Map result = instance.getEnviadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnviadas method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetEnviadas() {
        System.out.println("setEnviadas");
        Map<Integer, Mensagem> enviadas = null;
        UtilizadorRegistado instance = null;
        instance.setEnviadas(enviadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecebidas method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetRecebidas() {
        System.out.println("getRecebidas");
        UtilizadorRegistado instance = null;
        Map expResult = null;
        Map result = instance.getRecebidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecebidas method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetRecebidas() {
        System.out.println("setRecebidas");
        Map<Integer, Mensagem> recebidas = null;
        UtilizadorRegistado instance = null;
        instance.setRecebidas(recebidas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnuncSeguidos method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetAnuncSeguidos() {
        System.out.println("getAnuncSeguidos");
        UtilizadorRegistado instance = null;
        Map expResult = null;
        Map result = instance.getAnuncSeguidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnuncSeguidos method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetAnuncSeguidos() {
        System.out.println("setAnuncSeguidos");
        Map<Integer, Anuncio> anuncSeguidos = null;
        UtilizadorRegistado instance = null;
        instance.setAnuncSeguidos(anuncSeguidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategSeguidas method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetCategSeguidas() {
        System.out.println("getCategSeguidas");
        UtilizadorRegistado instance = null;
        Map expResult = null;
        Map result = instance.getCategSeguidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategSeguidas method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetCategSeguidas() {
        System.out.println("setCategSeguidas");
        Map<String, Categoria> categSeguidas = null;
        UtilizadorRegistado instance = null;
        instance.setCategSeguidas(categSeguidas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransaccoes method, of class UtilizadorRegistado.
     */
    @Test
    public void testGetTransaccoes() {
        System.out.println("getTransaccoes");
        UtilizadorRegistado instance = null;
        Map expResult = null;
        Map result = instance.getTransaccoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransaccoes method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetTransaccoes() {
        System.out.println("setTransaccoes");
        Map<Integer, Transaccao> transaccoes = null;
        UtilizadorRegistado instance = null;
        instance.setTransaccoes(transaccoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class UtilizadorRegistado.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UtilizadorRegistado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UtilizadorRegistado instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class UtilizadorRegistado.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        UtilizadorRegistado instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirTransaccao method, of class UtilizadorRegistado.
     */
    @Test
    public void testInserirTransaccao() {
        System.out.println("inserirTransaccao");
        Transaccao t = null;
        UtilizadorRegistado instance = null;
        Transaccao expResult = null;
        Transaccao result = instance.inserirTransaccao(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerTransaccao method, of class UtilizadorRegistado.
     */
    @Test
    public void testRemoverTransaccao() {
        System.out.println("removerTransaccao");
        int codTransac = 0;
        UtilizadorRegistado instance = null;
        Transaccao expResult = null;
        Transaccao result = instance.removerTransaccao(codTransac);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarTransaccao method, of class UtilizadorRegistado.
     */
    @Test
    public void testEncontrarTransaccao() {
        System.out.println("encontrarTransaccao");
        int codTransac = 0;
        UtilizadorRegistado instance = null;
        Transaccao expResult = null;
        Transaccao result = instance.encontrarTransaccao(codTransac);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeTransaccao method, of class UtilizadorRegistado.
     */
    @Test
    public void testExisteTransaccao() {
        System.out.println("existeTransaccao");
        int codTransac = 0;
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.existeTransaccao(codTransac);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temTransaccoes method, of class UtilizadorRegistado.
     */
    @Test
    public void testTemTransaccoes() {
        System.out.println("temTransaccoes");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.temTransaccoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullTransacc method, of class UtilizadorRegistado.
     */
    @Test
    public void testENullTransacc() {
        System.out.println("eNullTransacc");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.eNullTransacc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirUserSeguido method, of class UtilizadorRegistado.
     */
    @Test
    public void testInserirUserSeguido() {
        System.out.println("inserirUserSeguido");
        UtilizadorRegistado u = null;
        UtilizadorRegistado instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.inserirUserSeguido(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerUserSeguido method, of class UtilizadorRegistado.
     */
    @Test
    public void testRemoverUserSeguido() {
        System.out.println("removerUserSeguido");
        String username = "";
        UtilizadorRegistado instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.removerUserSeguido(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarUserSeguido method, of class UtilizadorRegistado.
     */
    @Test
    public void testEncontrarUserSeguido() {
        System.out.println("encontrarUserSeguido");
        String username = "";
        UtilizadorRegistado instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.encontrarUserSeguido(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeUserSeguido method, of class UtilizadorRegistado.
     */
    @Test
    public void testExisteUserSeguido() {
        System.out.println("existeUserSeguido");
        String username = "";
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.existeUserSeguido(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temUserSeguidos method, of class UtilizadorRegistado.
     */
    @Test
    public void testTemUserSeguidos() {
        System.out.println("temUserSeguidos");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.temUserSeguidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullUserSeguidos method, of class UtilizadorRegistado.
     */
    @Test
    public void testENullUserSeguidos() {
        System.out.println("eNullUserSeguidos");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.eNullUserSeguidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirMsgEnv method, of class UtilizadorRegistado.
     */
    @Test
    public void testInserirMsgEnv() {
        System.out.println("inserirMsgEnv");
        Mensagem mensagem = null;
        UtilizadorRegistado instance = null;
        Mensagem expResult = null;
        Mensagem result = instance.inserirMsgEnv(mensagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerMsgEnv method, of class UtilizadorRegistado.
     */
    @Test
    public void testRemoverMsgEnv() {
        System.out.println("removerMsgEnv");
        int codMsg = 0;
        UtilizadorRegistado instance = null;
        Mensagem expResult = null;
        Mensagem result = instance.removerMsgEnv(codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarMsgEnv method, of class UtilizadorRegistado.
     */
    @Test
    public void testEncontrarMsgEnv() {
        System.out.println("encontrarMsgEnv");
        int codMsg = 0;
        UtilizadorRegistado instance = null;
        Mensagem expResult = null;
        Mensagem result = instance.encontrarMsgEnv(codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeMsgEnv method, of class UtilizadorRegistado.
     */
    @Test
    public void testExisteMsgEnv() {
        System.out.println("existeMsgEnv");
        int codMsg = 0;
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.existeMsgEnv(codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temMsgEnvs method, of class UtilizadorRegistado.
     */
    @Test
    public void testTemMsgEnvs() {
        System.out.println("temMsgEnvs");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.temMsgEnvs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullMsgEnvs method, of class UtilizadorRegistado.
     */
    @Test
    public void testENullMsgEnvs() {
        System.out.println("eNullMsgEnvs");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.eNullMsgEnvs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirMsgRec method, of class UtilizadorRegistado.
     */
    @Test
    public void testInserirMsgRec() {
        System.out.println("inserirMsgRec");
        Mensagem mensagem = null;
        UtilizadorRegistado instance = null;
        Mensagem expResult = null;
        Mensagem result = instance.inserirMsgRec(mensagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerMsgRec method, of class UtilizadorRegistado.
     */
    @Test
    public void testRemoverMsgRec() {
        System.out.println("removerMsgRec");
        int codMsg = 0;
        UtilizadorRegistado instance = null;
        Mensagem expResult = null;
        Mensagem result = instance.removerMsgRec(codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarMsgRec method, of class UtilizadorRegistado.
     */
    @Test
    public void testEncontrarMsgRec() {
        System.out.println("encontrarMsgRec");
        int codMsg = 0;
        UtilizadorRegistado instance = null;
        Mensagem expResult = null;
        Mensagem result = instance.encontrarMsgRec(codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeMsgRec method, of class UtilizadorRegistado.
     */
    @Test
    public void testExisteMsgRec() {
        System.out.println("existeMsgRec");
        int codMsg = 0;
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.existeMsgRec(codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temMsgRecs method, of class UtilizadorRegistado.
     */
    @Test
    public void testTemMsgRecs() {
        System.out.println("temMsgRecs");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.temMsgRecs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullMsgRecs method, of class UtilizadorRegistado.
     */
    @Test
    public void testENullMsgRecs() {
        System.out.println("eNullMsgRecs");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.eNullMsgRecs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirAnuncSeguido method, of class UtilizadorRegistado.
     */
    @Test
    public void testInserirAnuncSeguido() {
        System.out.println("inserirAnuncSeguido");
        Anuncio a = null;
        UtilizadorRegistado instance = null;
        Anuncio expResult = null;
        Anuncio result = instance.inserirAnuncSeguido(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAnuncSeguido method, of class UtilizadorRegistado.
     */
    @Test
    public void testRemoverAnuncSeguido() {
        System.out.println("removerAnuncSeguido");
        int codAnunc = 0;
        UtilizadorRegistado instance = null;
        Anuncio expResult = null;
        Anuncio result = instance.removerAnuncSeguido(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarAnuncSeguido method, of class UtilizadorRegistado.
     */
    @Test
    public void testEncontrarAnuncSeguido() {
        System.out.println("encontrarAnuncSeguido");
        int codAnunc = 0;
        UtilizadorRegistado instance = null;
        Anuncio expResult = null;
        Anuncio result = instance.encontrarAnuncSeguido(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeAnuncSeguido method, of class UtilizadorRegistado.
     */
    @Test
    public void testExisteAnuncSeguido() {
        System.out.println("existeAnuncSeguido");
        int codAnunc = 0;
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.existeAnuncSeguido(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temAnuncSeguidos method, of class UtilizadorRegistado.
     */
    @Test
    public void testTemAnuncSeguidos() {
        System.out.println("temAnuncSeguidos");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.temAnuncSeguidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullAnuncSeguidos method, of class UtilizadorRegistado.
     */
    @Test
    public void testENullAnuncSeguidos() {
        System.out.println("eNullAnuncSeguidos");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.eNullAnuncSeguidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirCategSeguida method, of class UtilizadorRegistado.
     */
    @Test
    public void testInserirCategSeguida() {
        System.out.println("inserirCategSeguida");
        Categoria c = null;
        UtilizadorRegistado instance = null;
        Categoria expResult = null;
        Categoria result = instance.inserirCategSeguida(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerCategSeguida method, of class UtilizadorRegistado.
     */
    @Test
    public void testRemoverCategSeguida() {
        System.out.println("removerCategSeguida");
        String categoria = "";
        UtilizadorRegistado instance = null;
        Categoria expResult = null;
        Categoria result = instance.removerCategSeguida(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarCategSeguida method, of class UtilizadorRegistado.
     */
    @Test
    public void testEncontrarCategSeguida() {
        System.out.println("encontrarCategSeguida");
        String categoria = "";
        UtilizadorRegistado instance = null;
        Categoria expResult = null;
        Categoria result = instance.encontrarCategSeguida(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeCategSeguida method, of class UtilizadorRegistado.
     */
    @Test
    public void testExisteCategSeguida() {
        System.out.println("existeCategSeguida");
        String categoria = "";
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.existeCategSeguida(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temCategSeguidas method, of class UtilizadorRegistado.
     */
    @Test
    public void testTemCategSeguidas() {
        System.out.println("temCategSeguidas");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.temCategSeguidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullCategSeguidas method, of class UtilizadorRegistado.
     */
    @Test
    public void testENullCategSeguidas() {
        System.out.println("eNullCategSeguidas");
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.eNullCategSeguidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMsgLida method, of class UtilizadorRegistado.
     */
    @Test
    public void testSetMsgLida() {
        System.out.println("setMsgLida");
        int codMsg = 0;
        UtilizadorRegistado instance = null;
        instance.setMsgLida(codMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaMsgLida method, of class UtilizadorRegistado.
     */
    @Test
    public void testEstaMsgLida() {
        System.out.println("estaMsgLida");
        int codMsg = 0;
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.estaMsgLida(codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwordCorresponde method, of class UtilizadorRegistado.
     */
    @Test
    public void testPasswordCorresponde() {
        System.out.println("passwordCorresponde");
        String pw = "";
        UtilizadorRegistado instance = null;
        boolean expResult = false;
        boolean result = instance.passwordCorresponde(pw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compradorTransaccao method, of class UtilizadorRegistado.
     */
    @Test
    public void testCompradorTransaccao() {
        System.out.println("compradorTransaccao");
        int codTransac = 0;
        UtilizadorRegistado instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.compradorTransaccao(codTransac);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaEmail method, of class UtilizadorRegistado.
     */
    @Test
    public void testValidaEmail() {
        System.out.println("validaEmail");
        String emailArg = "";
        boolean expResult = false;
        boolean result = UtilizadorRegistado.validaEmail(emailArg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaPassword method, of class UtilizadorRegistado.
     */
    @Test
    public void testValidaPassword() {
        System.out.println("validaPassword");
        String pw = "";
        boolean expResult = false;
        boolean result = UtilizadorRegistado.validaPassword(pw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
