package Util;

import model.Material;
import model.Usuario;

public class Emprestimo extends Material {

	private Usuario usuario;
	private Material material;
	private String codigo;
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	private boolean disponivel;
	
	public Emprestimo(String codigo, String titulo, int anoDePublicacao) {
		super(codigo, titulo, anoDePublicacao);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	 

}
