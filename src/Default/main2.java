package Default;
import java.util.Scanner;
import Cadastros.Aluno;
import entities.PessoaFisica;

public class main2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sair = false;
		int escolha = 0;

		while(!sair){
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

            /*try {
                switch (op) {
                    case 1 -> Usuarios.CadastroAluno(sc);
                }
            }*/
				
			if(escolha == 1){
				System.out.println("=== Cadastro de Aluno ===");
    			String x = sc.nextLine();
    			System.out.println("Nome completo: ");
    			String nome = sc.nextLine();
    			System.out.println("Email institucional: ");
    			String email = sc.nextLine();
    			System.out.println("Telefone: ");
    			int numero = sc.nextInt();
    			System.out.println("Senha: ");
    			int senha = sc.nextInt();
    			String y = sc.nextLine();
    			System.out.println("Curso: ");
    			String curso = sc.nextLine();
    			System.out.println("Número de matrícula: ");
    			int matricula = sc.nextInt();
    			System.out.println("Semestre inicial: ");
    			int semestre = sc.nextInt();
    			
    			Aluno aluno = new Aluno(nome, email, numero, senha, matricula, curso, semestre);
    
    			System.out.println("Aluno cadastrado com sucesso");
    			System.out.println(aluno.getNome());
    			System.out.println(aluno.getNumero());
    			
				sc.close();
			}
			
            sc.close();
        }
    }
}