package entities;

import java.util.List;

public abstract class EspacoFisico {
	private String nome;
	private int capacidade;
	private String localizacao;
	private List<String> equipamentos;
	
	public abstract String getTipo();
	
	public EspacoFisico(String nome, int capacidade, String localizacao, List<String> equipamentos) {
		this.nome = nome;
		this.capacidade = capacidade;
		this.localizacao = localizacao;
		this.equipamentos = equipamentos;
	}
	
	//Getters

	public String getNome() {
		return nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public List<String> getEquipamentos() {
		return equipamentos;
	}
	
	//para o relatorio que deve ser "impresso" no final
	
	@Override
    public String toString() {
        return String.format("[%s] %s - Capacidade: %d, Local: %s",
                             getTipo(), nome, capacidade, localizacao);
    }
	
}
