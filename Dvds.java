package model;

public class Dvds extends Material {

	public String autores;
	public String regiao;

	public String toString() {
		return "Autores: " + autores + " Região: " +regiao ;
	}
	
	public Dvds(String codigo, String titulo, int anoDePublicacao, String autores, String regiao) {
		super(codigo, titulo, anoDePublicacao);
		this.autores = autores;
		this.regiao = regiao;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

}
