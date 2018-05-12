package model;

public class Cds extends Material {

	private int faixas;
	private String autores;

	public String toString() {
		return "Quantidade de faixas do CD: " + faixas + " Autor: " + autores + " Ano de publicação: "
				+ getAnoDePublicacao() + "Código material: " + getCodigo() + "Título do material: " + getTitulo();
	}

	public Cds(String codigo, String titulo, int anoDePublicacao, int faixas, String autores) {
		super(codigo, titulo, anoDePublicacao);
		this.faixas = faixas;
		this.autores = autores;
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

}
