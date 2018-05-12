package model;

public class Revistas extends Material {

	public int edicao;
	public int mesDePublicacao;

	public String toString() {
		return "Edição da revista : " + edicao + " Mês de publicação da revista : " + mesDePublicacao
				+ " Ano de publicação da revista : " + getAnoDePublicacao() + "Código material : " + getCodigo()
				+ "Título do material : " + getTitulo();
	}

	public Revistas(String codigo, String titulo, int anoDePublicacao, int edicao, int mesDePublicacao) {
		super(codigo, titulo, anoDePublicacao);
		this.edicao = edicao;
		this.mesDePublicacao = mesDePublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getMesDePublicacao() {
		return mesDePublicacao;
	}

	public void setMesDePublicacao(int mesDePublicacao) {
		this.mesDePublicacao = mesDePublicacao;
	}

}
