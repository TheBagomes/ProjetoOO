package entities;

import java.util.List;

public abstract class EspacoFisico {
	private String nome;
	private int capacidade;
	private String localizacao;
	private List<String> equipamentos;
	
	public abstract String getTipo();
	
	//Construtores
	
	public EspacoFisico() {
		
	}
	
	public EspacoFisico(String nome, int capacidade, String localizacao, List<String> equipamentos) {
		this.nome = nome;
		this.capacidade = capacidade;
		this.localizacao = localizacao;
		this.equipamentos = equipamentos;
	}
	
	//Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public List<String> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<String> equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	
}
