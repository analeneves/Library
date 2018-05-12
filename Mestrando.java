package model;

import java.util.ArrayList;

public class Mestrando extends Usuario {
	public Mestrando(String nomeDaPessoa, String cpfDaPessoa, String cargoOcupado) {
		super(nomeDaPessoa, cpfDaPessoa);
	}

	private int numMaxMaterial = 4;
	private int numMaxTempo = 2;

	ArrayList<Material> emprestimoMateriais = new ArrayList<>();

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

	public ArrayList<Material> getEmprestimoMateriais() {
		return emprestimoMateriais;
	}

	public void setEmprestimoMateriais(ArrayList<Material> emprestimoMateriais) {
		this.emprestimoMateriais = emprestimoMateriais;
	}

}
