package camadaNegocio ;

import java.util.Map;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.regex.* ;
import java.util.StringTokenizer;

public class UtilizadorRegistado extends Utilizador {

    // v. i.
    private Map<String, UtilizadorRegistado> usersSeguidos;
    private Map<Integer, Mensagem> enviadas;
    private Map<Integer, Mensagem> recebidas;
    private Map<Integer, Anuncio> anuncSeguidos;
    private Map<String, Categoria> categSeguidas;
    private Map<Integer, Transaccao> transaccoes;
    private Map<Integer, Avaliacao> rating;
    private String username;
    private String password;
    private char estado;
    private String email;
    private String morada;
    private String infPessoal;
    private String imagem;    
    private String contacto;
    private String nome;
    private GregorianCalendar dataNasc;
    
    // construtor - DAO
    public UtilizadorRegistado(String username, String password, char estado, String email, 
     String morada, String infPessoal, String imagem, Map<Integer, Avaliacao> rating, String contacto, String nome, GregorianCalendar dn) {
        this.username = username;
        this.password = password;
        this.estado = estado;
        this.email = email;
        this.morada = morada;
        this.infPessoal = infPessoal;
        this.imagem = imagem;
        this.rating = rating;
        this.contacto = contacto;
        this.nome = nome;
        this.dataNasc = dn;
        // super
    }
    
    public UtilizadorRegistado(String username){
        this.username = username ;
    }
    
