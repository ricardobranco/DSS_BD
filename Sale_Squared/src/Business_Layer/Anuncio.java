package business_Layer;

import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import data_Layer.AvaliacaoAnuncioDAO;
import data_Layer.CategoriaAnuncioDAO;
import data_Layer.ImagemAnuncioDAO;
import data_Layer.TagAnuncioDAO;


public abstract class Anuncio {

	// v. c.
	public static final boolean NOVO = true;
	public static final boolean USADO = false;

	// public static final char ANUNCIO_COMPRA = 0 ;
	// public static final char ANUNCIO_VENDA = 1 ;

	public static final char ABERTO = 0;
	public static final char BLOQUEADO = 1;
	public static final char ENCERRADO = 2;

	// v. i.
	private Map<String, Tag> tags;
	private Map<String, Categoria> categorias;
	private Map<Integer, Avaliacao> avaliacoes;
	private Map<String, Imagem> imagens;
	private int codigo;
	private String titulo;
	private GregorianCalendar dataInser;
	private GregorianCalendar dataExpir;
	private double preco;
	private String descricao;
	private int quantidade;
	private int nVisitas;
	private boolean estadoProduto;
	private int estadoAnuncio;
	private UtilizadorRegistado anunciante;

	// construtor
	public Anuncio(int codigo, String titulo, GregorianCalendar dataInser,
			GregorianCalendar dataExpir, double preco, String descricao,
			int quantidade, int nVisitas, boolean estadoProduto,
			int estadoAnuncio, UtilizadorRegistado anunciante) {
		this.tags = new TagAnuncioDAO(codigo);
		this.categorias = new CategoriaAnuncioDAO(codigo);
		this.avaliacoes = new AvaliacaoAnuncioDAO(codigo);
		this.codigo = codigo;
		this.titulo = titulo;
		this.dataInser = dataInser;
		this.dataExpir = dataExpir;
		this.preco = preco;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.imagens = new ImagemAnuncioDAO(codigo);
		this.nVisitas = nVisitas;
		this.estadoProduto = estadoProduto;
		this.estadoAnuncio = estadoAnuncio;
		this.anunciante = anunciante;
	}

	public Anuncio(int codigo) {
		this.codigo = codigo;
		this.tags = new TagAnuncioDAO(codigo);
		this.categorias = new CategoriaAnuncioDAO(codigo);
		this.avaliacoes = new AvaliacaoAnuncioDAO(codigo);
		this.imagens = new ImagemAnuncioDAO(codigo);
	}

	// get e set
	public Map<String, Tag> getTags() {
		return tags;
	}

	public void setTags(Map<String, Tag> tags) {
		this.tags = tags;
	}

