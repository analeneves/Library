package model;
public class Graduando extends Usuario {

	public Graduando(String nomeDaPessoa, String cpfDaPessoa, String cargoOcupado) {
		super(nomeDaPessoa, cpfDaPessoa);
	}

	private int numMaxMaterial = 3;
	private int numMaxTempo = 1;

	public int getNumMaxMaterial() {
		return numMaxMaterial;
	}

	public void setNumMaxMaterial(int numMaxMaterial) {
		this.numMaxMaterial = numMaxMaterial;
	}

	public int getNumMaxTempo() {
		return numMaxTempo;
	}

	public void setNumMaxTempo(int numMaxTempo) {
		this.numMaxTempo = numMaxTempo;
	}

}
