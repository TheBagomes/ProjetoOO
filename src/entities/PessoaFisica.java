package entities;

public class PessoaFisica {

	private String nome; 
	private String email; 
	private Integer numero; 
	private Integer senha;
	private Integer matricula; 

	public PessoaFisica(String nome, String email, Integer numero, Integer senha, Integer matricula) {
		this.nome = nome;
		this.email = email;
		this.numero = numero;
		this.senha = senha;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	// Eu não posso ultilizar esse método para senha e matrícula pois são atributos que não podem ser modificados livremente 
	//cada "pessoa" deve ter a sua propria matricula e senha e isso não pode ser mudado. 
	
	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
}
