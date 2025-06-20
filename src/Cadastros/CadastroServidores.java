package Cadastros;

import Servidores.Servidores;

public class CadastroServidores extends Servidores{
	
	String departamento; 
	
	public CadastroServidores(){
		
	}

	public CadastroServidores(String nome, String email, Integer numero, Integer senha, Integer matricula, String cargo,
			String função, String departamento) {
		super(nome, email, numero, senha, matricula, cargo, função);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
}
