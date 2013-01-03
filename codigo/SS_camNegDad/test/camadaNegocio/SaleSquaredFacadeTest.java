/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaNegocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
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
public class SaleSquaredFacadeTest {
    
    public SaleSquaredFacadeTest() {
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
     * Test of inserirCategoria method, of class SaleSquaredFacade.
     */
    @Test
    public void testInserirCategoria() {
        System.out.println("inserirCategoria");
        Categoria c = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.inserirCategoria(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerCategoria method, of class SaleSquaredFacade.
     */
    @Test
    public void testRemoverCategoria() {
        System.out.println("removerCategoria");
        String categoria = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.removerCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarCategoria method, of class SaleSquaredFacade.
     */
    @Test
    public void testEncontrarCategoria() {
        System.out.println("encontrarCategoria");
        String categoria = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Categoria expResult = null;
        Categoria result = instance.encontrarCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeCategoria method, of class SaleSquaredFacade.
     */
    @Test
    public void testExisteCategoria() {
        System.out.println("existeCategoria");
        String categoria = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.existeCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temCategorias method, of class SaleSquaredFacade.
     */
    @Test
    public void testTemCategorias() {
        System.out.println("temCategorias");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.temCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullCategorias method, of class SaleSquaredFacade.
     */
    @Test
    public void testENullCategorias() {
        System.out.println("eNullCategorias");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eNullCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirUtilizadorReg method, of class SaleSquaredFacade.
     */
    @Test
    public void testInserirUtilizadorReg() {
        System.out.println("inserirUtilizadorReg");
        UtilizadorRegistado u = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.inserirUtilizadorReg(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerUtilizadorReg method, of class SaleSquaredFacade.
     */
    @Test
    public void testRemoverUtilizadorReg() {
        System.out.println("removerUtilizadorReg");
        String username = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.removerUtilizadorReg(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarUtilizadorReg method, of class SaleSquaredFacade.
     */
    @Test
    public void testEncontrarUtilizadorReg() {
        System.out.println("encontrarUtilizadorReg");
        String username = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.encontrarUtilizadorReg(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeUtilizadorReg method, of class SaleSquaredFacade.
     */
    @Test
    public void testExisteUtilizadorReg() {
        System.out.println("existeUtilizadorReg");
        String username = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.existeUtilizadorReg(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temUtilizadorRegs method, of class SaleSquaredFacade.
     */
    @Test
    public void testTemUtilizadorRegs() {
        System.out.println("temUtilizadorRegs");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.temUtilizadorRegs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullUtilizadorRegs method, of class SaleSquaredFacade.
     */
    @Test
    public void testENullUtilizadorRegs() {
        System.out.println("eNullUtilizadorRegs");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eNullUtilizadorRegs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirAnuncio method, of class SaleSquaredFacade.
     */
    @Test
    public void testInserirAnuncio() {
        System.out.println("inserirAnuncio");
        Anuncio a = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.inserirAnuncio(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAnuncio method, of class SaleSquaredFacade.
     */
    @Test
    public void testRemoverAnuncio() {
        System.out.println("removerAnuncio");
        int codAnunc = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.removerAnuncio(codAnunc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarAnuncio method, of class SaleSquaredFacade.
     */
    @Test
    public void testEncontrarAnuncio() {
        System.out.println("encontrarAnuncio");
        int codAnunc = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Anuncio expResult = null;
        Anuncio result = instance.encontrarAnuncio(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeAnuncio method, of class SaleSquaredFacade.
     */
    @Test
    public void testExisteAnuncio() {
        System.out.println("existeAnuncio");
        int codAnunc = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.existeAnuncio(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temAnuncios method, of class SaleSquaredFacade.
     */
    @Test
    public void testTemAnuncios() {
        System.out.println("temAnuncios");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.temAnuncios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullAnuncios method, of class SaleSquaredFacade.
     */
    @Test
    public void testENullAnuncios() {
        System.out.println("eNullAnuncios");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eNullAnuncios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seguirUser method, of class SaleSquaredFacade.
     */
    @Test
    public void testSeguirUser() {
        System.out.println("seguirUser");
        String uNameSeguidor = "";
        UtilizadorRegistado u = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.seguirUser(uNameSeguidor, u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seguirAnuncio method, of class SaleSquaredFacade.
     */
    @Test
    public void testSeguirAnuncio() {
        System.out.println("seguirAnuncio");
        String uName = "";
        Anuncio anuncio = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.seguirAnuncio(uName, anuncio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seguirCategoria method, of class SaleSquaredFacade.
     */
    @Test
    public void testSeguirCategoria() {
        System.out.println("seguirCategoria");
        String uName = "";
        Categoria categoria = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.seguirCategoria(uName, categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deixarSegUser method, of class SaleSquaredFacade.
     */
    @Test
    public void testDeixarSegUser() {
        System.out.println("deixarSegUser");
        String uNameSeguidor = "";
        String uNameSeguido = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.deixarSegUser(uNameSeguidor, uNameSeguido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deixarSegAnuncio method, of class SaleSquaredFacade.
     */
    @Test
    public void testDeixarSegAnuncio() {
        System.out.println("deixarSegAnuncio");
        String uNameSeguidor = "";
        int codAnunc = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.deixarSegAnuncio(uNameSeguidor, codAnunc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deixarSegCategoria method, of class SaleSquaredFacade.
     */
    @Test
    public void testDeixarSegCategoria() {
        System.out.println("deixarSegCategoria");
        String uNameSeguidor = "";
        String categoria = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.deixarSegCategoria(uNameSeguidor, categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eUserSeguido method, of class SaleSquaredFacade.
     */
    @Test
    public void testEUserSeguido() {
        System.out.println("eUserSeguido");
        String uNameSeguidor = "";
        String uNameSeguido = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eUserSeguido(uNameSeguidor, uNameSeguido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eAnuncioSeguido method, of class SaleSquaredFacade.
     */
    @Test
    public void testEAnuncioSeguido() {
        System.out.println("eAnuncioSeguido");
        String uName = "";
        int codAnunc = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eAnuncioSeguido(uName, codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eCategoriaSeguida method, of class SaleSquaredFacade.
     */
    @Test
    public void testECategoriaSeguida() {
        System.out.println("eCategoriaSeguida");
        String uName = "";
        String categoria = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eCategoriaSeguida(uName, categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enviarMensagem method, of class SaleSquaredFacade.
     */
    @Test
    public void testEnviarMensagem() {
        System.out.println("enviarMensagem");
        Mensagem msgEnv = null;
        Mensagem msgRec = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.enviarMensagem(msgEnv, msgRec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagarMensagemRecebida method, of class SaleSquaredFacade.
     */
    @Test
    public void testApagarMensagemRecebida() {
        System.out.println("apagarMensagemRecebida");
        String user = "";
        int codMsg = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.apagarMensagemRecebida(user, codMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagarMensagemEnviada method, of class SaleSquaredFacade.
     */
    @Test
    public void testApagarMensagemEnviada() {
        System.out.println("apagarMensagemEnviada");
        String user = "";
        int codMsg = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.apagarMensagemEnviada(user, codMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marcarMsgComoLida method, of class SaleSquaredFacade.
     */
    @Test
    public void testMarcarMsgComoLida() {
        System.out.println("marcarMsgComoLida");
        String user = "";
        int codMsg = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.marcarMsgComoLida(user, codMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaLida method, of class SaleSquaredFacade.
     */
    @Test
    public void testEstaLida() {
        System.out.println("estaLida");
        String user = "";
        int codMsg = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.estaLida(user, codMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limparHistAnunc method, of class SaleSquaredFacade.
     */
    @Test
    public void testLimparHistAnunc() {
        System.out.println("limparHistAnunc");
        String user = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.limparHistAnunc(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarUserNome method, of class SaleSquaredFacade.
     */
    @Test
    public void testProcurarUserNome() {
        System.out.println("procurarUserNome");
        String user = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Set expResult = null;
        Set result = instance.procurarUserNome(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarUserMail method, of class SaleSquaredFacade.
     */
    @Test
    public void testProcurarUserMail() {
        System.out.println("procurarUserMail");
        String email = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Set expResult = null;
        Set result = instance.procurarUserMail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirProposta method, of class SaleSquaredFacade.
     */
    @Test
    public void testInserirProposta() {
        System.out.println("inserirProposta");
        Transaccao tVenda = null;
        Transaccao tCompra = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.inserirProposta(tVenda, tCompra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarPagamTransacc method, of class SaleSquaredFacade.
     */
    @Test
    public void testConfirmarPagamTransacc() {
        System.out.println("confirmarPagamTransacc");
        String vendedor = "";
        int codigoTrans = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.confirmarPagamTransacc(vendedor, codigoTrans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarRecepTransacc method, of class SaleSquaredFacade.
     */
    @Test
    public void testConfirmarRecepTransacc() {
        System.out.println("confirmarRecepTransacc");
        String comprador = "";
        int codigoTrans = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.confirmarRecepTransacc(comprador, codigoTrans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarPagamTroca method, of class SaleSquaredFacade.
     */
    @Test
    public void testConfirmarPagamTroca() {
        System.out.println("confirmarPagamTroca");
        String vendedor = "";
        int codigoTrans = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.confirmarPagamTroca(vendedor, codigoTrans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarRecepTroca method, of class SaleSquaredFacade.
     */
    @Test
    public void testConfirmarRecepTroca() {
        System.out.println("confirmarRecepTroca");
        String comprador = "";
        int codigoTrans = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.confirmarRecepTroca(comprador, codigoTrans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceitarPropostaTransacc method, of class SaleSquaredFacade.
     */
    @Test
    public void testAceitarPropostaTransacc() {
        System.out.println("aceitarPropostaTransacc");
        String vendedor = "";
        int codTransac = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.aceitarPropostaTransacc(vendedor, codTransac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceitarPropostaTroca method, of class SaleSquaredFacade.
     */
    @Test
    public void testAceitarPropostaTroca() {
        System.out.println("aceitarPropostaTroca");
        String vendedor = "";
        int codTransac = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.aceitarPropostaTroca(vendedor, codTransac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rejeitarProposta method, of class SaleSquaredFacade.
     */
    @Test
    public void testRejeitarProposta() {
        System.out.println("rejeitarProposta");
        String vendedor = "";
        int codTransac = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.rejeitarProposta(vendedor, codTransac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioTags method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarAnuncioTags() {
        System.out.println("editarAnuncioTags");
        int codAnuncio = 0;
        Set<String> tags = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarAnuncioTags(codAnuncio, tags);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioCategorias method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarAnuncioCategorias() {
        System.out.println("editarAnuncioCategorias");
        int codAnuncio = 0;
        Set<String> categorias = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarAnuncioCategorias(codAnuncio, categorias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioDescricao method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarAnuncioDescricao() {
        System.out.println("editarAnuncioDescricao");
        int codAnuncio = 0;
        String descricao = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarAnuncioDescricao(codAnuncio, descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioQuantidade method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarAnuncioQuantidade() {
        System.out.println("editarAnuncioQuantidade");
        int codAnuncio = 0;
        int quantidade = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarAnuncioQuantidade(codAnuncio, quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioTitulo method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarAnuncioTitulo() {
        System.out.println("editarAnuncioTitulo");
        int codAnuncio = 0;
        String titulo = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarAnuncioTitulo(codAnuncio, titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioImagens method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarAnuncioImagens() {
        System.out.println("editarAnuncioImagens");
        int codAnuncio = 0;
        Set<Imagem> imagens = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarAnuncioImagens(codAnuncio, imagens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarAnuncioEstado method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarAnuncioEstado() {
        System.out.println("editarAnuncioEstado");
        int codAnuncio = 0;
        char estado = ' ';
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarAnuncioEstado(codAnuncio, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incAnuncioVisitas method, of class SaleSquaredFacade.
     */
    @Test
    public void testIncAnuncioVisitas() {
        System.out.println("incAnuncioVisitas");
        int codAnuncio = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.incAnuncioVisitas(codAnuncio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoUsername method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarRegistadoUsername() {
        System.out.println("editarRegistadoUsername");
        String username = "";
        String novoUsername = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarRegistadoUsername(username, novoUsername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoEmail method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarRegistadoEmail() {
        System.out.println("editarRegistadoEmail");
        String username = "";
        String email = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarRegistadoEmail(username, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoMorada method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarRegistadoMorada() {
        System.out.println("editarRegistadoMorada");
        String username = "";
        String morada = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarRegistadoMorada(username, morada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoInfPessoal method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarRegistadoInfPessoal() {
        System.out.println("editarRegistadoInfPessoal");
        String username = "";
        String informacaoP = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarRegistadoInfPessoal(username, informacaoP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoContacto method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarRegistadoContacto() {
        System.out.println("editarRegistadoContacto");
        String username = "";
        String contacto = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarRegistadoContacto(username, contacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoNome method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarRegistadoNome() {
        System.out.println("editarRegistadoNome");
        String username = "";
        String nome = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarRegistadoNome(username, nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRegistadoDataN method, of class SaleSquaredFacade.
     */
    @Test
    public void testEditarRegistadoDataN() {
        System.out.println("editarRegistadoDataN");
        String username = "";
        GregorianCalendar dataN = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.editarRegistadoDataN(username, dataN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarLeilaoLicitacao method, of class SaleSquaredFacade.
     */
    @Test
    public void testAdicionarLeilaoLicitacao() {
        System.out.println("adicionarLeilaoLicitacao");
        int codAnunc = 0;
        double valor = 0.0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.adicionarLeilaoLicitacao(codAnunc, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarVendaDirectaProposta method, of class SaleSquaredFacade.
     */
    @Test
    public void testAdicionarVendaDirectaProposta() {
        System.out.println("adicionarVendaDirectaProposta");
        int codAnunc = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.adicionarVendaDirectaProposta(codAnunc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temUserRating method, of class SaleSquaredFacade.
     */
    @Test
    public void testTemUserRating() {
        System.out.println("temUserRating");
        String username = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.temUserRating(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularRegistadoRating method, of class SaleSquaredFacade.
     */
    @Test
    public void testCalcularRegistadoRating() {
        System.out.println("calcularRegistadoRating");
        String username = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        double expResult = 0.0;
        double result = instance.calcularRegistadoRating(username);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eUserConfiavel method, of class SaleSquaredFacade.
     */
    @Test
    public void testEUserConfiavel() {
        System.out.println("eUserConfiavel");
        String username = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eUserConfiavel(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarAnuncTag method, of class SaleSquaredFacade.
     */
    @Test
    public void testProcurarAnuncTag() {
        System.out.println("procurarAnuncTag");
        String nome = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Set expResult = null;
        Set result = instance.procurarAnuncTag(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarAnuncCat method, of class SaleSquaredFacade.
     */
    @Test
    public void testProcurarAnuncCat() {
        System.out.println("procurarAnuncCat");
        String nome = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Set expResult = null;
        Set result = instance.procurarAnuncCat(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarAnuncAvanc method, of class SaleSquaredFacade.
     */
    @Test
    public void testProcurarAnuncAvanc() {
        System.out.println("procurarAnuncAvanc");
        String[] campos = null;
        Object[] valores = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Set expResult = null;
        Set result = instance.procurarAnuncAvanc(campos, valores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarAnuncMaisVis method, of class SaleSquaredFacade.
     */
    @Test
    public void testProcurarAnuncMaisVis() {
        System.out.println("procurarAnuncMaisVis");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        SortedSet expResult = null;
        SortedSet result = instance.procurarAnuncMaisVis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avaliarAnuncio method, of class SaleSquaredFacade.
     */
    @Test
    public void testAvaliarAnuncio() {
        System.out.println("avaliarAnuncio");
        int codAnunc = 0;
        Avaliacao avaliacao = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.avaliarAnuncio(codAnunc, avaliacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avaliarTransac method, of class SaleSquaredFacade.
     */
    @Test
    public void testAvaliarTransac() {
        System.out.println("avaliarTransac");
        String avaliado = "";
        int codTransac = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.avaliarTransac(avaliado, codTransac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eValidoEmail method, of class SaleSquaredFacade.
     */
    @Test
    public void testEValidoEmail() {
        System.out.println("eValidoEmail");
        String email = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eValidoEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eValidaPassword method, of class SaleSquaredFacade.
     */
    @Test
    public void testEValidaPassword() {
        System.out.println("eValidaPassword");
        String pw = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eValidaPassword(pw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdMsg method, of class SaleSquaredFacade.
     */
    @Test
    public void testRegistaIdMsg() {
        System.out.println("registaIdMsg");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        int expResult = 0;
        int result = instance.registaIdMsg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdTransac method, of class SaleSquaredFacade.
     */
    @Test
    public void testRegistaIdTransac() {
        System.out.println("registaIdTransac");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        int expResult = 0;
        int result = instance.registaIdTransac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdAnuncio method, of class SaleSquaredFacade.
     */
    @Test
    public void testRegistaIdAnuncio() {
        System.out.println("registaIdAnuncio");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        int expResult = 0;
        int result = instance.registaIdAnuncio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdAvaliacao method, of class SaleSquaredFacade.
     */
    @Test
    public void testRegistaIdAvaliacao() {
        System.out.println("registaIdAvaliacao");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        int expResult = 0;
        int result = instance.registaIdAvaliacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdUtilizador method, of class SaleSquaredFacade.
     */
    @Test
    public void testRegistaIdUtilizador() {
        System.out.println("registaIdUtilizador");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        int expResult = 0;
        int result = instance.registaIdUtilizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaIdModoVenda method, of class SaleSquaredFacade.
     */
    @Test
    public void testRegistaIdModoVenda() {
        System.out.println("registaIdModoVenda");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        int expResult = 0;
        int result = instance.registaIdModoVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eValidoLogin method, of class SaleSquaredFacade.
     */
    @Test
    public void testEValidoLogin() {
        System.out.println("eValidoLogin");
        String username = "";
        String pw = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.eValidoLogin(username, pw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sugerirAnuncios method, of class SaleSquaredFacade.
     */
    @Test
    public void testSugerirAnuncios() {
        System.out.println("sugerirAnuncios");
        String username = "";
        ArrayList<Character> causa = null;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        ArrayList expResult = null;
        ArrayList result = instance.sugerirAnuncios(username, causa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ePossivelTrocar method, of class SaleSquaredFacade.
     */
    @Test
    public void testEPossivelTrocar() {
        System.out.println("ePossivelTrocar");
        String comprador = "";
        String vendedor = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        boolean expResult = false;
        boolean result = instance.ePossivelTrocar(comprador, vendedor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sugerirAnunciosTroca method, of class SaleSquaredFacade.
     */
    @Test
    public void testSugerirAnunciosTroca() {
        System.out.println("sugerirAnunciosTroca");
        String comprador = "";
        String vendedor = "";
        int codAnunc = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        SortedSet expResult = null;
        SortedSet result = instance.sugerirAnunciosTroca(comprador, vendedor, codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ultimosAnuncios method, of class SaleSquaredFacade.
     */
    @Test
    public void testUltimosAnuncios() {
        System.out.println("ultimosAnuncios");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Iterator expResult = null;
        Iterator result = instance.ultimosAnuncios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tempoRestanteLeilao method, of class SaleSquaredFacade.
     */
    @Test
    public void testTempoRestanteLeilao() {
        System.out.println("tempoRestanteLeilao");
        int codAnunc = 0;
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        long expResult = 0L;
        long result = instance.tempoRestanteLeilao(codAnunc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anunciosSeguidos method, of class SaleSquaredFacade.
     */
    @Test
    public void testAnunciosSeguidos() {
        System.out.println("anunciosSeguidos");
        String username = "";
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        Collection expResult = null;
        Collection result = instance.anunciosSeguidos(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of topTags method, of class SaleSquaredFacade.
     */
    @Test
    public void testTopTags() {
        System.out.println("topTags");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        SortedSet expResult = null;
        SortedSet result = instance.topTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarConexao method, of class SaleSquaredFacade.
     */
    @Test
    public void testIniciarConexao() {
        System.out.println("iniciarConexao");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.iniciarConexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of terminarConexao method, of class SaleSquaredFacade.
     */
    @Test
    public void testTerminarConexao() {
        System.out.println("terminarConexao");
        SaleSquaredFacade instance = new SaleSquaredFacadeImpl();
        instance.terminarConexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SaleSquaredFacadeImpl implements SaleSquaredFacade {

        public void inserirCategoria(Categoria c) {
        }

        public void removerCategoria(String categoria) {
        }

        public Categoria encontrarCategoria(String categoria) {
            return null;
        }

        public boolean existeCategoria(String categoria) {
            return false;
        }

        public boolean temCategorias() {
            return false;
        }

        public boolean eNullCategorias() {
            return false;
        }

        public void inserirUtilizadorReg(UtilizadorRegistado u) {
        }

        public void removerUtilizadorReg(String username) {
        }

        public UtilizadorRegistado encontrarUtilizadorReg(String username) {
            return null;
        }

        public boolean existeUtilizadorReg(String username) {
            return false;
        }

        public boolean temUtilizadorRegs() {
            return false;
        }

        public boolean eNullUtilizadorRegs() {
            return false;
        }

        public void inserirAnuncio(Anuncio a) {
        }

        public void removerAnuncio(int codAnunc) {
        }

        public Anuncio encontrarAnuncio(int codAnunc) {
            return null;
        }

        public boolean existeAnuncio(int codAnunc) {
            return false;
        }

        public boolean temAnuncios() {
            return false;
        }

        public boolean eNullAnuncios() {
            return false;
        }

        public void seguirUser(String uNameSeguidor, UtilizadorRegistado u) {
        }

        public void seguirAnuncio(String uName, Anuncio anuncio) {
        }

        public void seguirCategoria(String uName, Categoria categoria) {
        }

        public void deixarSegUser(String uNameSeguidor, String uNameSeguido) {
        }

        public void deixarSegAnuncio(String uNameSeguidor, int codAnunc) {
        }

        public void deixarSegCategoria(String uNameSeguidor, String categoria) {
        }

        public boolean eUserSeguido(String uNameSeguidor, String uNameSeguido) {
            return false;
        }

        public boolean eAnuncioSeguido(String uName, int codAnunc) {
            return false;
        }

        public boolean eCategoriaSeguida(String uName, String categoria) {
            return false;
        }

        public void enviarMensagem(Mensagem msgEnv, Mensagem msgRec) {
        }

        public void apagarMensagemRecebida(String user, int codMsg) {
        }

        public void apagarMensagemEnviada(String user, int codMsg) {
        }

        public void marcarMsgComoLida(String user, int codMsg) {
        }

        public boolean estaLida(String user, int codMsg) {
            return false;
        }

        public void limparHistAnunc(String user) {
        }

        public Set<UtilizadorRegistado> procurarUserNome(String user) {
            return null;
        }

        public Set<UtilizadorRegistado> procurarUserMail(String email) {
            return null;
        }

        public void inserirProposta(Transaccao tVenda, Transaccao tCompra) {
        }

        public void confirmarPagamTransacc(String vendedor, int codigoTrans) {
        }

        public void confirmarRecepTransacc(String comprador, int codigoTrans) {
        }

        public void confirmarPagamTroca(String vendedor, int codigoTrans) {
        }

        public void confirmarRecepTroca(String comprador, int codigoTrans) {
        }

        public void aceitarPropostaTransacc(String vendedor, int codTransac) {
        }

        public void aceitarPropostaTroca(String vendedor, int codTransac) {
        }

        public void rejeitarProposta(String vendedor, int codTransac) {
        }

        public void editarAnuncioTags(int codAnuncio, Set<String> tags) {
        }

        public void editarAnuncioCategorias(int codAnuncio, Set<String> categorias) {
        }

        public void editarAnuncioDescricao(int codAnuncio, String descricao) {
        }

        public void editarAnuncioQuantidade(int codAnuncio, int quantidade) {
        }

        public void editarAnuncioTitulo(int codAnuncio, String titulo) {
        }

        public void editarAnuncioImagens(int codAnuncio, Set<Imagem> imagens) {
        }

        public void editarAnuncioEstado(int codAnuncio, char estado) {
        }

        public void incAnuncioVisitas(int codAnuncio) {
        }

        public void editarRegistadoUsername(String username, String novoUsername) {
        }

        public void editarRegistadoEmail(String username, String email) {
        }

        public void editarRegistadoMorada(String username, String morada) {
        }

        public void editarRegistadoInfPessoal(String username, String informacaoP) {
        }

        public void editarRegistadoContacto(String username, String contacto) {
        }

        public void editarRegistadoNome(String username, String nome) {
        }

        public void editarRegistadoDataN(String username, GregorianCalendar dataN) {
        }

        public void adicionarLeilaoLicitacao(int codAnunc, double valor) {
        }

        public void adicionarVendaDirectaProposta(int codAnunc) {
        }

        public boolean temUserRating(String username) {
            return false;
        }

        public double calcularRegistadoRating(String username) {
            return 0.0;
        }

        public boolean eUserConfiavel(String username) {
            return false;
        }

        public Set<Anuncio> procurarAnuncTag(String nome) {
            return null;
        }

        public Set<Anuncio> procurarAnuncCat(String nome) {
            return null;
        }

        public Set<Anuncio> procurarAnuncAvanc(String[] campos, Object[] valores) {
            return null;
        }

        public SortedSet<Anuncio> procurarAnuncMaisVis() {
            return null;
        }

        public void avaliarAnuncio(int codAnunc, Avaliacao avaliacao) {
        }

        public void avaliarTransac(String avaliado, int codTransac) {
        }

        public boolean eValidoEmail(String email) {
            return false;
        }

        public boolean eValidaPassword(String pw) {
            return false;
        }

        public int registaIdMsg() {
            return 0;
        }

        public int registaIdTransac() {
            return 0;
        }

        public int registaIdAnuncio() {
            return 0;
        }

        public int registaIdAvaliacao() {
            return 0;
        }

        public int registaIdUtilizador() {
            return 0;
        }

        public int registaIdModoVenda() {
            return 0;
        }

        public boolean eValidoLogin(String username, String pw) {
            return false;
        }

        public ArrayList<Anuncio> sugerirAnuncios(String username, ArrayList<Character> causa) {
            return null;
        }

        public boolean ePossivelTrocar(String comprador, String vendedor) {
            return false;
        }

        public SortedSet<Anuncio> sugerirAnunciosTroca(String comprador, String vendedor, int codAnunc) {
            return null;
        }

        public Iterator<Anuncio> ultimosAnuncios() {
            return null;
        }

        public long tempoRestanteLeilao(int codAnunc) {
            return 0L;
        }

        public Collection<Anuncio> anunciosSeguidos(String username) {
            return null;
        }

        public SortedSet<Tag> topTags() {
            return null;
        }

        public void iniciarConexao() {
        }

        public void terminarConexao() {
        }
    }
}
