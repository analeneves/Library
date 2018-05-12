package model;

public class Usuario {
	private String nomeDaPessoa;
	private String cpfDaPessoa;

	public String toString() {
		return "Nome: " + nomeDaPessoa + " CPF: " + cpfDaPessoa;
	}

	public Usuario() {

	}

	public Usuario(String nomeDaPessoa, String cpfDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
		this.cpfDaPessoa = cpfDaPessoa;
	}

	public String getNomeDaPessoa() {
		return nomeDaPessoa;
	}

	public void setNomeDaPessoa(String nomeDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
	}

	public String getCpfDaPessoa() {
		return cpfDaPessoa;
	}

	public void setCpfDaPessoa(String cpfDaPessoa) {
		this.cpfDaPessoa = cpfDaPessoa;
	}

	public void definirNome(String valor) {
		nomeDaPessoa = valor;
	}

	public void definirCpf(String valor) {
		cpfDaPessoa = valor;
	}

}