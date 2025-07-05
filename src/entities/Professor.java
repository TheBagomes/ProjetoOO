package entities;


public class Professor extends PessoaFisica{
	String matriculaProf;
	String curso; 
	String cargoAcademico;
	
	public Professor(String nome, String email, String telefone, String senha, String matriculaProf, String curso, String cargoAcademico) {
		super(nome, email, telefone, senha /*matricula*/);
		this.matriculaProf = matriculaProf;
		this.curso = curso;
		this.cargoAcademico = cargoAcademico;
	}


	public String getMatriculaProf() {
		return matriculaProf;
	}

	public void setMatriculaPraf(String matriculaProf) {
		this.matriculaProf = matriculaProf;
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

	protected void destruidor(){
		System.out.println("Destruindo Objeto: " + this);
	}

	public String armzString(){
		String resposta = super.toString();
		resposta += "CURSO " + curso + '\n';
		resposta += "CARGO ACADEMICO " + cargoAcademico + '\n';
		return resposta;
	}


	
	

}
