package Cadastros;

import entities.PessoaFisica;

public class Aluno extends PessoaFisica {
	
	private String curso; 
	private Integer semestreInicial; 

	public Aluno(String nome, String email, Integer numero, Integer senha, Integer matricula, String curso,
			Integer semestreInicial) {
		super(curso, curso, semestreInicial, semestreInicial, semestreInicial);
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
