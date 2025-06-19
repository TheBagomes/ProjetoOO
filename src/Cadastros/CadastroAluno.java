package Cadastros;

import entities.Cadastro;

public class CadastroAluno extends Cadastro {
	
	private String curso; 
	private Integer semestreInicial; 
	
	public CadastroAluno() {
		super(); 
	}

	public CadastroAluno(String nome, String email, Integer numero, Integer senha, Integer matricula, String curso,
			Integer semestreInicial) {
		super(nome, email, numero, senha, matricula);
		this.curso = curso;
		this.semestreInicial = semestreInicial;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getSemestreInicial() {
		return semestreInicial;
	}

	public void setSemestreInicial(Integer semestreInicial) {
		this.semestreInicial = semestreInicial;
	}

	
	
}
