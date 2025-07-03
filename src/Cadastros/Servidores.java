package Cadastros;

import entities.PessoaFisica;

public class Servidores extends PessoaFisica{
	String cargo;
	String função;
	String departamento; 

	public Servidores(String nome, String email, Integer numero, Integer senha, Integer matricula, String cargo,
			String função, String departamento) {
		super(nome, email, numero, senha, matricula);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
}
