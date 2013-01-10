package Business_Layer;

import java.util.GregorianCalendar;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Data_Layer.AnuncioSeguidoDAO;
import Data_Layer.CategoriaSeguidaDAO;
import Data_Layer.MsgEnviadaDAO;
import Data_Layer.MsgRecebidaDAO;
import Data_Layer.TransaccaoDAO;
import Data_Layer.UserSeguidoDAO;



public class UtilizadorRegistado extends Utilizador {

	// v. c.
	public static double CLASSIFICACAO_MINIMA = 90;

	public static final char NORMAL = 0;
	public static final char BANIDO = 1;
	public static final char PROIBIDO_ANUNC = 2;
	public static final char REPORTADO = 3;

	// v. i.
	private Map<String, UtilizadorRegistado> usersSeguidos;
	private Map<Integer, Mensagem> enviadas;
	private Map<Integer, Mensagem> recebidas;
	private Map<Integer, Anuncio> anuncSeguidos;
	private Map<String, Categoria> categSeguidas;
	private Map<Integer, Transaccao> transaccoes;
	// private Map<Integer, Avaliacao> rating;
	private String username;
	private String password;
	private int estado;
	private String email;
	private String morada;
	private String codPostal;
	private String localidade;
	private String pais;
	private String infPessoal;
	private Imagem imagem;
	private String contacto;
	private String nome;
	private GregorianCalendar dataNasc;
        private GregorianCalendar dataRegisto;

	// construtor - DAO
	public UtilizadorRegistado(int id, String username, String password,
			int estado, String email, String morada, String codPostal,
			String localidade, String pais, String infPessoal, Imagem imagem,
			String contacto, String nome, GregorianCalendar dn, GregorianCalendar dr) {
		super(id);
		this.usersSeguidos = new UserSeguidoDAO(username);
		this.enviadas = new MsgEnviadaDAO(username);
		this.recebidas = new MsgRecebidaDAO(username);
		this.anuncSeguidos = new AnuncioSeguidoDAO(username);
		this.categSeguidas = new CategoriaSeguidaDAO(username);
		this.transaccoes = new TransaccaoDAO(username);
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.email = email;
		this.morada = morada;
		this.codPostal = codPostal;
		this.localidade = localidade;
		this.pais = pais;
		this.infPessoal = infPessoal;
		this.imagem = imagem;
		// this.rating = rating;
		this.contacto = contacto;
		this.nome = nome;
		this.dataNasc = dn;
                this.dataRegisto = dr ;
	}

	public UtilizadorRegistado(String username) {

		super();
		this.username = username;
		this.usersSeguidos = new UserSeguidoDAO(username);
		this.enviadas = new MsgEnviadaDAO(username);
		this.recebidas = new MsgRecebidaDAO(username);
		this.anuncSeguidos = new AnuncioSeguidoDAO(username);
		this.categSeguidas = new CategoriaSeguidaDAO(username);
		this.transaccoes = new TransaccaoDAO(username);
	}

        // get e set
        public GregorianCalendar getDataRegisto() {
            return this.dataRegisto;
        }

