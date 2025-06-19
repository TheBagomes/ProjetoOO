package Servidores;

import entities.Cadastro;

public class Servidores extends Cadastro {
	
	String cargo;
	String Função;
	String matriculaInstitucional;
	
	public Servidores(){
		
		}

	public Servidores(String cargo, String função, String matriculaInstitucional) {
		this.cargo = cargo;
		Função = função;
		this.matriculaInstitucional = matriculaInstitucional;
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

	public String getMatriculaInstitucional() {
		return matriculaInstitucional;
	}

	public void setMatriculaInstitucional(String matriculaInstitucional) {
		this.matriculaInstitucional = matriculaInstitucional;
	}
	
	

}