	public Map<String, Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Map<String, Categoria> categorias) {
		this.categorias = categorias;
	}

	public Map<Integer, Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Map<Integer, Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public GregorianCalendar getDataInser() {
		return dataInser;
	}

	public void setDataInser(GregorianCalendar dataInser) {
		this.dataInser = dataInser;
	}

	public GregorianCalendar getDataExpir() {
		return dataExpir;
	}

	public void setDataExpir(GregorianCalendar dataExpir) {
		this.dataExpir = dataExpir;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Map<String, Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(Map<String, Imagem> imagens) {
		this.imagens = imagens;
	}

	public int getnVisitas() {
		return nVisitas;
	}

	public void setnVisitas(int nVisitas) {
		this.nVisitas = nVisitas;
	}

	public boolean isEstadoProduto() {
		return estadoProduto;
	}

	public void setEstadoProduto(boolean estadoProduto) {
		this.estadoProduto = estadoProduto;
	}

	public int getEstadoAnuncio() {
		return estadoAnuncio;
	}

	public void setEstadoAnuncio(int estadoAnuncio) {
		this.estadoAnuncio = estadoAnuncio;
	}

	public UtilizadorRegistado getAnunciante() {
		return anunciante;
	}

	public void setAnunciante(UtilizadorRegistado anunciante) {
		this.anunciante = anunciante;
	}

	// e, tS
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Anuncio other = (Anuncio) obj;
		if (this.codigo != other.getCodigo()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Anuncio{" + "tags=" + this.tags.toString() + ", categorias="
				+ this.categorias.toString() + ", avaliacoes="
				+ this.avaliacoes.toString() + ", codigo=" + this.codigo
				+ ", titulo=" + this.titulo + ", dataInser="
				+ this.dataInser.toString() + ", dataExpir="
				+ this.dataExpir.toString() + ", preco=" + this.preco
				+ ", descricao=" + this.descricao + ", quantidade="
				+ this.quantidade + ", imagens=" + this.imagens.toString()
				+ ", nVisitas=" + this.nVisitas + ", estadoProduto="
				+ this.estadoProduto + ", estadoAnuncio=" + this.estadoAnuncio
				+ ", anunciante=" + this.anunciante.toString() + '}';
	}

	// gestão maps e set
	public Tag inserirTag(Tag t) {
		return this.tags.put(t.getNome(), t.clone());
	}

	public Tag removerTag(String tag) {
		return this.tags.remove(tag);
	}

	public Tag encontrarTag(String tag) {
		return this.tags.get(tag);
	}

	public boolean existeTag(String tag) {
		return this.tags.containsKey(tag);
	}

	public boolean temTags() {
		return !this.tags.isEmpty();
	}

	public boolean eNullTags() {
		return this.tags == null;
	}

	public Categoria inserirCategoria(Categoria c) {
		return this.categorias.put(c.getNome(), c.clone());
	}

	public Categoria removerCategoria(String categoria) {
		return this.categorias.remove(categoria);
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

	public Avaliacao inserirAvaliacao(Avaliacao a) {
		return this.avaliacoes.put(a.getId(), a.clone());
	}

	public Avaliacao removerAvaliacao(int a) {
		return this.avaliacoes.remove(a);
	}

	public Avaliacao encontrarAvaliacao(int a) {
		return this.avaliacoes.get(a);
	}

	public boolean existeAvaliacao(int a) {
		return this.avaliacoes.containsKey(a);
	}

	public boolean temAvaliacoes() {
		return !this.avaliacoes.isEmpty();
	}

	public boolean eNullAvaliacoes() {
		return this.avaliacoes == null;
	}

	public Imagem inserirImagem(Imagem imagem) {
		return this.imagens.put(imagem.getNome(), imagem);
	}

	public Imagem removerImagem(String imagem) {
		return this.imagens.remove(imagem);
	}

	public boolean existeImagem(String imagem) {
		return this.imagens.containsKey(imagem);
	}

	public boolean temImagens() {
		return !this.imagens.isEmpty();
	}

	public boolean eNullImagens() {
		return this.imagens == null;
	}

	public void editarTags(Set<String> tagsArg) {

		this.tags.clear();
		for (String t : tagsArg)
			this.tags.put(t, new Tag(t));
	}

	public void editarCategorias(Set<String> categoriasArg) {

		this.categorias.clear();
		for (String c : categoriasArg)
			this.categorias.put(c, new Categoria(c));
	}

	public void editarImagens(Set<Imagem> imagensArg) {

		this.imagens.clear();
		for (Imagem i : imagensArg)
			this.imagens.put(i.getNome(), i);
	}
}

class ComparadorAnuncNVis implements Comparator<Anuncio> {

	// ordem decrescente
	public int compare(Anuncio a, Anuncio b) {

		if (a.getnVisitas() >= b.getnVisitas())
			return -1;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}

class ComparadorAnuncPreco implements Comparator<Anuncio> {

	// ordem crescente
	public int compare(Anuncio a, Anuncio b) {

		if (a.getPreco() <= b.getPreco())
			return -1;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}

class ComparadorAnuncTroca implements Comparator<Anuncio> {

	public static double precoAnuncTroca;

	public int compare(Anuncio a, Anuncio b) {

		if (Math.abs(a.getPreco() - precoAnuncTroca) >= Math.abs(b.getPreco()
				- precoAnuncTroca))
			return 1;
		else
			return -1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}

}

class ComparadorUltimosAnunc implements Comparator<Anuncio> {

	public static GregorianCalendar tempoActual;

	public int compare(Anuncio a, Anuncio b) {

		long dA = tempoActual.getTimeInMillis()
				- a.getDataInser().getTimeInMillis();
		long dB = tempoActual.getTimeInMillis()
				- b.getDataInser().getTimeInMillis();
		if (dA >= dB)
			return 1;
		else
			return -1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}

class ComparadorAnuncioTag implements Comparator<Tag> {

	public static Map<Tag, Integer> ocorrenciasTags = new HashMap<Tag, Integer>();

	public int compare(Tag a, Tag b) {

		if (ocorrenciasTags.get(a) >= ocorrenciasTags.get(b))
			return -1;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}