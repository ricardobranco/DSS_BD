CREATE SEQUENCE seq_Transaccao;
CREATE SEQUENCE seq_Avaliacao;
CREATE SEQUENCE seq_ModoVenda;
CREATE SEQUENCE seq_Anuncio;
CREATE SEQUENCE seq_Mensagem;
CREATE SEQUENCE seq_Utilizador;
CREATE TABLE CodigoPostal (
  codPostal  varchar2(15) NOT NULL, 
  localidade varchar2(30) NOT NULL, 
  PRIMARY KEY (codPostal));
CREATE TABLE Localidade (
  localidade varchar2(30) NOT NULL, 
  pais       varchar2(30) NOT NULL, 
  PRIMARY KEY (localidade));
CREATE TABLE Pais (
  nome varchar2(30) NOT NULL, 
  PRIMARY KEY (nome));
CREATE TABLE Sistema (
  idUtilizador number(10) NOT NULL, 
  idMensagem   number(10) NOT NULL, 
  idTransaccao number(10) NOT NULL, 
  idAnuncio    number(10) NOT NULL, 
  idModoVenda  number(10) NOT NULL, 
  idAvaliacao  number(10) NOT NULL, 
  idImagem     number(10) NOT NULL);
CREATE TABLE AnuncioSeguido (
  username varchar2(30) NOT NULL, 
  anuncio  number(10) NOT NULL, 
  PRIMARY KEY (username, 
  anuncio));
