package Servidores;

import entities.Cadastro;

public class Servidores extends Cadastro {
	
	String cargo;
	String Função;
	
	public Servidores(){
		
		}

	public Servidores(String nome, String email, Integer numero, Integer senha, Integer matricula, String cargo,
			String função) {
		super(nome, email, numero, senha, matricula);
		this.cargo = cargo;
		Função = função;
	}



	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFunção() {
		return Função;
	}

	public void setFunção(String função) {
		Função = função;
	}

}
