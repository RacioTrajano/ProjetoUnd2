package br.ufrn.imd.dominio;



public class ItemAcervo {
	
	public ItemAcervo () {
		
	}
	
	private int id;
	private int qtdCopias;
	private int qtdPaginas;
	private int ano;
	private int edicao;
	private String editora;
	private String autor;
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtdCopias() {
		return qtdCopias;
	}
	public void setQtdCopias(int qtdCopias) {
		this.qtdCopias = qtdCopias;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
    
    //rentAcervo
    //devAcervo
    
    
}