CREATE TABLE Troca (
  id      number(10) NOT NULL, 
  anuncio number(10) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ModoPagamento (
  anuncio       number(10) NOT NULL, 
  modoPagamento varchar2(30) NOT NULL, 
  PRIMARY KEY (anuncio, 
  modoPagamento));
CREATE TABLE Transaccao (
  id            number(10) NOT NULL, 
  data          date NOT NULL, 
  valor         number NOT NULL, 
  modoPagamento varchar2(30) NOT NULL, 
  moradaFact    varchar2(50) NOT NULL, 
  codPostalFact varchar2(15) NOT NULL, 
  estado        number(10) NOT NULL, 
  quantidade    number(10) NOT NULL, 
  anuncio       number(10) NOT NULL, 
  comprador     varchar2(30) NOT NULL, 
  vendedor      varchar2(30) NOT NULL, 
  tipo          varchar2(1) NOT NULL, 
  pertence      number(10) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE Avaliacao (
  id            number(10) NOT NULL, 
  anuncio       number(10) NOT NULL, 
  avaliador     varchar2(30) NOT NULL, 
  classificacao number NOT NULL, 
  comentario    varchar2(4000) NOT NULL, 
  data          date NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE AnuncioVisitado (
  utilizador number(10) NOT NULL, 
  anuncio    number(10) NOT NULL, 
  dataVisualizacao date NOT NULL,
  PRIMARY KEY (utilizador, 
  anuncio));
CREATE TABLE VendaDirecta (
  id         number(10) NOT NULL, 
  nPropostas number(10) NOT NULL, 
  preco      number NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE Leilao (
  id          number(10) NOT NULL, 
  precoBase   number NOT NULL, 
  precoActual number NOT NULL, 
  nLicitacoes number(10) NOT NULL, 
  dataFim     date NOT NULL, 
  incMinimo   number(1), 
  PRIMARY KEY (id));
CREATE TABLE ModoVenda (
  id   number(10) NOT NULL, 
  tipo varchar2(1) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE AnuncioVenda (
  id               number(10) NOT NULL, 
  envioEstrangeiro varchar2(1) NOT NULL, 
  condicoesEnvio   varchar2(30), 
  precoEnvio       number NOT NULL, 
  seguro           number NOT NULL, 
  metodoEnvio      varchar2(30) NOT NULL, 
  propostaTrocar   varchar2(1) NOT NULL, 
  modoVenda        number(10) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE RespostaAnuncio (
  resposta number(10) NOT NULL, 
  anuncio  number(10) NOT NULL, 
  PRIMARY KEY (resposta, 
  anuncio));
CREATE TABLE AnuncioCompra (
  id            number(10) NOT NULL, 
  precoSugerido number NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE CategoriaAnuncio (
  anuncio   number(10) NOT NULL, 
  categoria varchar2(30) NOT NULL, 
  PRIMARY KEY (anuncio, 
  categoria));
CREATE TABLE TagAnuncio (
  anuncio number(10) NOT NULL, 
  tag     varchar2(30) NOT NULL, 
  PRIMARY KEY (anuncio, 
  tag));
CREATE TABLE ImagemAnuncio (
  anuncio number(10) NOT NULL, 
  imagem  blob NOT NULL, 
  nome    varchar2(30) NOT NULL, 
  PRIMARY KEY (anuncio, 
  nome));
CREATE TABLE Anuncio (
  id            number(10) NOT NULL, 
  titulo        varchar2(30) NOT NULL, 
  dataInsercao  date NOT NULL, 
  dataExp       date NOT NULL, 
  descricao     varchar2(4000) NOT NULL, 
  quantidade    number(10) NOT NULL, 
  nVisitas      number(10) NOT NULL, 
  estadoProduto varchar2(1) NOT NULL, 
  estadoAnuncio number(10) NOT NULL, 
  anunciante    varchar2(30) NOT NULL, 
  tipo          varchar2(1) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE CategoriaSeguida (
  username  varchar2(30) NOT NULL, 
  categoria varchar2(30) NOT NULL, 
  PRIMARY KEY (username, 
  categoria));
CREATE TABLE UserSeguido (
  seguidor varchar2(30) NOT NULL, 
  seguido  varchar2(30) NOT NULL, 
  PRIMARY KEY (seguidor, 
  seguido));
CREATE TABLE Mensagem (
  id        number(10) NOT NULL, 
  assunto   varchar2(100), 
  corpo     varchar2(2000), 
  dataEnvio date NOT NULL, 
  estado    number(10) NOT NULL, 
  emissor   varchar2(30) NOT NULL, 
  receptor  varchar2(30) NOT NULL, 
  pertence  number(10) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE UtilizadorRegistado (
  id         number(10) NOT NULL UNIQUE, 
  username   varchar2(30) NOT NULL, 
  password   varchar2(50) NOT NULL, 
  estado     number(10) NOT NULL, 
  email      varchar2(30) NOT NULL UNIQUE, 
  morada     varchar2(50), 
  codPostal  varchar2(15), 
  infPessoal varchar2(1000), 
  imagem     blob, 
  contacto   varchar2(20), 
  nome       varchar2(50) NOT NULL, 
  dataNasc   date NOT NULL, 
  nomeImagem varchar2(30), 
  dataRegisto date NOT NULL,
  PRIMARY KEY (username));
CREATE TABLE Utilizador (
  id   number(10) NOT NULL, 
  tipo varchar2(1) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE Categoria (
  nome varchar2(30) NOT NULL, 
  pai  varchar2(30), 
  PRIMARY KEY (nome));
ALTER TABLE Localidade ADD CONSTRAINT FKLocalidade739048 FOREIGN KEY (pais) REFERENCES Pais (nome);
ALTER TABLE CodigoPostal ADD CONSTRAINT FKCodigoPost605162 FOREIGN KEY (localidade) REFERENCES Localidade (localidade);
ALTER TABLE Transaccao ADD CONSTRAINT FKTransaccao14864 FOREIGN KEY (codPostalFact) REFERENCES CodigoPostal (codPostal);
ALTER TABLE UtilizadorRegistado ADD CONSTRAINT FKUtilizador727750 FOREIGN KEY (codPostal) REFERENCES CodigoPostal (codPostal);
ALTER TABLE Categoria ADD CONSTRAINT FKCategoria814671 FOREIGN KEY (pai) REFERENCES Categoria (nome);
ALTER TABLE UtilizadorRegistado ADD CONSTRAINT FKUtilizador781670 FOREIGN KEY (id) REFERENCES Utilizador (id);
ALTER TABLE Mensagem ADD CONSTRAINT FKMensagem119900 FOREIGN KEY (emissor) REFERENCES UtilizadorRegistado (username);
ALTER TABLE Mensagem ADD CONSTRAINT FKMensagem310510 FOREIGN KEY (receptor) REFERENCES UtilizadorRegistado (username);
ALTER TABLE UserSeguido ADD CONSTRAINT FKUserSeguid165507 FOREIGN KEY (seguidor) REFERENCES UtilizadorRegistado (username);
ALTER TABLE UserSeguido ADD CONSTRAINT FKUserSeguid764807 FOREIGN KEY (seguido) REFERENCES UtilizadorRegistado (username);
ALTER TABLE CategoriaSeguida ADD CONSTRAINT FKCategoriaS661566 FOREIGN KEY (username) REFERENCES UtilizadorRegistado (username);
ALTER TABLE CategoriaSeguida ADD CONSTRAINT FKCategoriaS652045 FOREIGN KEY (categoria) REFERENCES Categoria (nome);
ALTER TABLE ImagemAnuncio ADD CONSTRAINT FKImagemAnun778636 FOREIGN KEY (anuncio) REFERENCES Anuncio (id);
ALTER TABLE TagAnuncio ADD CONSTRAINT FKTagAnuncio994101 FOREIGN KEY (anuncio) REFERENCES Anuncio (id);
ALTER TABLE CategoriaAnuncio ADD CONSTRAINT FKCategoriaA770216 FOREIGN KEY (anuncio) REFERENCES Anuncio (id);
ALTER TABLE CategoriaAnuncio ADD CONSTRAINT FKCategoriaA137625 FOREIGN KEY (categoria) REFERENCES Categoria (nome);
ALTER TABLE Anuncio ADD CONSTRAINT FKAnuncio17384 FOREIGN KEY (anunciante) REFERENCES UtilizadorRegistado (username);
ALTER TABLE AnuncioCompra ADD CONSTRAINT FKAnuncioCom959354 FOREIGN KEY (id) REFERENCES Anuncio (id);
ALTER TABLE RespostaAnuncio ADD CONSTRAINT FKRespostaAn247606 FOREIGN KEY (resposta) REFERENCES Anuncio (id);
ALTER TABLE RespostaAnuncio ADD CONSTRAINT FKRespostaAn508434 FOREIGN KEY (anuncio) REFERENCES AnuncioCompra (id);
ALTER TABLE AnuncioVenda ADD CONSTRAINT FKAnuncioVen901398 FOREIGN KEY (id) REFERENCES Anuncio (id);
ALTER TABLE Leilao ADD CONSTRAINT FKLeilao826355 FOREIGN KEY (id) REFERENCES ModoVenda (id);
ALTER TABLE VendaDirecta ADD CONSTRAINT FKVendaDirec136671 FOREIGN KEY (id) REFERENCES ModoVenda (id);
ALTER TABLE AnuncioVisitado ADD CONSTRAINT FKAnuncioVis316697 FOREIGN KEY (utilizador) REFERENCES Utilizador (id);
ALTER TABLE AnuncioVisitado ADD CONSTRAINT FKAnuncioVis702547 FOREIGN KEY (anuncio) REFERENCES Anuncio (id);
ALTER TABLE Avaliacao ADD CONSTRAINT FKAvaliacao197160 FOREIGN KEY (anuncio) REFERENCES Anuncio (id);
ALTER TABLE Avaliacao ADD CONSTRAINT FKAvaliacao200278 FOREIGN KEY (avaliador) REFERENCES UtilizadorRegistado (username);
ALTER TABLE ModoPagamento ADD CONSTRAINT FKModoPagame494855 FOREIGN KEY (anuncio) REFERENCES AnuncioVenda (id);
ALTER TABLE Transaccao ADD CONSTRAINT FKTransaccao418130 FOREIGN KEY (anuncio) REFERENCES Anuncio (id);
ALTER TABLE Transaccao ADD CONSTRAINT FKTransaccao321008 FOREIGN KEY (comprador) REFERENCES UtilizadorRegistado (username);
ALTER TABLE Transaccao ADD CONSTRAINT FKTransaccao349150 FOREIGN KEY (vendedor) REFERENCES UtilizadorRegistado (username);
ALTER TABLE Troca ADD CONSTRAINT FKTroca494242 FOREIGN KEY (id) REFERENCES Transaccao (id);
ALTER TABLE Troca ADD CONSTRAINT FKTroca94310 FOREIGN KEY (anuncio) REFERENCES Anuncio (id);
ALTER TABLE AnuncioSeguido ADD CONSTRAINT FKAnuncioSeg481781 FOREIGN KEY (username) REFERENCES UtilizadorRegistado (username);
ALTER TABLE AnuncioSeguido ADD CONSTRAINT FKAnuncioSeg416539 FOREIGN KEY (anuncio) REFERENCES Anuncio (id);
ALTER TABLE AnuncioVenda ADD CONSTRAINT FKAnuncioVen283560 FOREIGN KEY (modoVenda) REFERENCES ModoVenda (id);
CREATE INDEX CodigoPostal_codPostal 
  ON CodigoPostal (codPostal);
CREATE INDEX CodigoPostal_localidade 
  ON CodigoPostal (localidade);
CREATE INDEX Localidade_localidade 
  ON Localidade (localidade);
CREATE INDEX Localidade_pais 
  ON Localidade (pais);
CREATE INDEX AnuncioSeguido_username 
  ON AnuncioSeguido (username);
CREATE INDEX Transaccao_id 
  ON Transaccao (id);
CREATE INDEX Transaccao_anuncio 
  ON Transaccao (anuncio);
CREATE INDEX Transaccao_comprador 
  ON Transaccao (comprador);
CREATE INDEX Transaccao_vendedor 
  ON Transaccao (vendedor);
CREATE INDEX Avaliacao_anuncio 
  ON Avaliacao (anuncio);
CREATE INDEX Avaliacao_avaliador 
  ON Avaliacao (avaliador);
CREATE INDEX AnuncioVisitado_utilizador 
  ON AnuncioVisitado (utilizador);
CREATE INDEX VendaDirecta_id 
  ON VendaDirecta (id);
CREATE INDEX Leilao_id 
  ON Leilao (id);
CREATE INDEX Leilao_dataFim 
  ON Leilao (dataFim);
CREATE INDEX ModoVenda_id 
  ON ModoVenda (id);
CREATE INDEX AnuncioVenda_id 
  ON AnuncioVenda (id);
CREATE INDEX AnuncioVenda_precoEnvio 
  ON AnuncioVenda (precoEnvio);
CREATE INDEX AnuncioVenda_propostaTrocar 
  ON AnuncioVenda (propostaTrocar);
CREATE INDEX RespostaAnuncio_resposta 
  ON RespostaAnuncio (resposta);
CREATE INDEX AnuncioCompra_id 
  ON AnuncioCompra (id);
CREATE INDEX CategoriaAnuncio_anuncio 
  ON CategoriaAnuncio (anuncio);
CREATE INDEX CategoriaAnuncio_categoria 
  ON CategoriaAnuncio (categoria);
CREATE INDEX TagAnuncio_anuncio 
  ON TagAnuncio (anuncio);
CREATE INDEX TagAnuncio_tag 
  ON TagAnuncio (tag);
CREATE INDEX ImagemAnuncio_anuncio 
  ON ImagemAnuncio (anuncio);
CREATE INDEX Anuncio_id 
  ON Anuncio (id);
CREATE INDEX Anuncio_titulo 
  ON Anuncio (titulo);
CREATE INDEX Anuncio_anunciante 
  ON Anuncio (anunciante);
CREATE INDEX CategoriaSeguida_username 
  ON CategoriaSeguida (username);
CREATE INDEX CategoriaSeguida_categoria 
  ON CategoriaSeguida (categoria);
CREATE INDEX UserSeguido_seguidor 
  ON UserSeguido (seguidor);
CREATE INDEX Mensagem_id 
  ON Mensagem (id);
CREATE INDEX Mensagem_emissor 
  ON Mensagem (emissor);
CREATE INDEX Mensagem_receptor 
  ON Mensagem (receptor);
CREATE INDEX UtilizadorRegistado_username 
  ON UtilizadorRegistado (username);
CREATE INDEX Categoria_nome 
  ON Categoria (nome);
INSERT INTO Sistema VALUES (1, 1, 1, 1, 1, 1) ;
