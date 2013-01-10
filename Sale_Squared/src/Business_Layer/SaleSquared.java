package Business_Layer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;

import Data_Layer.AnuncioDAO;
import Data_Layer.CategoriaDAO;
import Data_Layer.ConexaoBD;
import Data_Layer.Registo;
import Data_Layer.UtilizadorRegistadoDAO;



public class SaleSquared extends Observable implements SaleSquaredFacade {

	// v.c.
	public static final char CATEG_E_USER = 0;
	public static final char CATEG = 1;
	public static final char USER = 2;

	// v. i.
	private Map<String, UtilizadorRegistado> users;
	private Map<Integer, Anuncio> anuncios;
	private Map<String, Categoria> categorias;
	private Utilizador emSessao;

	// construtor -- dao
	public SaleSquared() {

		
		this.users = new UtilizadorRegistadoDAO();
		this.anuncios = new AnuncioDAO();
		this.categorias = new CategoriaDAO();
		this.iniciarConexao();
                this.registaUtilizador() ;
		//this.emSessao = new Utilizador(this.registaIdUtilizador());
	}

	// get e set
	public Map<String, UtilizadorRegistado> getUsers() {
		return users;
	}

	public void setUsers(Map<String, UtilizadorRegistado> users) {
		this.users = users;
	}

	public Map<Integer, Anuncio> getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(Map<Integer, Anuncio> anuncios) {
		this.anuncios = anuncios;
	}

