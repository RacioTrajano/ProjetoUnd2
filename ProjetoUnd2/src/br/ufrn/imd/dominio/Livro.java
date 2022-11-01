package br.ufrn.imd.dominio;


public class Livro extends ItemAcervo{
	
	public Livro () {

		
	}
	
	private String genero;
	private String isbn;
	//lembrar que são 13 digitos
	
	public String getGenero() {
		return genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}

