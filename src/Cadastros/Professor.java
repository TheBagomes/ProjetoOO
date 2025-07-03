package Cadastros;

import entities.PessoaFisica;

public class Professor extends PessoaFisica{
	String curso; 
	String cargoAcademico;
	
	public Professor(String nome, String email, Integer numero, Integer senha, Integer matricula, String cargo,
			String função, String curso, String cargoAcademico) {
		super(nome, email, numero, senha, matricula);
		this.curso = curso;
		this.cargoAcademico = cargoAcademico;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCargoAcademico() {
		return cargoAcademico;
	}

	public void setCargoAcademico(String cargoAcademico) {
		this.cargoAcademico = cargoAcademico;
	}
	
	

}