	public Map<String, Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Map<String, Categoria> categorias) {
		this.categorias = categorias;
	}

	public Utilizador getEmSessao() {
		return emSessao;
	}

	public void setEmSessao(Utilizador emSessao) {
		this.emSessao = emSessao;
	}

	// e, c, tS
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final SaleSquared other = (SaleSquared) obj;
		if (!this.users.equals(other.getUsers())) {
			return false;
		}
		if (!this.anuncios.equals(other.getAnuncios())) {
			return false;
		}
		if (!this.categorias.equals(other.getCategorias())) {
			return false;
		}
		/*
		 * if (!this.emSessao.equals(other.getEmSessao())) { return false; }
		 */
		return true;
	}

	@Override
	public String toString() {
		return "SaleSquared{" + "users=" + this.users.toString()
				+ ", anuncios=" + this.anuncios.toString() + ", categorias="
				+ this.categorias.toString() + /*
												 * ", emSessao=" +
												 * this.emSessao.toString() +
												 */'}';
	}

	/*
	 * -- clone dao
	 * 
	 * @Override public SaleSquared clone () { return new SaleSquared() ; }
	 */

	// gestão de maps
	public void inserirCategoria(Categoria c) {
		this.categorias.put(c.getNome(), c.clone());
	}

	public void removerCategoria(String categoria) {
		this.categorias.remove(categoria);
	}

	public Categoria encontrarCategoria(String categoria) {
		return this.categorias.get(categoria);
	}

	public boolean existeCategoria(String categoria) {
		return this.categorias.containsKey(categoria);
	}

	public boolean temCategorias() {
		return !this.categorias.isEmpty();
	}

	public boolean eNullCategorias() {
		return this.categorias == null;
	}

	public void inserirUtilizadorReg(UtilizadorRegistado u) {
		this.users.put(u.getUsername(), u.clone());
	}

	public void removerUtilizadorReg(String username) {
		this.users.remove(username);
	}

	public UtilizadorRegistado encontrarUtilizadorReg(String username) {
		return this.users.get(username);
	}

	public boolean existeUtilizadorReg(String username) {
		return this.users.containsKey(username);
	}

	public boolean temUtilizadorRegs() {
		return !this.users.isEmpty();
	}

	public boolean eNullUtilizadorRegs() {
		return this.users == null;
	}

	public void inserirAnuncio(Anuncio a) {
		this.anuncios.put(a.getCodigo(), a);
	}

	public void removerAnuncio(int codAnunc) {
		this.anuncios.remove(codAnunc);
	}

	public Anuncio encontrarAnuncio(int codAnunc) {
		return this.anuncios.get(codAnunc);
	}

	public boolean existeAnuncio(int codAnunc) {
		return this.anuncios.containsKey(codAnunc);
	}

	public boolean temAnuncios() {
		return !this.anuncios.isEmpty();
	}

	public boolean eNullAnuncios() {
		return this.anuncios == null;
	}

	// facade
	/*
	 * // pré-condição: username existe; par username/password é válido
	 * public void login(String uName) {
	 * 
	 * this.emSessao = this.users.get(uName).clone() ; }
	 * 
	 * // sessão está activa public void logout() {
	 * 
	 * this.emSessao = new Utilizador() ; }
	 */

	// pre-condição: user existe e não é seguido
	public void seguirUser(String uNameSeguidor, UtilizadorRegistado u) {
		this.users.get(uNameSeguidor).inserirUserSeguido(u);
	}

	// pré-condição: anuncio existe e não é seguido
	public void seguirAnuncio(String uName, Anuncio anuncio) {
		this.users.get(uName).inserirAnuncSeguido(anuncio);
	}

	// pré-condição: categoria existe e não é seguida
	public void seguirCategoria(String uName, Categoria categoria) {
		this.users.get(uName).inserirCategSeguida(categoria);
	}

	// pré-condição: utilizador existe e é seguido
	public void deixarSegUser(String uNameSeguidor, String uNameSeguido) {
		this.users.get(uNameSeguidor).removerUserSeguido(uNameSeguido);
	}

	// pré-condição: anuncio existe e é seguido
	public void deixarSegAnuncio(String uNameSeguidor, int codAnunc) {
		this.users.get(uNameSeguidor).removerAnuncSeguido(codAnunc);
	}

	// pré-condição: categoria existe e é seguida
	public void deixarSegCategoria(String uNameSeguidor, String categoria) {
		this.users.get(uNameSeguidor).removerCategSeguida(categoria);
	}

	// pré-condição: categoria existe
	public boolean eUserSeguido(String uNameSeguidor, String uNameSeguido) {
		return this.users.get(uNameSeguidor).existeUserSeguido(uNameSeguido);
	}

	// pré-condição: categoria existe
	public boolean eAnuncioSeguido(String uNameSeguidor, int codAnunc) {
		return this.users.get(uNameSeguidor).existeAnuncSeguido(codAnunc);
	}

	// pré-condição: categoria existe
	public boolean eCategoriaSeguida(String uNameSeguidor, String categoria) {
		return this.users.get(uNameSeguidor).existeCategSeguida(categoria);
	}

	// pré-condição: msgRec.lida = false; emissor e receptor existem; data de
	// envio é igual nas duas
	public void enviarMensagem(Mensagem msgEnv, Mensagem msgRec) {

		this.users.get(msgRec.getReceptor().getUsername())
				.inserirMsgRec(msgRec);
		this.users.get(msgEnv.getEmissor().getUsername()).inserirMsgEnv(msgEnv);
	}

	// pré-condição: mensagem existe
	public void apagarMensagemRecebida(String user, int codMsg) {
		this.users.get(user).removerMsgRec(codMsg);
	}

	// pré-condição: mensagem existe
	public void apagarMensagemEnviada(String user, int codMsg) {
		this.users.get(user).removerMsgEnv(codMsg);
	}

	// pré-condição: mensagem existe e não está lida
	public void marcarMsgComoLida(String user, int codMsg) {
		this.users.get(user).setMsgLida(codMsg);
	}

	// pré-condição: mensagem recebida
	public boolean estaLida(String user, int codMsg) {
		return this.users.get(user).estaMsgLida(codMsg);
	}

	public void limparHistAnunc() {
		this.emSessao.limparAnuncVisits();
	}

	public Set<UtilizadorRegistado> procurarUserNome(String user) {

		Set<UtilizadorRegistado> res = new HashSet<UtilizadorRegistado>();
		for (Iterator<UtilizadorRegistado> it = this.users.values().iterator(); it
				.hasNext();) {
			UtilizadorRegistado u = it.next();
			if (u.getUsername().contains(user))
				res.add(u.clone());
		}
		return res;
	}

	public Set<UtilizadorRegistado> procurarUserMail(String email) {

		Set<UtilizadorRegistado> res = new HashSet<UtilizadorRegistado>();
		for (Iterator<UtilizadorRegistado> it = this.users.values().iterator(); it
				.hasNext();) {
			UtilizadorRegistado u = it.next();
			if (u.getEmail().contains(email))
				res.add(u.clone());
		}
		return res;
	}

	// pré-condição: utilizador tem permissão para fazer propostas;
	// vendedor, comprador e anuncio existem ; valor e quantidade são válidos
	// ;
	// data das duas transacções é igual
	public void inserirProposta(Transaccao tVenda, Transaccao tCompra) {

		this.users.get(tVenda.getVendedor().getUsername()).inserirTransaccao(
				tVenda);
		this.users.get(tCompra.getComprador().getUsername()).inserirTransaccao(
				tCompra);
	}

	// pré-condição: possível confirmar pagamento
	public void confirmarPagamTransacc(String vendedor, int codigoTrans) {

		UtilizadorRegistado rV = this.users.get(vendedor);
		Transaccao tVenda = rV.getTransaccoes().get(codigoTrans), tCompra = null;
		UtilizadorRegistado rC = this.users.get(tVenda.getComprador()
				.getUsername());
		boolean exitFlag = true;
		for (Iterator<Transaccao> it = rC.getTransaccoes().values().iterator(); it
				.hasNext() && exitFlag;) {
			tCompra = it.next();
			if (tCompra.getVendedor().getUsername().equals(vendedor)
					&& tCompra.getAnuncio().equals(tVenda.getAnuncio())
					&& tCompra.getValor() == tVenda.getValor())
				exitFlag = false;
		}
		if (tCompra.getEstado() == Transaccao.OUTRO_AGUARDAR_PAGAMENTO) {
			tVenda.setEstado(Transaccao.SUCESSO);
			tCompra.setEstado(Transaccao.SUCESSO);
			rV.inserirTransaccao(tVenda.clone());
			rC.inserirTransaccao(tCompra.clone());
		} else {
			tVenda.setEstado(Transaccao.OUTRO_AGUARDAR_RECEPCAO);
			rV.inserirTransaccao(tVenda.clone());
		}
	}

	// pré-condição: possível confirmar recepção
	public void confirmarRecepTransacc(String comprador, int codigoTrans) {

		UtilizadorRegistado rC = this.users.get(comprador);
		Transaccao tCompra = rC.getTransaccoes().get(codigoTrans), tVenda = null;
		UtilizadorRegistado rV = this.users.get(tCompra.getVendedor()
				.getUsername());
		boolean exitFlag = true;
		for (Iterator<Transaccao> it = rV.getTransaccoes().values().iterator(); it
				.hasNext() && exitFlag;) {
			tVenda = it.next();
			if (tCompra.getComprador().getUsername().equals(comprador)
					&& tCompra.getAnuncio().equals(tVenda.getAnuncio())
					&& tCompra.getValor() == tVenda.getValor())
				exitFlag = false;
		}
		if (tVenda.getEstado() == Transaccao.OUTRO_AGUARDAR_RECEPCAO) {
			tVenda.setEstado(Transaccao.SUCESSO);
			tCompra.setEstado(Transaccao.SUCESSO);
			rV.inserirTransaccao(tVenda.clone());
			rC.inserirTransaccao(tCompra.clone());
		} else {
			tCompra.setEstado(Transaccao.OUTRO_AGUARDAR_PAGAMENTO);
			rC.inserirTransaccao(tCompra.clone());
		}
	}

	// é possível confirmar pagamento
	public void confirmarPagamTroca(String vendedor, int codigoTrans) {

		UtilizadorRegistado rV = this.users.get(vendedor);
		Transaccao tVenda = rV.getTransaccoes().get(codigoTrans), tCompra = null;
		UtilizadorRegistado rC = this.users.get(tVenda.getComprador()
				.getUsername());
		boolean exitFlag = true;
		for (Iterator<Transaccao> it = rC.getTransaccoes().values().iterator(); it
				.hasNext() && exitFlag;) {
			tCompra = it.next();
			if (tCompra.getVendedor().getUsername().equals(vendedor)
					&& tCompra.getAnuncio().equals(tVenda.getAnuncio())
					&& tCompra.getValor() == tVenda.getValor())
				exitFlag = false;
		}
		if (tVenda.getEstado() == Troca.EU_AGUARDAR_RECEPCAO_PAGAMENTO) {
			tVenda.setEstado(Transaccao.EU_AGUARDAR_RECEPCAO);
			if (tCompra.getEstado() == Troca.OUTRO_AGUARDAR_RECEPCAO_PAGAMENTO)
				tCompra.setEstado(Transaccao.OUTRO_AGUARDAR_RECEPCAO);
		} else {
			if (tVenda.getEstado() == Transaccao.EU_AGUARDAR_PAGAMENTO) {
				if (tCompra.getEstado() == Transaccao.OUTRO_AGUARDAR_PAGAMENTO) {
					tVenda.setEstado(Transaccao.SUCESSO);
					tCompra.setEstado(Transaccao.SUCESSO);
				} else
					tVenda.setEstado(Transaccao.OUTRO_AGUARDAR_RECEPCAO);
			}
		}
		rV.inserirTransaccao(tVenda);
		rC.inserirTransaccao(tCompra);
	}

	public void confirmarRecepTroca(String comerciante, int codigoTrans) {

		boolean beVendedor;
		UtilizadorRegistado a = this.users.get(comerciante), b;
		Transaccao tA = a.getTransaccoes().get(codigoTrans), tB = null;
		if (tA.getVendedor().getUsername().equals(comerciante)) {
			b = this.users.get(tA.getComprador().getUsername());
			beVendedor = false;
		} else {
			b = this.users.get(tA.getVendedor().getUsername());
			beVendedor = true;
		}
		boolean exitFlag = true;
		for (Iterator<Transaccao> it = b.getTransaccoes().values().iterator(); it
				.hasNext() && exitFlag;) {
			tB = it.next();
			if ((beVendedor ? tB.getComprador().getUsername()
					.equals(comerciante) : tB.getVendedor().getUsername()
					.equals(comerciante))
					&& tA.getAnuncio().equals(tB.getAnuncio())
					&& tA.getValor() == tB.getValor() * (-1))
				exitFlag = false;
		}
		confirmarRecepTrocaAux(tA, tB);
		a.inserirTransaccao(tA);
		b.inserirTransaccao(tB);
	}

	private void confirmarRecepTrocaAux(Transaccao tA, Transaccao tB) {

		if (tA.getValor() > 0) {
			switch (tB.getEstado()) {
			case Transaccao.OUTRO_AGUARDAR_RECEPCAO: {
				tA.setEstado(Transaccao.SUCESSO);
				tB.setEstado(Transaccao.SUCESSO);
				break;
			}
			case Transaccao.EU_AGUARDAR_RECEPCAO: {
				tA.setEstado(Transaccao.OUTRO_AGUARDAR_RECEPCAO);
				break;
			}
			case Troca.EU_AGUARDAR_RECEPCAO_PAGAMENTO: {
				tA.setEstado(Troca.OUTRO_AGUARDAR_RECEPCAO_PAGAMENTO);
				break;
			}
			case Transaccao.EU_AGUARDAR_PAGAMENTO: {
				tA.setEstado(Transaccao.OUTRO_AGUARDAR_PAGAMENTO);
				break;
			}
			default:
				break;
			}
		} else {
			if (tA.getValor() < 0) {
				if (tA.getEstado() == Troca.EU_AGUARDAR_RECEPCAO_PAGAMENTO) {
					tA.setEstado(Transaccao.EU_AGUARDAR_PAGAMENTO);
					if (tB.getEstado() == Troca.OUTRO_AGUARDAR_RECEPCAO_PAGAMENTO)
						tB.setEstado(Transaccao.OUTRO_AGUARDAR_PAGAMENTO);
				}
				if (tA.getEstado() == Transaccao.EU_AGUARDAR_RECEPCAO) {
					if (tB.getEstado() == Transaccao.OUTRO_AGUARDAR_RECEPCAO) {
						tA.setEstado(Transaccao.SUCESSO);
						tB.setEstado(Transaccao.SUCESSO);
					} else
						tA.setEstado(Transaccao.OUTRO_AGUARDAR_RECEPCAO);
				}
			} else {
				if (tB.getEstado() == Transaccao.OUTRO_AGUARDAR_RECEPCAO) {
					tA.setEstado(Transaccao.SUCESSO);
					tB.setEstado(Transaccao.SUCESSO);
				} else
					tA.setEstado(Transaccao.OUTRO_AGUARDAR_RECEPCAO);
			}
		}
	}

	// pré-condição: vendedor e transaccao existem; proposta pode ser
	// confirmada
	public void aceitarPropostaTransacc(String vendedor, int codTransac) {

		boolean exitFlag = false;
		UtilizadorRegistado v = this.users.get(vendedor), c;
		Transaccao tVenda = this.users.get(vendedor).getTransaccoes()
				.get(codTransac), tCompra = null;
		c = this.users.get(tVenda.getComprador().getUsername());
		for (Iterator<Transaccao> itT = c.getTransaccoes().values().iterator(); itT
				.hasNext() && !exitFlag;) {
			tCompra = itT.next();
			if (tCompra.getVendedor().getUsername().equals(vendedor)
					&& tCompra.getAnuncio().equals(tVenda.getAnuncio())
					&& tCompra.getValor() == tVenda.getValor())
				exitFlag = true;
		}
		tCompra.setEstado(Transaccao.EU_AGUARDAR_RECEPCAO);
		tVenda.setEstado(Transaccao.EU_AGUARDAR_PAGAMENTO);
		v.inserirTransaccao(tVenda.clone());
		c.inserirTransaccao(tCompra.clone());
	}

	// pré-condição: vendedor e transaccao existem; proposta pode ser
	// confirmada
	public void aceitarPropostaTroca(String vendedor, int codTransac) {

		boolean exitFlag = false;
		UtilizadorRegistado v = this.users.get(vendedor), c;
		Transaccao tVenda = v.getTransaccoes().get(codTransac), tCompra = null;
		c = this.users.get(tVenda.getComprador().getUsername());
		for (Iterator<Transaccao> itT = c.getTransaccoes().values().iterator(); itT
				.hasNext() && !exitFlag;) {
			tCompra = itT.next();
			if (tCompra.getVendedor().getUsername().equals(vendedor)
					&& tCompra.getAnuncio().equals(tVenda.getAnuncio())
					&& tCompra.getValor() == (tVenda.getValor() * (-1))) // simetria
																			// dos
																			// valores
																			// da
																			// troca
				exitFlag = true;
		}
		if (tVenda.getValor() > 0) {
			tVenda.setEstado(Troca.EU_AGUARDAR_RECEPCAO);
			tCompra.setEstado(Troca.EU_AGUARDAR_RECEPCAO_PAGAMENTO);
		} else {
			if (tVenda.getValor() < 0) {
				tCompra.setEstado(Troca.EU_AGUARDAR_RECEPCAO);
				tVenda.setEstado(Troca.EU_AGUARDAR_RECEPCAO_PAGAMENTO);
			} else {
				tVenda.setEstado(Troca.EU_AGUARDAR_RECEPCAO);
				tCompra.setEstado(Troca.EU_AGUARDAR_RECEPCAO);
			}
		}
		v.inserirTransaccao(tVenda.clone());
		c.inserirTransaccao(tCompra.clone());
	}

	// vendedorArg é o que rejeita a proposta (copy/paste de reportarProposta)
	public void rejeitarProposta(String vendedorArg, int codTransac) {

		UtilizadorRegistado vendedor = this.users.get(vendedorArg), comprador;
		Transaccao tVendedor = vendedor.getTransaccoes().get(codTransac), tComprador = null;
		boolean avaliadorEVendedor = (tVendedor.getVendedor().getUsername()
				.equals(vendedorArg) ? true : false);
		if (avaliadorEVendedor)
			comprador = this.users.get(tVendedor.getComprador().getUsername());
		else
			comprador = this.users.get(tVendedor.getVendedor().getUsername());
		tVendedor.setEstado(Transaccao.EU_REJEITAR);
		boolean exitFlag = true;
		for (Iterator<Transaccao> it = comprador.getTransaccoes().values()
				.iterator(); it.hasNext() && exitFlag;) {
			tComprador = it.next();
			if ((!avaliadorEVendedor ? tComprador.getComprador().getUsername()
					.equals(vendedorArg) : tComprador.getVendedor()
					.getUsername().equals(vendedorArg))
					&& tComprador.getAnuncio().equals(tVendedor.getAnuncio())
					&& (tComprador.getValor() == tVendedor.getValor() * (-1) || tComprador
							.getValor() == tVendedor.getValor()))
				exitFlag = false;
		}
		tComprador.setEstado(Transaccao.OUTRO_REJEITAR);
		comprador.inserirTransaccao(tComprador);
		vendedor.inserirTransaccao(tVendedor);
	}

	public void editarAnuncioTags(int codAnuncio, Set<String> tags) {
		this.anuncios.get(codAnuncio).editarTags(tags);
	}

	public void editarAnuncioCategorias(int codAnuncio, Set<String> categorias) {
		this.anuncios.get(codAnuncio).editarCategorias(categorias);
	}

	public void editarAnuncioDescricao(int codAnuncio, String descricao) {

		Anuncio a = this.anuncios.get(codAnuncio);
		a.setDescricao(descricao);
		this.anuncios.put(codAnuncio, a);
	}

	public void editarAnuncioQuantidade(int codAnuncio, int quantidade) {

		Anuncio a = this.anuncios.get(codAnuncio);
		a.setQuantidade(quantidade);
		this.anuncios.put(codAnuncio, a);
	}

	public void editarAnuncioTitulo(int codAnuncio, String titulo) {

		Anuncio a = this.anuncios.get(codAnuncio);
		a.setTitulo(titulo);
		this.anuncios.put(codAnuncio, a);
	}

	public void editarAnuncioImagens(int codAnuncio, Set<Imagem> imagens) {
		this.anuncios.get(codAnuncio).editarImagens(imagens);
	}

	public void editarAnuncioEstado(int codAnuncio, char estado) {

		Anuncio a = this.anuncios.get(codAnuncio);
		a.setEstadoAnuncio(estado);
		this.anuncios.put(codAnuncio, a);
	}

	public void incAnuncioVisitas(int codAnuncio) {

		Anuncio a = this.anuncios.get(codAnuncio);
		a.setnVisitas(a.getnVisitas() + 1);
		this.anuncios.put(codAnuncio, a);
	}

	// novo username é válido e não existe
	public void editarRegistadoUsername(String username, String novoUsername) {

		UtilizadorRegistado u = this.users.get(username);
		u.setUsername(novoUsername);
		this.users.remove(username);
		this.users.put(novoUsername, u.clone());
	}

	// email é válido
	public void editarRegistadoEmail(String username, String email) {

		UtilizadorRegistado u = this.users.get(username);
		u.setEmail(email);
		this.users.put(username, u.clone());
	}

	public void editarRegistadoMorada(String username, String morada) {

		UtilizadorRegistado u = this.users.get(username);
		u.setMorada(morada);
		this.users.put(username, u.clone());
	}

	public void editarRegistadoInfPessoal(String username, String informacaoP) {

		UtilizadorRegistado u = this.users.get(username);
		u.setInfPessoal(informacaoP);
		this.users.put(username, u.clone());
	}

	public void editarRegistadoContacto(String username, String contacto) {

		UtilizadorRegistado u = this.users.get(username);
		u.setContacto(contacto);
		this.users.put(username, u.clone());
	}

	public void editarRegistadoNome(String username, String nome) {

		UtilizadorRegistado u = this.users.get(username);
		u.setNome(nome);
		this.users.put(username, u.clone());
	}

	public void editarRegistadoDataN(String username, GregorianCalendar dataN) {

		UtilizadorRegistado u = this.users.get(username);
		u.setIdade(dataN);
		this.users.put(username, u.clone());
	}

	public void adicionarLeilaoLicitacao(int codAnunc, double valor) {

		AnuncioVenda a = (AnuncioVenda) this.anuncios.get(codAnunc);
		a.adicionarLicitacao(valor);
		this.anuncios.put(codAnunc, a);
	}

	public void adicionarVendaDirectaProposta(int codAnunc) {

		AnuncioVenda a = (AnuncioVenda) this.anuncios.get(codAnunc);
		a.adicionarProposta();
		this.anuncios.put(codAnunc, a);
	}

	// pré-condição: o utilizador existe
	public boolean temUserRating(String username) {

		boolean exitFlag = false;
		UtilizadorRegistado u = this.users.get(username);
		for (Iterator<Anuncio> it = this.anuncios.values().iterator(); it
				.hasNext() && !exitFlag;) {
			Anuncio a = it.next();
			for (Iterator<Avaliacao> itAval = a.getAvaliacoes().values()
					.iterator(); itAval.hasNext() && !exitFlag;)
				if (itAval.next().getAvaliador().getUsername().equals(username))
					exitFlag = true;
		}
		return exitFlag;
	}

	// pré-condição: existem ratings para o utilizador
	// classificações de 0 a 100
	public Set<Avaliacao> calcularRegistadoRating(String username) {

		//double res = 0;
		//ArrayList<Double> amostra = new ArrayList<Double>();
                Set<Avaliacao> res = new HashSet<Avaliacao>() ;
		UtilizadorRegistado u = this.users.get(username);
		for (Iterator<Anuncio> it = this.anuncios.values().iterator(); it
				.hasNext();) {
			Anuncio a = it.next();
                        if(a.getAnunciante().getUsername().equals(username)) {
                            res.addAll(a.getAvaliacoes().values());
                        }
		}		
		return res ;
	}

	// pré-condição: existem ratings para o utilizador
	public boolean eUserConfiavel(String username) {
		
            boolean res = false ;
            ArrayList<Double> notas = new ArrayList<Double>() ;
            Set<Avaliacao> av = this.calcularRegistadoRating(username) ;
            for(Iterator<Avaliacao> it = av.iterator(); it.hasNext(); ) {
                notas.add(it.next().getClassificacao()) ;                
            }
            if(notas.isEmpty() == false) {
                double sum = 0 ;
                for(Double d : notas)
                    sum += d ;
                if(sum/notas.size() >= UtilizadorRegistado.CLASSIFICACAO_MINIMA)
                    res = true ;
            }
            return res ;
	}

	public Set<Anuncio> procurarAnuncTag(String nome) {

		Set<Anuncio> res = new HashSet<Anuncio>();
		for (Iterator<Anuncio> itA = this.anuncios.values().iterator(); itA
				.hasNext();) {
			Anuncio a = itA.next();
			for (Iterator<Tag> itT = a.getTags().values().iterator(); itT
					.hasNext();)
				if (itT.next().getNome().equals(nome)) {
					res.add(a);
					break;
				}
		}
		return res;
	}

	public Set<Anuncio> procurarAnuncCat(String nome) {

		Set<Anuncio> res = new HashSet<Anuncio>();
		for (Iterator<Anuncio> itA = this.anuncios.values().iterator(); itA
				.hasNext();) {
			Anuncio a = itA.next();
			for (Iterator<Categoria> itC = a.getCategorias().values()
					.iterator(); itC.hasNext();)
				if (itC.next().getNome().equals(nome)) {
					res.add(a);
					break;
				}
		}
		return res;
	}

	// dimensão dos dois arrays é a mesma; valores correspondem ao esperado no
	// case;
	public Set<Anuncio> procurarAnuncAvanc(String[] campos, Object[] valores) {

		Set<Anuncio> res = new TreeSet<Anuncio>(new ComparadorUltimosAnunc());
		boolean exitFlag;
		for (Iterator<Anuncio> it = this.anuncios.values().iterator(); it
				.hasNext();) {
			Anuncio a = it.next();
			exitFlag = true;
			for (int i = 0; i < campos.length && exitFlag; i++) {
				switch (campos[i]) {
                                case "tit": { exitFlag = exitFlag && a.getTitulo().contains((String)valores[i]) ; break;}    
                                case "desc" : {exitFlag = exitFlag && a.getDescricao().contains((String)valores[i]) ; break ;}
				case "pMenorI": {
					exitFlag = exitFlag && a.getPreco() <= (Double) valores[i];
					break;
				}
				case "pMaiorI": {
					exitFlag = exitFlag && a.getPreco() >= (Double) valores[i];
					break;
				}
				case "c": {
					exitFlag = exitFlag
							&& (a.getCategorias().containsKey(
									(String) valores[i]) || (a.eFilho((String)valores[i])));
					break;
				}
				case "t": {
					exitFlag = exitFlag
							&& a.getTags().containsKey((String) valores[i]);
					break;
				}
				case "l": {
					exitFlag = exitFlag
							&& a.getClass().getName()
									.equals((String) valores[i]);
					break;
				}
				/*case "rMaiorI": {
					UtilizadorRegistado u = a.getAnunciante();
					if (temUserRating(u.getUsername()))
						exitFlag = exitFlag
								&& calcularRegistadoRating(u.getUsername()) >= (Double) valores[i];
					break;
				}*/
				case "e": {
					exitFlag = exitFlag
							&& a.isEstadoProduto() == (Boolean) valores[i];
					break;
				}
				case "n": {
					exitFlag = exitFlag
							&& a.getnVisitas() >= (Integer) valores[i];
					break;
				}
                                case "mp": {
                                    exitFlag = exitFlag && ((AnuncioVenda)a).getModosPagamento().contains((String)valores[i]) ; break ;
                                }
                                case "me": {
                                    exitFlag = exitFlag && ((AnuncioVenda)a).getMetodoEnvio().contains((String)valores[i]) ; break ;
                                }    
                                case "user": {
                                    exitFlag = exitFlag && a.getAnunciante().getUsername().equals((String)valores[i]) ; break ;
                                }
				default: {
				}
				}
				if (exitFlag == true)
					res.add(a);
			}
		}
		return res;
	}

	// pré-condição: classificação entre 0 e 100
	public void avaliarAnuncio(int codAnunc, Avaliacao avaliacao) {
		this.anuncios.get(codAnunc).inserirAvaliacao(avaliacao);
	}

	public void avaliarTransac(/* Avaliacao avaliacao, */String avaliadorArg,
			int codTransac) {

		UtilizadorRegistado avaliador = this.users.get(avaliadorArg), avaliado;
		Transaccao tAvaliador = avaliador.getTransaccoes().get(codTransac), tAvaliado = null;
		boolean avaliadorEVendedor = (tAvaliador.getVendedor().getUsername()
				.equals(avaliadorArg) ? true : false);
		if (avaliadorEVendedor)
			avaliado = this.users.get(tAvaliador.getComprador().getUsername());
		else
			avaliado = this.users.get(tAvaliador.getVendedor().getUsername());
		tAvaliador.setEstado(Transaccao.EU_REPORTAR);
		boolean exitFlag = true;
		for (Iterator<Transaccao> it = avaliado.getTransaccoes().values()
				.iterator(); it.hasNext() && exitFlag;) {
			tAvaliado = it.next();
			if ((!avaliadorEVendedor ? tAvaliado.getComprador().getUsername()
					.equals(avaliadorArg) : tAvaliado.getVendedor()
					.getUsername().equals(avaliadorArg))
					&& tAvaliado.getAnuncio().equals(tAvaliador.getAnuncio())
					&& (tAvaliado.getValor() == tAvaliador.getValor() * (-1) || tAvaliado
							.getValor() == tAvaliador.getValor()))
				exitFlag = false;
		}
		tAvaliado.setEstado(Transaccao.OUTRO_REPORTAR);
		/*
		 * tAvaliador.setAvaliacao(avaliacao.clone()) ;
		 * tAvaliado.setAvaliacao(avaliacao.clone()) ;
		 */
		avaliado.inserirTransaccao(tAvaliado);
		avaliador.inserirTransaccao(tAvaliador);
	}

	public SortedSet<Anuncio> procurarAnuncMaisVis() {

		SortedSet<Anuncio> res = new TreeSet<Anuncio>(new ComparadorAnuncNVis());
		for (Anuncio a : this.anuncios.values())
			res.add(a);
		return res;
	}

	public boolean eValidoEmail(String email) {
		return UtilizadorRegistado.validaEmail(email);
	}

	public boolean eValidaPassword(String pw) {
		return UtilizadorRegistado.validaPassword(pw);
	}

	// public boolean eValidoContacto (String contacto) {return
	// UtilizadorRegistado.validaContacto(contacto) ;}

	// pré-condição: username é válido
	public boolean eValidoLogin(String username, String pw) {
		return this.users.get(username).passwordCorresponde(pw);
	}

	// vazio se não houver nenhum anúncio que seja de um user ou de uma
	// categoria seguida
	// na cabeça da lista o best match
	// o resto aleatoriamente ordenado
	public ArrayList<Anuncio> sugerirAnuncios(String username,
			ArrayList<Character> causa) {

		ArrayList<Anuncio> res = new ArrayList<Anuncio>(), catOuUser = new ArrayList<Anuncio>();
		ArrayList<Character> catOuUserChar = new ArrayList<Character>();
		UtilizadorRegistado u = this.users.get(username);
		Set<String> categSeg = u.getCategSeguidas().keySet(), usersSeg = u
				.getUsersSeguidos().keySet();
		for (Anuncio a : this.anuncios.values()) {
			boolean c = contemAlgumElem(categSeg, a.getCategorias().keySet()), us = u
					.existeUserSeguido(a.getAnunciante().getUsername());
			if (c && us) {
				res.add(a);
				causa.add(CATEG_E_USER);
			} else {
				if (c || us) {
					catOuUser.add(a);
					catOuUserChar.add(c == true ? CATEG : USER);
				}
			}
		}
		long l = System.nanoTime();
		Collections.shuffle(catOuUser, new Random(l));
		Collections.shuffle(catOuUserChar, new Random(l));
		res.addAll(catOuUser);
		causa.addAll(catOuUserChar);
		return res;
	}

	private boolean contemAlgumElem(Set<String> a, Set<String> b) {

		boolean res = false;
		for (Iterator<String> it = a.iterator(); it.hasNext() && !res;)
			if (b.contains(it.next()))
				res = true;
		return res;
	}

	public boolean ePossivelTrocar(String comprador, String vendedor) {

		boolean res = false;
		UtilizadorRegistado c = this.users.get(comprador), v = this.users
				.get(vendedor);
		Set<String> catSegVend = this.users.get(vendedor).getCategSeguidas()
				.keySet();
		Collection<Anuncio> anuncs = this.anuncios.values();
		for (Iterator<Anuncio> itA = anuncs.iterator(); itA.hasNext() && !res;) {
			Anuncio a = itA.next();
			if ((a.getEstadoAnuncio() == Anuncio.ABERTO)
					&& (a.getQuantidade() > 0)
					&& (a.getClass().getName().equals(VendaDirecta.class.getName()))
					&& a.getAnunciante().getUsername().equals(comprador)
					&& contemAlgumElem(a.getCategorias().keySet(), catSegVend))
				res = true;
		}
		return res;
	}

	// pré-condição: comprador e vendedor existem
	// Set vazio se não for possível sugerir
	// ordenado de forma crescente pelo módulo da diferença entre o produto
	// requerido pelo comprador e os sugeridos pela troca
	public SortedSet<Anuncio> sugerirAnunciosTroca(String comprador,
			String vendedor, int codAnunc) {

		TreeSet<Anuncio> res = new TreeSet<Anuncio>(new ComparadorAnuncTroca());
		UtilizadorRegistado c, v = this.users
				.get(vendedor);
		c = this.users.get(comprador);
		Set<String> catSegVend = this.users.get(vendedor).getCategSeguidas()
				.keySet();
		Collection<Anuncio> anuncs = this.anuncios.values();
		ComparadorAnuncTroca.precoAnuncTroca = this.anuncios.get(codAnunc)
				.getPreco();
		for (Iterator<Anuncio> itA = anuncs.iterator(); itA.hasNext();) {
			Anuncio a = itA.next();
			if ((a.getEstadoAnuncio() == Anuncio.ABERTO)
					&& (a.getQuantidade() > 0)
					&& (a.getClass().getName().equals(VendaDirecta.class.getName()))
					&& a.getAnunciante().getUsername().equals(comprador)
					&& contemAlgumElem(a.getCategorias().keySet(), catSegVend))
				res.add(a);
		}
		return res;
	}

	public Iterator<Anuncio> ultimosAnuncios() {

		TreeSet<Anuncio> res = new TreeSet<Anuncio>(
				new ComparadorUltimosAnunc());
		ComparadorUltimosAnunc.tempoActual = new GregorianCalendar();
		res.addAll(this.anuncios.values());
		return res.iterator();
	}

	// tempo restante em milisegundos
	// pré-condição: modo de venda de anúncio é leilão
	public long tempoRestante(int codAnunc) {
		return this.anuncios.get(codAnunc)
				.calculaTempoRestante();
	}

	public Collection<Anuncio> anunciosSeguidos(String username) {
		return this.users.get(username).getAnuncSeguidos().values();
	}

	// ordem decrescente de número de ocorrências
	public SortedSet<Tag> topTags() {

		ComparadorAnuncioTag.ocorrenciasTags.clear();
		for (Anuncio a : this.anuncios.values()) {
			for (Tag t : a.getTags().values()) {
				if (ComparadorAnuncioTag.ocorrenciasTags.containsKey(t))
					ComparadorAnuncioTag.ocorrenciasTags.put(t,
							ComparadorAnuncioTag.ocorrenciasTags.get(t) + 1);
				else
					ComparadorAnuncioTag.ocorrenciasTags.put(t, 1);
			}
		}
		TreeSet<Tag> res = new TreeSet<Tag>(new ComparadorAnuncioTag());
		res.addAll(ComparadorAnuncioTag.ocorrenciasTags.keySet());
		return res;
	}

	public void iniciarConexao() {
		ConexaoBD.iniciarConexao();
	}

	public void terminarConexao() {
		ConexaoBD.terminarConexao();
	}

	public int registaIdMsg() {
		return Registo.registaIdMsg();
	}

	public int registaIdTransac() {
		return Registo.registaIdTransac();
	}

	public int registaIdAnuncio() {
		return Registo.registaIdAnuncio();
	}

	public int registaIdAvaliacao() {
		return Registo.registaIdAvaliacao();
	}

	public int registaIdUtilizador() {
		return Registo.registaIdUtilizador();
	}

	public int registaIdModoVenda() {
		return Registo.registaIdModoVenda();
	}

	public int registaIdImagem() {
		return Registo.registaIdImagem();
	}

	public void registaUtilizador() {

		int a = this.registaIdUtilizador();
		this.emSessao = new Utilizador(a);
		Registo.inserirUtilizador(emSessao);
	}
	
	public void logout(){
		this.emSessao = new Utilizador(this.registaIdUtilizador());}
        
        public SortedSet<Anuncio> anuncioOrdPreco() {
            
            TreeSet<Anuncio> res = new TreeSet<Anuncio>(new ComparadorAnuncPreco(ComparadorAnuncPreco.CRESCENTE)) ;
            for(Anuncio a : this.anuncios.values())
                res.add(a) ;
            return res ;
        }
        
        public SortedSet<Anuncio> anuncioOrdtempoRestante()  {
            
            TreeSet<Anuncio> res = new TreeSet<Anuncio>(new ComparadorATerminar()) ;
            for(Anuncio a : this.anuncios.values())
                res.add(a) ;
            return res ;
        }
}
