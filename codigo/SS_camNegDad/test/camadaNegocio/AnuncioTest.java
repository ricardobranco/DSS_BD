/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaNegocio;

import java.util.GregorianCalendar;
import java.util.Map;
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
public class AnuncioTest {
    
    public AnuncioTest() {
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
     * Test of getTags method, of class Anuncio.
     */
    @Test
    public void testGetTags() {
        System.out.println("getTags");
        Anuncio instance = null;
        Map expResult = null;
        Map result = instance.getTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTags method, of class Anuncio.
     */
    @Test
    public void testSetTags() {
        System.out.println("setTags");
        Map<String, Tag> tags = null;
        Anuncio instance = null;
        instance.setTags(tags);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategorias method, of class Anuncio.
     */
    @Test
    public void testGetCategorias() {
        System.out.println("getCategorias");
        Anuncio instance = null;
        Map expResult = null;
        Map result = instance.getCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategorias method, of class Anuncio.
     */
    @Test
    public void testSetCategorias() {
        System.out.println("setCategorias");
        Map<String, Categoria> categorias = null;
        Anuncio instance = null;
        instance.setCategorias(categorias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvaliacoes method, of class Anuncio.
     */
    @Test
    public void testGetAvaliacoes() {
        System.out.println("getAvaliacoes");
        Anuncio instance = null;
        Map expResult = null;
        Map result = instance.getAvaliacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvaliacoes method, of class Anuncio.
     */
    @Test
    public void testSetAvaliacoes() {
        System.out.println("setAvaliacoes");
        Map<Integer, Avaliacao> avaliacoes = null;
        Anuncio instance = null;
        instance.setAvaliacoes(avaliacoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Anuncio.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Anuncio instance = null;
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Anuncio.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Anuncio instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Anuncio.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Anuncio instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Anuncio.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Anuncio instance = null;
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataInser method, of class Anuncio.
     */
    @Test
    public void testGetDataInser() {
        System.out.println("getDataInser");
        Anuncio instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDataInser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataInser method, of class Anuncio.
     */
    @Test
    public void testSetDataInser() {
        System.out.println("setDataInser");
        GregorianCalendar dataInser = null;
        Anuncio instance = null;
        instance.setDataInser(dataInser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataExpir method, of class Anuncio.
     */
    @Test
    public void testGetDataExpir() {
        System.out.println("getDataExpir");
        Anuncio instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDataExpir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataExpir method, of class Anuncio.
     */
    @Test
    public void testSetDataExpir() {
        System.out.println("setDataExpir");
        GregorianCalendar dataExpir = null;
        Anuncio instance = null;
        instance.setDataExpir(dataExpir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class Anuncio.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Anuncio instance = null;
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreco method, of class Anuncio.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        double preco = 0.0;
        Anuncio instance = null;
        instance.setPreco(preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Anuncio.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Anuncio instance = null;
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Anuncio.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Anuncio instance = null;
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Anuncio.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Anuncio instance = null;
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Anuncio.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        Anuncio instance = null;
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagens method, of class Anuncio.
     */
    @Test
    public void testGetImagens() {
        System.out.println("getImagens");
        Anuncio instance = null;
        Map expResult = null;
        Map result = instance.getImagens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagens method, of class Anuncio.
     */
    @Test
    public void testSetImagens() {
        System.out.println("setImagens");
        Map<String, Imagem> imagens = null;
        Anuncio instance = null;
        instance.setImagens(imagens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnVisitas method, of class Anuncio.
     */
    @Test
    public void testGetnVisitas() {
        System.out.println("getnVisitas");
        Anuncio instance = null;
        int expResult = 0;
        int result = instance.getnVisitas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnVisitas method, of class Anuncio.
     */
    @Test
    public void testSetnVisitas() {
        System.out.println("setnVisitas");
        int nVisitas = 0;
        Anuncio instance = null;
        instance.setnVisitas(nVisitas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoProduto method, of class Anuncio.
     */
    @Test
    public void testIsEstadoProduto() {
        System.out.println("isEstadoProduto");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.isEstadoProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoProduto method, of class Anuncio.
     */
    @Test
    public void testSetEstadoProduto() {
        System.out.println("setEstadoProduto");
        boolean estadoProduto = false;
        Anuncio instance = null;
        instance.setEstadoProduto(estadoProduto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoAnuncio method, of class Anuncio.
     */
    @Test
    public void testGetEstadoAnuncio() {
        System.out.println("getEstadoAnuncio");
        Anuncio instance = null;
        char expResult = ' ';
        char result = instance.getEstadoAnuncio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoAnuncio method, of class Anuncio.
     */
    @Test
    public void testSetEstadoAnuncio() {
        System.out.println("setEstadoAnuncio");
        char estadoAnuncio = ' ';
        Anuncio instance = null;
        instance.setEstadoAnuncio(estadoAnuncio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnunciante method, of class Anuncio.
     */
    @Test
    public void testGetAnunciante() {
        System.out.println("getAnunciante");
        Anuncio instance = null;
        UtilizadorRegistado expResult = null;
        UtilizadorRegistado result = instance.getAnunciante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnunciante method, of class Anuncio.
     */
    @Test
    public void testSetAnunciante() {
        System.out.println("setAnunciante");
        UtilizadorRegistado anunciante = null;
        Anuncio instance = null;
        instance.setAnunciante(anunciante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Anuncio.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Anuncio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Anuncio instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirTag method, of class Anuncio.
     */
    @Test
    public void testInserirTag() {
        System.out.println("inserirTag");
        Tag t = null;
        Anuncio instance = null;
        Tag expResult = null;
        Tag result = instance.inserirTag(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerTag method, of class Anuncio.
     */
    @Test
    public void testRemoverTag() {
        System.out.println("removerTag");
        String tag = "";
        Anuncio instance = null;
        Tag expResult = null;
        Tag result = instance.removerTag(tag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarTag method, of class Anuncio.
     */
    @Test
    public void testEncontrarTag() {
        System.out.println("encontrarTag");
        String tag = "";
        Anuncio instance = null;
        Tag expResult = null;
        Tag result = instance.encontrarTag(tag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeTag method, of class Anuncio.
     */
    @Test
    public void testExisteTag() {
        System.out.println("existeTag");
        String tag = "";
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.existeTag(tag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temTags method, of class Anuncio.
     */
    @Test
    public void testTemTags() {
        System.out.println("temTags");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.temTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullTags method, of class Anuncio.
     */
    @Test
    public void testENullTags() {
        System.out.println("eNullTags");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.eNullTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirCategoria method, of class Anuncio.
     */
    @Test
    public void testInserirCategoria() {
        System.out.println("inserirCategoria");
        Categoria c = null;
        Anuncio instance = null;
        Categoria expResult = null;
        Categoria result = instance.inserirCategoria(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerCategoria method, of class Anuncio.
     */
    @Test
    public void testRemoverCategoria() {
        System.out.println("removerCategoria");
        String categoria = "";
        Anuncio instance = null;
        Categoria expResult = null;
        Categoria result = instance.removerCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarCategoria method, of class Anuncio.
     */
    @Test
    public void testEncontrarCategoria() {
        System.out.println("encontrarCategoria");
        String categoria = "";
        Anuncio instance = null;
        Categoria expResult = null;
        Categoria result = instance.encontrarCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeCategoria method, of class Anuncio.
     */
    @Test
    public void testExisteCategoria() {
        System.out.println("existeCategoria");
        String categoria = "";
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.existeCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temCategorias method, of class Anuncio.
     */
    @Test
    public void testTemCategorias() {
        System.out.println("temCategorias");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.temCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullCategorias method, of class Anuncio.
     */
    @Test
    public void testENullCategorias() {
        System.out.println("eNullCategorias");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.eNullCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirAvaliacao method, of class Anuncio.
     */
    @Test
    public void testInserirAvaliacao() {
        System.out.println("inserirAvaliacao");
        Avaliacao a = null;
        Anuncio instance = null;
        Avaliacao expResult = null;
        Avaliacao result = instance.inserirAvaliacao(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAvaliacao method, of class Anuncio.
     */
    @Test
    public void testRemoverAvaliacao() {
        System.out.println("removerAvaliacao");
        int a = 0;
        Anuncio instance = null;
        Avaliacao expResult = null;
        Avaliacao result = instance.removerAvaliacao(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarAvaliacao method, of class Anuncio.
     */
    @Test
    public void testEncontrarAvaliacao() {
        System.out.println("encontrarAvaliacao");
        int a = 0;
        Anuncio instance = null;
        Avaliacao expResult = null;
        Avaliacao result = instance.encontrarAvaliacao(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeAvaliacao method, of class Anuncio.
     */
    @Test
    public void testExisteAvaliacao() {
        System.out.println("existeAvaliacao");
        int a = 0;
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.existeAvaliacao(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temAvaliacoes method, of class Anuncio.
     */
    @Test
    public void testTemAvaliacoes() {
        System.out.println("temAvaliacoes");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.temAvaliacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullAvaliacoes method, of class Anuncio.
     */
    @Test
    public void testENullAvaliacoes() {
        System.out.println("eNullAvaliacoes");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.eNullAvaliacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirImagem method, of class Anuncio.
     */
    @Test
    public void testInserirImagem() {
        System.out.println("inserirImagem");
        Imagem imagem = null;
        Anuncio instance = null;
        Imagem expResult = null;
        Imagem result = instance.inserirImagem(imagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerImagem method, of class Anuncio.
     */
    @Test
    public void testRemoverImagem() {
        System.out.println("removerImagem");
        String imagem = "";
        Anuncio instance = null;
        Imagem expResult = null;
        Imagem result = instance.removerImagem(imagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeImagem method, of class Anuncio.
     */
    @Test
    public void testExisteImagem() {
        System.out.println("existeImagem");
        String imagem = "";
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.existeImagem(imagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temImagens method, of class Anuncio.
     */
    @Test
    public void testTemImagens() {
        System.out.println("temImagens");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.temImagens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eNullImagens method, of class Anuncio.
     */
    @Test
    public void testENullImagens() {
        System.out.println("eNullImagens");
        Anuncio instance = null;
        boolean expResult = false;
        boolean result = instance.eNullImagens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarTags method, of class Anuncio.
     */
    @Test
    public void testEditarTags() {
        System.out.println("editarTags");
        Set<String> tagsArg = null;
        Anuncio instance = null;
        instance.editarTags(tagsArg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarCategorias method, of class Anuncio.
     */
    @Test
    public void testEditarCategorias() {
        System.out.println("editarCategorias");
        Set<String> categoriasArg = null;
        Anuncio instance = null;
        instance.editarCategorias(categoriasArg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarImagens method, of class Anuncio.
     */
    @Test
    public void testEditarImagens() {
        System.out.println("editarImagens");
        Set<Imagem> imagensArg = null;
        Anuncio instance = null;
        instance.editarImagens(imagensArg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AnuncioImpl extends Anuncio {

        public AnuncioImpl() {
            super(0);
        }
    }
}
