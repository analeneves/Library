package model;

public class Livros extends Material {

	private String editora;
	private String autores;
	private String edicao;

	public String toString() {
		return "Editora do livro : " + editora + " Autor do livro : " + autores + "Edição do livro:" + edicao
				+ " Ano de publicação : " + getAnoDePublicacao() + "Código material : " + getCodigo()
				+ "Título do material : " + getTitulo();
	}

	public Livros(String codigo, String titulo, int anoDePublicacao, String editora, String autores, String edicao) {
		super(codigo, titulo, anoDePublicacao);
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

}
