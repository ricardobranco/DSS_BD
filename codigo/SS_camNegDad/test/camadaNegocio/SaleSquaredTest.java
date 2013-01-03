/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaNegocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
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
public class SaleSquaredTest {
    
    public SaleSquaredTest() {
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
     * Test of getUsers method, of class SaleSquared.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        SaleSquared instance = new SaleSquared();
        Map expResult = null;
        Map result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsers method, of class SaleSquared.
     */
    @Test
    public void testSetUsers() {
        System.out.println("setUsers");
        Map<String, UtilizadorRegistado> users = null;
        SaleSquared instance = new SaleSquared();
        instance.setUsers(users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnuncios method, of class SaleSquared.
     */
    @Test
    public void testGetAnuncios() {
        System.out.println("getAnuncios");
        SaleSquared instance = new SaleSquared();
        Map expResult = null;
        Map result = instance.getAnuncios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnuncios method, of class SaleSquared.
     */
    @Test
    public void testSetAnuncios() {
        System.out.println("setAnuncios");
        Map<Integer, Anuncio> anuncios = null;
        SaleSquared instance = new SaleSquared();
        instance.setAnuncios(anuncios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategorias method, of class SaleSquared.
     */
    @Test
    public void testGetCategorias() {
        System.out.println("getCategorias");
        SaleSquared instance = new SaleSquared();
        Map expResult = null;
        Map result = instance.getCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategorias method, of class SaleSquared.
     */
    @Test
    public void testSetCategorias() {
        System.out.println("setCategorias");
        Map<String, Categoria> categorias = null;
        SaleSquared instance = new SaleSquared();
        instance.setCategorias(categorias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmSessao method, of class SaleSquared.
     */
    @Test
    public void testGetEmSessao() {
        System.out.println("getEmSessao");
        SaleSquared instance = new SaleSquared();
        int expResult = 0;
        int result = instance.getEmSessao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmSessao method, of class SaleSquared.
     */
    @Test
    public void testSetEmSessao() {
        System.out.println("setEmSessao");
        int emSessao = 0;
        SaleSquared instance = new SaleSquared();
        instance.setEmSessao(emSessao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SaleSquared.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SaleSquared.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SaleSquared instance = new SaleSquared();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirCategoria method, of class SaleSquared.
     */
    @Test
    public void testInserirCategoria() {
        System.out.println("inserirCategoria");
        Categoria c = null;
        SaleSquared instance = new SaleSquared();
        instance.inserirCategoria(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerCategoria method, of class SaleSquared.
     */
    @Test
    public void testRemoverCategoria() {
        System.out.println("removerCategoria");
        String categoria = "";
        SaleSquared instance = new SaleSquared();
        instance.removerCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarCategoria method, of class SaleSquared.
     */
    @Test
    public void testEncontrarCategoria() {
        System.out.println("encontrarCategoria");
        String categoria = "";
        SaleSquared instance = new SaleSquared();
        Categoria expResult = null;
        Categoria result = instance.encontrarCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeCategoria method, of class SaleSquared.
     */
    @Test
    public void testExisteCategoria() {
        System.out.println("existeCategoria");
        String categoria = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.existeCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temCategorias method, of class SaleSquared.
     */
    @Test
    public void testTemCategorias() {
        System.out.println("temCategorias");
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.temCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullCategorias method, of class SaleSquared.
     */
    @Test
    public void testENullCategorias() {
        System.out.println("eNullCategorias");
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eNullCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirUtilizadorReg method, of class SaleSquared.
     */
    @Test
    public void testInserirUtilizadorReg() {
        System.out.println("inserirUtilizadorReg");
        UtilizadorRegistado u = null;
        SaleSquared instance = new SaleSquared();
        instance.inserirUtilizadorReg(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerUtilizadorReg method, of class SaleSquared.
     */
    @Test
    public void testRemoverUtilizadorReg() {
        System.out.println("removerUtilizadorReg");
        String username = "";
        SaleSquared instance = new SaleSquared();
        instance.removerUtilizadorReg(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarUtilizadorReg method, of class SaleSquared.
     */
    @Test
    public void testEncontrarUtilizadorReg() {
        System.out.println("encontrarUtilizadorReg");
        String username = "";
        SaleSquared instance = new SaleSquared();
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.encontrarUtilizadorReg(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeUtilizadorReg method, of class SaleSquared.
     */
    @Test
    public void testExisteUtilizadorReg() {
        System.out.println("existeUtilizadorReg");
        String username = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.existeUtilizadorReg(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temUtilizadorRegs method, of class SaleSquared.
     */
    @Test
    public void testTemUtilizadorRegs() {
        System.out.println("temUtilizadorRegs");
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.temUtilizadorRegs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullUtilizadorRegs method, of class SaleSquared.
     */
    @Test
    public void testENullUtilizadorRegs() {
        System.out.println("eNullUtilizadorRegs");
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eNullUtilizadorRegs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirAnuncio method, of class SaleSquared.
     */
    @Test
    public void testInserirAnuncio() {
        System.out.println("inserirAnuncio");
        Anuncio a = null;
        SaleSquared instance = new SaleSquared();
        instance.inserirAnuncio(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAnuncio method, of class SaleSquared.
     */
    @Test
    public void testRemoverAnuncio() {
        System.out.println("removerAnuncio");
        int codAnunc = 0;
        SaleSquared instance = new SaleSquared();
        instance.removerAnuncio(codAnunc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarAnuncio method, of class SaleSquared.
     */
    @Test
    public void testEncontrarAnuncio() {
        System.out.println("encontrarAnuncio");
        int codAnunc = 0;
        SaleSquared instance = new SaleSquared();
        Anuncio expResult = null;
        Anuncio result = instance.encontrarAnuncio(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeAnuncio method, of class SaleSquared.
     */
    @Test
    public void testExisteAnuncio() {
        System.out.println("existeAnuncio");
        int codAnunc = 0;
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.existeAnuncio(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temAnuncios method, of class SaleSquared.
     */
    @Test
    public void testTemAnuncios() {
        System.out.println("temAnuncios");
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.temAnuncios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullAnuncios method, of class SaleSquared.
     */
    @Test
    public void testENullAnuncios() {
        System.out.println("eNullAnuncios");
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eNullAnuncios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seguirUser method, of class SaleSquared.
     */
    @Test
    public void testSeguirUser() {
        System.out.println("seguirUser");
        String uNameSeguidor = "";
        UtilizadorRegistado u = null;
        SaleSquared instance = new SaleSquared();
        instance.seguirUser(uNameSeguidor, u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seguirAnuncio method, of class SaleSquared.
     */
    @Test
    public void testSeguirAnuncio() {
        System.out.println("seguirAnuncio");
        String uName = "";
        Anuncio anuncio = null;
        SaleSquared instance = new SaleSquared();
        instance.seguirAnuncio(uName, anuncio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seguirCategoria method, of class SaleSquared.
     */
    @Test
    public void testSeguirCategoria() {
        System.out.println("seguirCategoria");
        String uName = "";
        Categoria categoria = null;
        SaleSquared instance = new SaleSquared();
        instance.seguirCategoria(uName, categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deixarSegUser method, of class SaleSquared.
     */
    @Test
    public void testDeixarSegUser() {
        System.out.println("deixarSegUser");
        String uNameSeguidor = "";
        String uNameSeguido = "";
        SaleSquared instance = new SaleSquared();
        instance.deixarSegUser(uNameSeguidor, uNameSeguido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deixarSegAnuncio method, of class SaleSquared.
     */
    @Test
    public void testDeixarSegAnuncio() {
        System.out.println("deixarSegAnuncio");
        String uNameSeguidor = "";
        int codAnunc = 0;
        SaleSquared instance = new SaleSquared();
        instance.deixarSegAnuncio(uNameSeguidor, codAnunc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deixarSegCategoria method, of class SaleSquared.
     */
    @Test
    public void testDeixarSegCategoria() {
        System.out.println("deixarSegCategoria");
        String uNameSeguidor = "";
        String categoria = "";
        SaleSquared instance = new SaleSquared();
        instance.deixarSegCategoria(uNameSeguidor, categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eUserSeguido method, of class SaleSquared.
     */
    @Test
    public void testEUserSeguido() {
        System.out.println("eUserSeguido");
        String uNameSeguidor = "";
        String uNameSeguido = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eUserSeguido(uNameSeguidor, uNameSeguido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eAnuncioSeguido method, of class SaleSquared.
     */
    @Test
    public void testEAnuncioSeguido() {
        System.out.println("eAnuncioSeguido");
        String uNameSeguidor = "";
        int codAnunc = 0;
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eAnuncioSeguido(uNameSeguidor, codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eCategoriaSeguida method, of class SaleSquared.
     */
    @Test
    public void testECategoriaSeguida() {
        System.out.println("eCategoriaSeguida");
        String uNameSeguidor = "";
        String categoria = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eCategoriaSeguida(uNameSeguidor, categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enviarMensagem method, of class SaleSquared.
     */
    @Test
    public void testEnviarMensagem() {
        System.out.println("enviarMensagem");
        Mensagem msgEnv = null;
        Mensagem msgRec = null;
        SaleSquared instance = new SaleSquared();
        instance.enviarMensagem(msgEnv, msgRec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagarMensagemRecebida method, of class SaleSquared.
     */
    @Test
    public void testApagarMensagemRecebida() {
        System.out.println("apagarMensagemRecebida");
        String user = "";
        int codMsg = 0;
        SaleSquared instance = new SaleSquared();
        instance.apagarMensagemRecebida(user, codMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagarMensagemEnviada method, of class SaleSquared.
     */
    @Test
    public void testApagarMensagemEnviada() {
        System.out.println("apagarMensagemEnviada");
        String user = "";
        int codMsg = 0;
        SaleSquared instance = new SaleSquared();
        instance.apagarMensagemEnviada(user, codMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marcarMsgComoLida method, of class SaleSquared.
     */
    @Test
    public void testMarcarMsgComoLida() {
        System.out.println("marcarMsgComoLida");
        String user = "";
        int codMsg = 0;
        SaleSquared instance = new SaleSquared();
        instance.marcarMsgComoLida(user, codMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaLida method, of class SaleSquared.
     */
    @Test
    public void testEstaLida() {
        System.out.println("estaLida");
        String user = "";
        int codMsg = 0;
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.estaLida(user, codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limparHistAnunc method, of class SaleSquared.
     */
    @Test
    public void testLimparHistAnunc() {
        System.out.println("limparHistAnunc");
        String user = "";
        SaleSquared instance = new SaleSquared();
        instance.limparHistAnunc(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarUserNome method, of class SaleSquared.
     */
    @Test
    public void testProcurarUserNome() {
        System.out.println("procurarUserNome");
        String user = "";
        SaleSquared instance = new SaleSquared();
        Set expResult = null;
        Set result = instance.procurarUserNome(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarUserMail method, of class SaleSquared.
     */
    @Test
    public void testProcurarUserMail() {
        System.out.println("procurarUserMail");
        String email = "";
        SaleSquared instance = new SaleSquared();
        Set expResult = null;
        Set result = instance.procurarUserMail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirProposta method, of class SaleSquared.
     */
    @Test
    public void testInserirProposta() {
        System.out.println("inserirProposta");
        Transaccao tVenda = null;
        Transaccao tCompra = null;
        SaleSquared instance = new SaleSquared();
        instance.inserirProposta(tVenda, tCompra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarPagamTransacc method, of class SaleSquared.
     */
    @Test
    public void testConfirmarPagamTransacc() {
        System.out.println("confirmarPagamTransacc");
        String vendedor = "";
        int codigoTrans = 0;
        SaleSquared instance = new SaleSquared();
        instance.confirmarPagamTransacc(vendedor, codigoTrans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarRecepTransacc method, of class SaleSquared.
     */
    @Test
    public void testConfirmarRecepTransacc() {
        System.out.println("confirmarRecepTransacc");
        String comprador = "";
        int codigoTrans = 0;
        SaleSquared instance = new SaleSquared();
        instance.confirmarRecepTransacc(comprador, codigoTrans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarPagamTroca method, of class SaleSquared.
     */
    @Test
    public void testConfirmarPagamTroca() {
        System.out.println("confirmarPagamTroca");
        String vendedor = "";
        int codigoTrans = 0;
        SaleSquared instance = new SaleSquared();
        instance.confirmarPagamTroca(vendedor, codigoTrans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarRecepTroca method, of class SaleSquared.
     */
    @Test
    public void testConfirmarRecepTroca() {
        System.out.println("confirmarRecepTroca");
        String comerciante = "";
        int codigoTrans = 0;
        SaleSquared instance = new SaleSquared();
        instance.confirmarRecepTroca(comerciante, codigoTrans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceitarPropostaTransacc method, of class SaleSquared.
     */
    @Test
    public void testAceitarPropostaTransacc() {
        System.out.println("aceitarPropostaTransacc");
        String vendedor = "";
        int codTransac = 0;
        SaleSquared instance = new SaleSquared();
        instance.aceitarPropostaTransacc(vendedor, codTransac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceitarPropostaTroca method, of class SaleSquared.
     */
    @Test
    public void testAceitarPropostaTroca() {
        System.out.println("aceitarPropostaTroca");
        String vendedor = "";
        int codTransac = 0;
        SaleSquared instance = new SaleSquared();
        instance.aceitarPropostaTroca(vendedor, codTransac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rejeitarProposta method, of class SaleSquared.
     */
    @Test
    public void testRejeitarProposta() {
        System.out.println("rejeitarProposta");
        String vendedorArg = "";
        int codTransac = 0;
        SaleSquared instance = new SaleSquared();
        instance.rejeitarProposta(vendedorArg, codTransac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioTags method, of class SaleSquared.
     */
    @Test
    public void testEditarAnuncioTags() {
        System.out.println("editarAnuncioTags");
        int codAnuncio = 0;
        Set<String> tags = null;
        SaleSquared instance = new SaleSquared();
        instance.editarAnuncioTags(codAnuncio, tags);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioCategorias method, of class SaleSquared.
     */
    @Test
    public void testEditarAnuncioCategorias() {
        System.out.println("editarAnuncioCategorias");
        int codAnuncio = 0;
        Set<String> categorias = null;
        SaleSquared instance = new SaleSquared();
        instance.editarAnuncioCategorias(codAnuncio, categorias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioDescricao method, of class SaleSquared.
     */
    @Test
    public void testEditarAnuncioDescricao() {
        System.out.println("editarAnuncioDescricao");
        int codAnuncio = 0;
        String descricao = "";
        SaleSquared instance = new SaleSquared();
        instance.editarAnuncioDescricao(codAnuncio, descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioQuantidade method, of class SaleSquared.
     */
    @Test
    public void testEditarAnuncioQuantidade() {
        System.out.println("editarAnuncioQuantidade");
        int codAnuncio = 0;
        int quantidade = 0;
        SaleSquared instance = new SaleSquared();
        instance.editarAnuncioQuantidade(codAnuncio, quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioTitulo method, of class SaleSquared.
     */
    @Test
    public void testEditarAnuncioTitulo() {
        System.out.println("editarAnuncioTitulo");
        int codAnuncio = 0;
        String titulo = "";
        SaleSquared instance = new SaleSquared();
        instance.editarAnuncioTitulo(codAnuncio, titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioImagens method, of class SaleSquared.
     */
    @Test
    public void testEditarAnuncioImagens() {
        System.out.println("editarAnuncioImagens");
        int codAnuncio = 0;
        Set<Imagem> imagens = null;
        SaleSquared instance = new SaleSquared();
        instance.editarAnuncioImagens(codAnuncio, imagens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioEstado method, of class SaleSquared.
     */
    @Test
    public void testEditarAnuncioEstado() {
        System.out.println("editarAnuncioEstado");
        int codAnuncio = 0;
        char estado = ' ';
        SaleSquared instance = new SaleSquared();
        instance.editarAnuncioEstado(codAnuncio, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incAnuncioVisitas method, of class SaleSquared.
     */
    @Test
    public void testIncAnuncioVisitas() {
        System.out.println("incAnuncioVisitas");
        int codAnuncio = 0;
        SaleSquared instance = new SaleSquared();
        instance.incAnuncioVisitas(codAnuncio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoUsername method, of class SaleSquared.
     */
    @Test
    public void testEditarRegistadoUsername() {
        System.out.println("editarRegistadoUsername");
        String username = "";
        String novoUsername = "";
        SaleSquared instance = new SaleSquared();
        instance.editarRegistadoUsername(username, novoUsername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoEmail method, of class SaleSquared.
     */
    @Test
    public void testEditarRegistadoEmail() {
        System.out.println("editarRegistadoEmail");
        String username = "";
        String email = "";
        SaleSquared instance = new SaleSquared();
        instance.editarRegistadoEmail(username, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoMorada method, of class SaleSquared.
     */
    @Test
    public void testEditarRegistadoMorada() {
        System.out.println("editarRegistadoMorada");
        String username = "";
        String morada = "";
        SaleSquared instance = new SaleSquared();
        instance.editarRegistadoMorada(username, morada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoInfPessoal method, of class SaleSquared.
     */
    @Test
    public void testEditarRegistadoInfPessoal() {
        System.out.println("editarRegistadoInfPessoal");
        String username = "";
        String informacaoP = "";
        SaleSquared instance = new SaleSquared();
        instance.editarRegistadoInfPessoal(username, informacaoP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoContacto method, of class SaleSquared.
     */
    @Test
    public void testEditarRegistadoContacto() {
        System.out.println("editarRegistadoContacto");
        String username = "";
        String contacto = "";
        SaleSquared instance = new SaleSquared();
        instance.editarRegistadoContacto(username, contacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoNome method, of class SaleSquared.
     */
    @Test
    public void testEditarRegistadoNome() {
        System.out.println("editarRegistadoNome");
        String username = "";
        String nome = "";
        SaleSquared instance = new SaleSquared();
        instance.editarRegistadoNome(username, nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoDataN method, of class SaleSquared.
     */
    @Test
    public void testEditarRegistadoDataN() {
        System.out.println("editarRegistadoDataN");
        String username = "";
        GregorianCalendar dataN = null;
        SaleSquared instance = new SaleSquared();
        instance.editarRegistadoDataN(username, dataN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarLeilaoLicitacao method, of class SaleSquared.
     */
    @Test
    public void testAdicionarLeilaoLicitacao() {
        System.out.println("adicionarLeilaoLicitacao");
        int codAnunc = 0;
        double valor = 0.0;
        SaleSquared instance = new SaleSquared();
        instance.adicionarLeilaoLicitacao(codAnunc, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarVendaDirectaProposta method, of class SaleSquared.
     */
    @Test
    public void testAdicionarVendaDirectaProposta() {
        System.out.println("adicionarVendaDirectaProposta");
        int codAnunc = 0;
        SaleSquared instance = new SaleSquared();
        instance.adicionarVendaDirectaProposta(codAnunc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temUserRating method, of class SaleSquared.
     */
    @Test
    public void testTemUserRating() {
        System.out.println("temUserRating");
        String username = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.temUserRating(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularRegistadoRating method, of class SaleSquared.
     */
    @Test
    public void testCalcularRegistadoRating() {
        System.out.println("calcularRegistadoRating");
        String username = "";
        SaleSquared instance = new SaleSquared();
        double expResult = 0.0;
        double result = instance.calcularRegistadoRating(username);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eUserConfiavel method, of class SaleSquared.
     */
    @Test
    public void testEUserConfiavel() {
        System.out.println("eUserConfiavel");
        String username = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eUserConfiavel(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarAnuncTag method, of class SaleSquared.
     */
    @Test
    public void testProcurarAnuncTag() {
        System.out.println("procurarAnuncTag");
        String nome = "";
        SaleSquared instance = new SaleSquared();
        Set expResult = null;
        Set result = instance.procurarAnuncTag(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarAnuncCat method, of class SaleSquared.
     */
    @Test
    public void testProcurarAnuncCat() {
        System.out.println("procurarAnuncCat");
        String nome = "";
        SaleSquared instance = new SaleSquared();
        Set expResult = null;
        Set result = instance.procurarAnuncCat(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarAnuncAvanc method, of class SaleSquared.
     */
    @Test
    public void testProcurarAnuncAvanc() {
        System.out.println("procurarAnuncAvanc");
        String[] campos = null;
        Object[] valores = null;
        SaleSquared instance = new SaleSquared();
        Set expResult = null;
        Set result = instance.procurarAnuncAvanc(campos, valores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avaliarAnuncio method, of class SaleSquared.
     */
    @Test
    public void testAvaliarAnuncio() {
        System.out.println("avaliarAnuncio");
        int codAnunc = 0;
        Avaliacao avaliacao = null;
        SaleSquared instance = new SaleSquared();
        instance.avaliarAnuncio(codAnunc, avaliacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avaliarTransac method, of class SaleSquared.
     */
    @Test
    public void testAvaliarTransac() {
        System.out.println("avaliarTransac");
        String avaliadorArg = "";
        int codTransac = 0;
        SaleSquared instance = new SaleSquared();
        instance.avaliarTransac(avaliadorArg, codTransac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarAnuncMaisVis method, of class SaleSquared.
     */
    @Test
    public void testProcurarAnuncMaisVis() {
        System.out.println("procurarAnuncMaisVis");
        SaleSquared instance = new SaleSquared();
        SortedSet expResult = null;
        SortedSet result = instance.procurarAnuncMaisVis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eValidoEmail method, of class SaleSquared.
     */
    @Test
    public void testEValidoEmail() {
        System.out.println("eValidoEmail");
        String email = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eValidoEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eValidaPassword method, of class SaleSquared.
     */
    @Test
    public void testEValidaPassword() {
        System.out.println("eValidaPassword");
        String pw = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eValidaPassword(pw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eValidoLogin method, of class SaleSquared.
     */
    @Test
    public void testEValidoLogin() {
        System.out.println("eValidoLogin");
        String username = "";
        String pw = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.eValidoLogin(username, pw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sugerirAnuncios method, of class SaleSquared.
     */
    @Test
    public void testSugerirAnuncios() {
        System.out.println("sugerirAnuncios");
        String username = "";
        ArrayList<Character> causa = null;
        SaleSquared instance = new SaleSquared();
        ArrayList expResult = null;
        ArrayList result = instance.sugerirAnuncios(username, causa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ePossivelTrocar method, of class SaleSquared.
     */
    @Test
    public void testEPossivelTrocar() {
        System.out.println("ePossivelTrocar");
        String comprador = "";
        String vendedor = "";
        SaleSquared instance = new SaleSquared();
        boolean expResult = false;
        boolean result = instance.ePossivelTrocar(comprador, vendedor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sugerirAnunciosTroca method, of class SaleSquared.
     */
    @Test
    public void testSugerirAnunciosTroca() {
        System.out.println("sugerirAnunciosTroca");
        String comprador = "";
        String vendedor = "";
        int codAnunc = 0;
        SaleSquared instance = new SaleSquared();
        SortedSet expResult = null;
        SortedSet result = instance.sugerirAnunciosTroca(comprador, vendedor, codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ultimosAnuncios method, of class SaleSquared.
     */
    @Test
    public void testUltimosAnuncios() {
        System.out.println("ultimosAnuncios");
        SaleSquared instance = new SaleSquared();
        Iterator expResult = null;
        Iterator result = instance.ultimosAnuncios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tempoRestanteLeilao method, of class SaleSquared.
     */
    @Test
    public void testTempoRestanteLeilao() {
        System.out.println("tempoRestanteLeilao");
        int codAnunc = 0;
        SaleSquared instance = new SaleSquared();
        long expResult = 0L;
        long result = instance.tempoRestanteLeilao(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anunciosSeguidos method, of class SaleSquared.
     */
    @Test
    public void testAnunciosSeguidos() {
        System.out.println("anunciosSeguidos");
        String username = "";
        SaleSquared instance = new SaleSquared();
        Collection expResult = null;
        Collection result = instance.anunciosSeguidos(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of topTags method, of class SaleSquared.
     */
    @Test
    public void testTopTags() {
        System.out.println("topTags");
        SaleSquared instance = new SaleSquared();
        SortedSet expResult = null;
        SortedSet result = instance.topTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarConexao method, of class SaleSquared.
     */
    @Test
    public void testIniciarConexao() {
        System.out.println("iniciarConexao");
        SaleSquared instance = new SaleSquared();
        instance.iniciarConexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of terminarConexao method, of class SaleSquared.
     */
    @Test
    public void testTerminarConexao() {
        System.out.println("terminarConexao");
        SaleSquared instance = new SaleSquared();
        instance.terminarConexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdMsg method, of class SaleSquared.
     */
    @Test
    public void testRegistaIdMsg() {
        System.out.println("registaIdMsg");
        SaleSquared instance = new SaleSquared();
        int expResult = 0;
        int result = instance.registaIdMsg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdTransac method, of class SaleSquared.
     */
    @Test
    public void testRegistaIdTransac() {
        System.out.println("registaIdTransac");
        SaleSquared instance = new SaleSquared();
        int expResult = 0;
        int result = instance.registaIdTransac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdAnuncio method, of class SaleSquared.
     */
    @Test
    public void testRegistaIdAnuncio() {
        System.out.println("registaIdAnuncio");
        SaleSquared instance = new SaleSquared();
        int expResult = 0;
        int result = instance.registaIdAnuncio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdAvaliacao method, of class SaleSquared.
     */
    @Test
    public void testRegistaIdAvaliacao() {
        System.out.println("registaIdAvaliacao");
        SaleSquared instance = new SaleSquared();
        int expResult = 0;
        int result = instance.registaIdAvaliacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdUtilizador method, of class SaleSquared.
     */
    @Test
    public void testRegistaIdUtilizador() {
        System.out.println("registaIdUtilizador");
        SaleSquared instance = new SaleSquared();
        int expResult = 0;
        int result = instance.registaIdUtilizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdModoVenda method, of class SaleSquared.
     */
    @Test
    public void testRegistaIdModoVenda() {
        System.out.println("registaIdModoVenda");
        SaleSquared instance = new SaleSquared();
        int expResult = 0;
        int result = instance.registaIdModoVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
