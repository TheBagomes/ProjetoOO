package Usuarios;

import java.util.Scanner; 

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
	            
		}while(escolha != 0);  
		
		
		
		sc.close();
	}
}
