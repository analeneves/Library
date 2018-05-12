package model;

import java.util.ArrayList;

public class Professores extends Usuario {

	public Professores(String nomeDaPessoa, String cpfDaPessoa, String cargoOcupado) {
		super(nomeDaPessoa, cpfDaPessoa);
	}

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

	private int numMaxMaterial = 5;
	private int numMaxTempo = 4;

	ArrayList<Material> emprestimoMateriais = new ArrayList<>();

}
