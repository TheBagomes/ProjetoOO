package Default;

import java.util.Scanner;

import Cadastros.Aluno;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int escolha = 0;

		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1. Cadastrar Aluno");
			System.out.println("2. Cadastrar Professor");
			System.out.println("3. Cadastrar Técnico");
			System.out.println("4. Cadastrar Espaço Físico");
			System.out.println("5. Agendar Espaço");
			System.out.println("6. Ver Disponibilidade");
			System.out.println("7. Exportar Histórico (por usuário)");
			System.out.println("0. Sair");
			System.out.println("Escolha: ");
			escolha = sc.nextInt();
			
			sc.close();

		} while (escolha != 0);

		
	}

	private void cadastrarAluno(Scanner sc) {
		System.out.println("=== Cadastro de Aluno ===");
		System.out.print("Nome completo: ");
	    String nome = sc.nextLine();
	    System.out.print("Email institucional: ");
	    String email = sc.nextLine();
	    System.out.print("Telefone: ");
	    int tel = sc.nextInt();
	    System.out.print("Senha: ");
	    int senha = sc.nextInt();
	    System.out.print("Curso: ");
	    String curso = sc.nextLine();
	    System.out.print("Número de matrícula: ");
	    int matricula = sc.nextInt();
	    System.out.print("Semestre: ");
	    int semestre = Integer.parseInt(sc.nextLine());

	    Aluno aluno = new Aluno(nome, email, tel, senha, matricula, curso, semestre);
	    System.out.println("Aluno cadastrado com sucesso");

	}
	
}
