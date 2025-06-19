package Cadastros;

import Servidores.Servidores;

public class CadastroServidores extends Servidores{
	
	String cargo;
	String departamento; 
	
	public CadastroServidores(){
		
	}

	public CadastroServidores(String cargo, String departamento) {
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
}
