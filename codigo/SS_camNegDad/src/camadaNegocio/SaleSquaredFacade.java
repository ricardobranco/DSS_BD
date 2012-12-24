package camadaNegocio ;

import java.util.Set ;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.Iterator;
import java.util.Collection;

public interface SaleSquaredFacade {

    //public void login(String uName);
    //public void logout();

    //public void adicUserReg(UtilizadorRegistado user);
    
    public void inserirCategoria(Categoria c) ;
    public void removerCategoria(String categoria) ;
    public Categoria encontrarCategoria(String categoria) ;
    public boolean existeCategoria(String categoria) ;
    public boolean temCategorias() ;
    public boolean eNullCategorias () ;
    
    public void inserirUtilizadorReg(UtilizadorRegistado u) ;
    public void removerUtilizadorReg(String username) ;
    public UtilizadorRegistado encontrarUtilizadorReg(String username) ;
    public boolean existeUtilizadorReg(String username) ;
    public boolean temUtilizadorRegs() ;
    public boolean eNullUtilizadorRegs () ;
    
    public void inserirAnuncio(Anuncio a) ;
    public void removerAnuncio(int codAnunc) ;
    public Anuncio encontrarAnuncio(int codAnunc) ;
    public boolean existeAnuncio(int codAnunc) ;
    public boolean temAnuncios() ;
    public boolean eNullAnuncios () ;
    
    public void seguirUser(String uNameSeguidor, UtilizadorRegistado u);
    public void seguirAnuncio(String uName, Anuncio anuncio);
    public void seguirCategoria(String uName, String categoria);

    public void deixarSegUser(String uNameSeguidor, String uNameSeguido);
    public void deixarSegAnuncio(String uNameSeguidor, int codAnunc) ;
    public void deixarSegCategoria(String uNameSeguidor, String categoria) ;
    
    public boolean eUserSeguido(String uNameSeguidor, String uNameSeguido);
    public boolean eAnuncioSeguido(String uName, int codAnunc);
    public boolean eCategoriaSeguida(String uName, String categoria);

    //public void inserirAnuncio(Anuncio anuncio);

    public void enviarMensagem(Mensagem msgEnv, Mensagem msgRec);
    
    public void apagarMensagemRecebida(String user, int codMsg) ;
    public void apagarMensagemEnviada(String user, int codMsg) ;
    
    public void marcarMsgComoLida(String user, int codMsg);
    public boolean estaLida(String user, int codMsg) ;

    public void limparHistAnunc(String user);

    public Set<UtilizadorRegistado> procurarUserNome(String user);
    public Set<UtilizadorRegistado> procurarUserMail(String email);

    // pré-condição: utilizador tem permissão para fazer propostas; vendedor, comprador e anuncio existem ; valor e quantidade são válidos ;    
    public void inserirProposta (Transaccao tVenda, Transaccao tCompra);

    public void confirmarPagamTransacc(String vendedor, int codigoTrans);
    public void confirmarRecepTransacc(String comprador, int codigoTrans);
    public void confirmarPagamTroca(String vendedor, int codigoTrans);
    public void confirmarRecepTroca(String comprador, int codigoTrans);    
    public void aceitarPropostaTransacc(String vendedor, int codTransac) ;
    public void aceitarPropostaTroca(String vendedor, int codTransac) ;
    public void rejeitarProposta(String vendedor, int codTransac) ;    

    public void editarAnuncioTags(int codAnuncio, Set<String> tags);
    public void editarAnuncioCategorias(int codAnuncio, Set<String> categorias);
    public void editarAnuncioDescricao(int codAnuncio, String descricao);
    public void editarAnuncioQuantidade(int codAnuncio, int quantidade);
    public void editarAnuncioTitulo(int codAnuncio, String titulo);
    public void editarAnuncioImagens(int codAnuncio, Set<String> imagens);
    public void editarAnuncioEstado(int codAnuncio, char estado) ;
    public void incAnuncioVisitas(int codAnuncio);    
    
    public void editarRegistadoUsername(String username, String novoUsername) ;
    public void editarRegistadoEmail(String username, String email) ;
    public void editarRegistadoMorada(String username, String morada) ;
    public void editarRegistadoInfPessoal(String username, String informacaoP) ;
    public void editarRegistadoContacto(String username, String contacto) ;
    public void editarRegistadoNome(String username, String nome) ;
    public void editarRegistadoDataN(String username, GregorianCalendar dataN) ;
    
    public void adicionarLeilaoLicitacao(int codAnunc, double valor) ;
    public void adicionarVendaDirectaProposta(int codAnunc) ;
    
    public boolean temRating (String username) ;
    public double calcularRegistadoRating(String username) ;
    public boolean eUserConfiavel (String username) ;
    
    public Set<Anuncio> procurarAnuncTag(String nome);
    public Set<Anuncio> procurarAnuncCat(String nome);
    public Set<Anuncio> procurarAnuncAvanc(String[] campos, Object[] valores);
    public SortedSet<Anuncio> procurarAnuncMaisVis() ;    

    public void avaliarAnuncio(int codAnunc, Avaliacao avaliacao) ;
    public void avaliarTransac(Avaliacao avalicao, String avaliado, int codTransac) ;    
    
    public boolean eValidoEmail (String email);
    public boolean eValidaPassword (String pw);
    public boolean eValidoContacto (String contacto);
    
    public int registaIdMsg () ;
    public int registaIdTransac () ;
    public int registaIdAnuncio () ;
    public int registaIdAvaliacao () ;
    
    public boolean eValidoLogin(String username, String pw) ;
    
    public ArrayList<Anuncio> sugerirAnuncios (String username, ArrayList<Character> causa) ;
    
    public boolean ePossivelTrocar (String comprador, String vendedor) ;
    public SortedSet<Anuncio> sugerirAnunciosTroca (String comprador, String vendedor) ;
    
    public Iterator<Anuncio> ultimosAnuncios () ;
    
    public long tempoRestanteLeilao (int codAnunc) ;
    
    public Collection<Anuncio> anunciosSeguidos (String username) ;    
}