        public void setDataRegisto(GregorianCalendar dataRegisto) {
            this.dataRegisto = dataRegisto;
        }

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getCodPostal() {
		return this.codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidade() {
		return this.localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getInfPessoal() {
		return infPessoal;
	}

	public void setInfPessoal(String infPessoal) {
		this.infPessoal = infPessoal;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	// public Map<Integer, Avaliacao> getRating() {return rating;}
	// public void setRating(Map<Integer, Avaliacao> rating) {this.rating =
	// rating;}
	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GregorianCalendar getDataNasc() {
		return this.dataNasc;
	}

	public void setIdade(GregorianCalendar dn) {
		this.dataNasc = dn;
	}

	public Map<String, UtilizadorRegistado> getUsersSeguidos() {
		return usersSeguidos;
	}

	public void setUsersSeguidos(Map<String, UtilizadorRegistado> usersSeguidos) {
		this.usersSeguidos = usersSeguidos;
	}

	public Map<Integer, Mensagem> getEnviadas() {
		return enviadas;
	}

	public void setEnviadas(Map<Integer, Mensagem> enviadas) {
		this.enviadas = enviadas;
	}

	public Map<Integer, Mensagem> getRecebidas() {
		return recebidas;
	}

	public void setRecebidas(Map<Integer, Mensagem> recebidas) {
		this.recebidas = recebidas;
	}

	public Map<Integer, Anuncio> getAnuncSeguidos() {
		return anuncSeguidos;
	}

	public void setAnuncSeguidos(Map<Integer, Anuncio> anuncSeguidos) {
		this.anuncSeguidos = anuncSeguidos;
	}

	public Map<String, Categoria> getCategSeguidas() {
		return categSeguidas;
	}

	public void setCategSeguidas(Map<String, Categoria> categSeguidas) {
		this.categSeguidas = categSeguidas;
	}

	public Map<Integer, Transaccao> getTransaccoes() {
		return transaccoes;
	}

	public void setTransaccoes(Map<Integer, Transaccao> transaccoes) {
		this.transaccoes = transaccoes;
	}

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
		return "UtilizadorRegistado{" + "usersSeguidos="
				+ this.usersSeguidos.toString() + ", enviadas="
				+ this.enviadas.toString() + ", recebidas="
				+ this.recebidas.toString() + ", anuncSeguidos="
				+ this.anuncSeguidos.toString() + ", categSeguidas="
				+ this.categSeguidas.toString() + ", transaccoes="
				+ this.transaccoes.toString() + ", username=" + this.username
				+ ", password=" + this.password + ", estado=" + this.estado
				+ ", email=" + this.email + ", morada=" + this.morada
				+ ", infPessoal=" + this.infPessoal + ", imagem=" + this.imagem
				+ ", rating="
				/* + this.rating.toString() */+ ", contacto=" + this.contacto
				+ ", nome=" + this.nome + ", dataNasc=" + this.dataNasc
				+ super.toString() + '}';
	}

	@Override
	public UtilizadorRegistado clone() {

		return new UtilizadorRegistado(this.getId(), this.username,
				this.password, this.estado, this.email, this.morada,
				this.codPostal, this.localidade, this.pais, this.infPessoal,
				this.imagem, this.contacto, this.nome, this.dataNasc, this.dataRegisto);
	}

	// gestao maps
	public Transaccao inserirTransaccao(Transaccao t) {
		return this.transaccoes.put(t.getId(), t.clone());
	}

	public Transaccao removerTransaccao(int codTransac) {
		return this.transaccoes.remove(codTransac);
	}

	public Transaccao encontrarTransaccao(int codTransac) {
		return this.transaccoes.get(codTransac);
	}

	public boolean existeTransaccao(int codTransac) {
		return this.transaccoes.containsKey(codTransac);
	}

	public boolean temTransaccoes() {
		return !this.transaccoes.isEmpty();
	}

	public boolean eNullTransacc() {
		return this.transaccoes == null;
	}

	public UtilizadorRegistado inserirUserSeguido(UtilizadorRegistado u) {
		return this.usersSeguidos.put(u.getUsername(), u.clone());
	}

	public UtilizadorRegistado removerUserSeguido(String username) {
		return this.usersSeguidos.remove(username);
	}

	public UtilizadorRegistado encontrarUserSeguido(String username) {
		return this.usersSeguidos.get(username);
	}

	public boolean existeUserSeguido(String username) {
		return this.usersSeguidos.containsKey(username);
	}

	public boolean temUserSeguidos() {
		return !this.usersSeguidos.isEmpty();
	}

	public boolean eNullUserSeguidos() {
		return this.usersSeguidos == null;
	}

	public Mensagem inserirMsgEnv(Mensagem mensagem) {
		return this.enviadas.put(mensagem.getId(), mensagem.clone());
	}

	public Mensagem removerMsgEnv(int codMsg) {
		return this.enviadas.remove(codMsg);
	}

	public Mensagem encontrarMsgEnv(int codMsg) {
		return this.enviadas.get(codMsg);
	}

	public boolean existeMsgEnv(int codMsg) {
		return this.enviadas.containsKey(codMsg);
	}

	public boolean temMsgEnvs() {
		return !this.enviadas.isEmpty();
	}

	public boolean eNullMsgEnvs() {
		return this.enviadas == null;
	}

	public Mensagem inserirMsgRec(Mensagem mensagem) {
		return this.recebidas.put(mensagem.getId(), mensagem.clone());
	}

	public Mensagem removerMsgRec(int codMsg) {
		return this.recebidas.remove(codMsg);
	}

	public Mensagem encontrarMsgRec(int codMsg) {
		return this.recebidas.get(codMsg);
	}

	public boolean existeMsgRec(int codMsg) {
		return this.recebidas.containsKey(codMsg);
	}

	public boolean temMsgRecs() {
		return !this.recebidas.isEmpty();
	}

	public boolean eNullMsgRecs() {
		return this.recebidas == null;
	}

	public Anuncio inserirAnuncSeguido(Anuncio a) {
		return this.anuncSeguidos.put(a.getCodigo(), (a.getClass().getSimpleName()
				.equals("AnuncioVenda") ? ((AnuncioVenda) a).clone()
				: ((AnuncioCompra) a).clone()));
	}

	public Anuncio removerAnuncSeguido(int codAnunc) {
		return this.anuncSeguidos.remove(codAnunc);
	}

	public Anuncio encontrarAnuncSeguido(int codAnunc) {
		return this.anuncSeguidos.get(codAnunc);
	}

	public boolean existeAnuncSeguido(int codAnunc) {
		return this.anuncSeguidos.containsKey(codAnunc);
	}

	public boolean temAnuncSeguidos() {
		return !this.anuncSeguidos.isEmpty();
	}

	public boolean eNullAnuncSeguidos() {
		return this.anuncSeguidos == null;
	}

	public Categoria inserirCategSeguida(Categoria c) {
		return this.categSeguidas.put(c.getNome(), c.clone());
	}

	public Categoria removerCategSeguida(String categoria) {
		return this.categSeguidas.remove(categoria);
	}

	public Categoria encontrarCategSeguida(String categoria) {
		return this.categSeguidas.get(categoria);
	}

	public boolean existeCategSeguida(String categoria) {
		return this.categSeguidas.containsKey(categoria);
	}

	public boolean temCategSeguidas() {
		return !this.categSeguidas.isEmpty();
	}

	public boolean eNullCategSeguidas() {
		return this.categSeguidas == null;
	}

	/*
	 * public Avaliacao inserirAvaliacao(Avaliacao a) {return
	 * this.rating.put(a.getId(), a.clone()) ;} public Avaliacao
	 * removerAvaliacao(int a) {return this.rating.remove(a) ;} public Avaliacao
	 * encontrarAvaliacao(int a) {return this.rating.get(a) ;} public boolean
	 * existeAvaliacao(int a) {return this.rating.containsKey(a) ;} public
	 * boolean temAvaliacoes() {return !this.rating.isEmpty() ;} public boolean
	 * eNullAvaliacoes () {return this.rating == null; }
	 */

	/*
	 * public double calcularRating() {
	 * 
	 * double res = 0 ; int n = 0 ; for(Iterator<Avaliacao> it =
	 * this.getRating().values().iterator(); it.hasNext(); ) { res +=
	 * it.next().getClassificacao() ; n++; } return res/(double)n ; }
	 */

	/*
	 * public boolean temRating() {
	 * 
	 * return (this.rating != null) && (this.rating.isEmpty() == false) ; }
	 */

	public void setMsgLida(int codMsg) {

		Mensagem m = this.recebidas.get(codMsg);
		m.setEstado(Mensagem.LIDA);
		this.recebidas.put(codMsg, m);
	}

	public boolean estaMsgLida(int codMsg) {
		return this.recebidas.get(codMsg).getEstado() == Mensagem.LIDA;
	}

	/*
	 * public void reportarTransaccao(Avaliacao a, int codTransac) {
	 * 
	 * Transaccao t = this.transaccoes.get(codTransac) ;
	 * t.setAvaliacao(a.clone()); this.transaccoes.put(codTransac, t) ; }
	 */

	public boolean passwordCorresponde(String pw) {
		return this.password.equals(pw);
	}

	/*
	 * public boolean eRecomendado () {return this.calcularRating() >=
	 * CLASSIFICACAO_MINIMA ;}
	 */

	public UtilizadorRegistado compradorTransaccao(int codTransac) {
		return this.transaccoes.get(codTransac).getComprador();
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
		} else
			return false;
	}

	// pw válida ssse tiver letras, digitos, '_' ou '.' e tiver 6 caracteres de tamanho
	public static boolean validaPassword(String pw) {

		boolean res = true;
		int i = 0;
                if(pw.length() < 6)
                    return false ;
		for (; i < pw.length() && res; i++) {
			char c = pw.charAt(i);
			if (!(Character.isDigit(c) || Character.isLetter(c) || (c == '_')
					|| (c == '.')))
				res = false;
		}
		return res;
	}

	/*
	 * public static boolean validaContacto (String contacto) {
	 * 
	 * boolean res = true ; int i = 0 ; for(; i < contacto.length() && res; i++)
	 * { char c = contacto.charAt(i) ; if(!Character.isDigit(c)) res = false ; }
	 * return res && (contacto.length() == 9) ; }
	 */
}