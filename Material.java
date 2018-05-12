package model;

public class Material {

	private String codigo;
	private String titulo;
	private int anoDePublicacao;

	public String toString() {
		return "Codigo : " + codigo + " Título : " + titulo + "Ano de publicação :" + anoDePublicacao;
	}

	public Material(String codigo, String titulo, int anoDePublicacao) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

}