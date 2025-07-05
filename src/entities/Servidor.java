package entities;


public class Servidor extends PessoaFisica{
	String matriculaServ;
	String cargo;
	String departamento; 

	public Servidor(String nome, String email, String telefone, String senha, String matriculaServ,  String cargo,
			String função, String departamento) {
		super(nome, email, telefone, senha);
		this.matriculaServ = matriculaServ;
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public String getMatriculaServ(){
		return matriculaServ;
	}

	public String getCargo() {
		return cargo;
	}

	public void setcargo(String cargo) {
		this.cargo = cargo;
	}


	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	protected void destruidor(){
		System.out.println("Destruindo Objeto: " + this);
	}

	public String armzString(){
		String resposta = super.toString();
		resposta += "CURSO OU FUNÇÃO " + cargo + '\n';
		resposta += "CARGO ACADEMICO " + departamento + '\n';
		return resposta;
	}
}