    // get e set
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public char getEstado() {return estado;}
    public void setEstado(char estado) {this.estado = estado;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getMorada() {return morada;}
    public void setMorada(String morada) {this.morada = morada;}
    public String getInfPessoal() {return infPessoal;}
    public void setInfPessoal(String infPessoal) {this.infPessoal = infPessoal;}
    public String getImagem() {return imagem;}
    public void setImagem(String imagem) {this.imagem = imagem;}
    public Map<Integer, Avaliacao> getRating() {return rating;}
    public void setRating(Map<Integer, Avaliacao> rating) {this.rating = rating;}
    public String getContacto() {return contacto;}
    public void setContacto(String contacto) {this.contacto = contacto;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public GregorianCalendar getDataNasc() {return this.dataNasc;}
    public void setIdade(GregorianCalendar dn) {this.dataNasc = dn;}
    public Map<String, UtilizadorRegistado> getUsersSeguidos() {return usersSeguidos;}
    public void setUsersSeguidos(Map<String, UtilizadorRegistado> usersSeguidos) {this.usersSeguidos = usersSeguidos;}
    public Map<Integer, Mensagem> getEnviadas() {return enviadas;}
    public void setEnviadas(Map<Integer, Mensagem> enviadas) {this.enviadas = enviadas;}
    public Map<Integer, Mensagem> getRecebidas() {return recebidas;}
    public void setRecebidas(Map<Integer, Mensagem> recebidas) {this.recebidas = recebidas;}
    public Map<Integer, Anuncio> getAnuncSeguidos() {return anuncSeguidos;}
    public void setAnuncSeguidos(Map<Integer, Anuncio> anuncSeguidos) {this.anuncSeguidos = anuncSeguidos;}
    public Map<String, Categoria> getCategSeguidas() {return categSeguidas;}
    public void setCategSeguidas(Map<String, Categoria> categSeguidas) {this.categSeguidas = categSeguidas;}
    public Map<Integer, Transaccao> getTransaccoes() {return transaccoes;}
    public void setTransaccoes(Map<Integer, Transaccao> transaccoes) {this.transaccoes = transaccoes;}
    
    // e, c, tS
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UtilizadorRegistado other = (UtilizadorRegistado) obj;
        if (!this.username.equals(other.getUsername())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UtilizadorRegistado{" + "usersSeguidos=" + this.usersSeguidos.toString() 
        + ", enviadas=" + this.enviadas.toString() + ", recebidas=" + this.recebidas.toString() 
        + ", anuncSeguidos=" + this.anuncSeguidos.toString() + ", categSeguidas=" 
        + this.categSeguidas.toString() + ", transaccoes=" + this.transaccoes.toString() + ", username=" 
        + this.username + ", password=" + this.password + ", estado=" + this.estado + ", email=" + this.email 
        + ", morada=" + this.morada + ", infPessoal=" + this.infPessoal + ", imagem=" + this.imagem + ", rating=" 
        + this.rating.toString() + ", contacto=" + this.contacto + ", nome=" + this.nome + ", dataNasc=" 
        + this.dataNasc + super.toString() + '}';
    }
   /*
    @Override
    public UtilizadorRegistado clone () {
        
    } */
    
    // m. c.
    public static boolean passwordValida (String pw) {
        
        return true;
    }
    
    public static boolean emailValido (String email) {
        
        return true;
    }
    
    // gestao maps
    public Transaccao inserirTransaccao (Transaccao t) {return this.transaccoes.put(t.getId(), t.clone()) ;}      
    public Transaccao removerTransaccao (int codTransac) {return this.transaccoes.remove(codTransac) ;} 
    public Transaccao encontrarTransaccao (int codTransac) {return this.transaccoes.get(codTransac) ;} 
    public boolean existeTransaccao (int codTransac) {return this.transaccoes.containsKey(codTransac) ;}
    public boolean temTransaccoes () {return !this.transaccoes.isEmpty() ;}
    public boolean eNullTransacc () {return this.transaccoes == null; }
    
    public UtilizadorRegistado inserirUserSeguido(UtilizadorRegistado u) {return this.usersSeguidos.put(u.getUsername(), u.clone()) ;}
    public UtilizadorRegistado removerUserSeguido(String username) {return this.usersSeguidos.remove(username) ;}
    public UtilizadorRegistado encontrarUserSeguido(String username) {return this.usersSeguidos.get(username) ;}
    public boolean existeUserSeguido(String username) {return this.usersSeguidos.containsKey(username) ;}
    public boolean temUserSeguidos() {return !this.usersSeguidos.isEmpty() ;}
    public boolean eNullUserSeguidos () {return this.usersSeguidos == null; }
    
    public Mensagem inserirMsgEnv(Mensagem mensagem) {return this.enviadas.put(mensagem.getId(), mensagem.clone()) ;}
    public Mensagem removerMsgEnv(int codMsg) {return this.enviadas.remove(codMsg) ;}
    public Mensagem encontrarMsgEnv(int codMsg) {return this.enviadas.get(codMsg) ;}
    public boolean existeMsgEnv(int codMsg) {return this.enviadas.containsKey(codMsg) ;}
    public boolean temMsgEnvs() {return !this.enviadas.isEmpty() ;}
    public boolean eNullMsgEnvs () {return this.enviadas == null; }
    
    public Mensagem inserirMsgRec(Mensagem mensagem) {return this.recebidas.put(mensagem.getId(), mensagem.clone()) ;}
    public Mensagem removerMsgRec(int codMsg) {return this.recebidas.remove(codMsg) ;}
    public Mensagem encontrarMsgRec(int codMsg) {return this.recebidas.get(codMsg) ;}
    public boolean existeMsgRec(int codMsg) {return this.recebidas.containsKey(codMsg) ;}
    public boolean temMsgRecs() {return !this.recebidas.isEmpty() ;}
    public boolean eNullMsgRecs () {return this.recebidas == null; }
    
    public Anuncio inserirAnuncSeguido(Anuncio a) {return this.anuncSeguidos.put(a.getCodigo(), a.clone()) ;}
    public Anuncio removerAnuncSeguido(int codAnunc) {return this.anuncSeguidos.remove(codAnunc) ;}
    public Anuncio encontrarAnuncSeguido(int codAnunc) {return this.anuncSeguidos.get(codAnunc) ;}
    public boolean existeAnuncSeguido(int codAnunc) {return this.anuncSeguidos.containsKey(codAnunc) ;}
    public boolean temAnuncSeguidos() {return !this.anuncSeguidos.isEmpty() ;}
    public boolean eNullAnuncSeguidos () {return this.anuncSeguidos == null; }
    
    public Categoria inserirCategSeguida(Categoria c) {return this.categSeguidas.put(c.getNome(), c.clone()) ;}
    public Categoria removerCategSeguida(String categoria) {return this.categSeguidas.remove(categoria) ;}
    public Categoria encontrarCategSeguida(String categoria) {return this.categSeguidas.get(categoria) ;}
    public boolean existeCategSeguida(String categoria) {return this.categSeguidas.containsKey(categoria) ;}
    public boolean temCategSeguidas() {return !this.categSeguidas.isEmpty() ;}
    public boolean eNullCategSeguidas () {return this.categSeguidas == null; }
    
    public Avaliacao inserirAvaliacao(Avaliacao a) {return this.rating.put(a.getId(), a.clone()) ;}
    public Avaliacao removerAvaliacao(int a) {return this.rating.remove(a) ;}
    public Avaliacao encontrarAvaliacao(int a) {return this.rating.get(a) ;}
    public boolean existeAvaliacao(int a) {return this.rating.containsKey(a) ;}
    public boolean temAvaliacoes() {return !this.rating.isEmpty() ;}
    public boolean eNullAvaliacoes () {return this.rating == null; }
    
    public double calcularRating() {
        
        double res = 0 ;
        int n = 0 ;
        for(Iterator<Avaliacao> it = this.getRating().values().iterator(); it.hasNext(); ) {
            res += it.next().getClassificacao() ;
            n++;
        }
        return res/(double)n ;
    }
    
    public boolean temRating() {
        
        return (this.rating != null) && (this.rating.isEmpty() == false) ;
    }
    
    public void setMsgLida(int codMsg) {
        
        Mensagem m = this.recebidas.get(codMsg) ;
        m.setLida(true);
        this.recebidas.put(codMsg, m) ;
    }
    
    public boolean estaMsgLida (int codMsg) { return this.recebidas.get(codMsg).getLida() ;}
    
    public void reportarTransaccao(Avaliacao a, int codTransac) {
        
        Transaccao t = this.transaccoes.get(codTransac) ;
        t.setAvaliacao(a.clone());
        this.transaccoes.put(codTransac, t) ;
    }
    
    // m. c.
    // fonte: http://www.devx.com/tips/Tip/42339
    public static boolean validaEmail(String emailArg) {
   // Input the string for validation
   // String email = "xyz@.com";
   // Set the email pattern string
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

        // Match the given string with the pattern
        Matcher m = p.matcher(emailArg);

        // check whether match is found
        boolean matchFound = m.matches();

        StringTokenizer st = new StringTokenizer(emailArg, ".");
        String lastToken = null;
        while (st.hasMoreTokens()) {
           lastToken = st.nextToken();
        }

        if (matchFound && lastToken.length() >= 2
           && emailArg.length() - 1 != lastToken.length()) {

           // validate the country code
            return true;
        }
        else 
            return false;
    }
    
    // pw válida ssse tiver letras, digitos, '_' ou '.'
    public static boolean validaPassword (String pw) {
        
        boolean res = true ;
        int i = 0 ;
        for(; i < pw.length() && res; i++) {
            char c = pw.charAt(i) ;
            if(!Character.isDigit(c) || !Character.isLetter(c) || (c != '_') || (c != '.')) 
                res = false ;            
        }
        return res ;            
    }
    
    public static boolean validaContacto (String contacto) {
        
        boolean res = true ;
        int i = 0 ;
        for(; i < contacto.length() && res; i++) {
            char c = contacto.charAt(i) ;
            if(!Character.isDigit(c)) 
                res = false ;            
        }
        return res && (contacto.length() == 9) ;            
    }
}