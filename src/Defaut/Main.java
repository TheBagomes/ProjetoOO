package Defaut;

import javax.swing.JOptionPane;

import Cadastros.CadastroAluno;
import Cadastros.CadastroProfessor;
import Cadastros.CadastroServidores;
import Front.MenuAluno;
import Front.MenuPadrao;
import Front.MenuProfessor;

public class Main {
    static CadastroAluno cadAluno;
    static CadastroProfessor cadastroProfessor;
    static CadastroServidores da;
	
	public static void main(String[] args) {
		cadAluno = new CadastroAluno();
		
		int escolha = 0; 
		
		do {
			escolha = MenuPadrao.menuOpcoes(); 
			switch (escolha) {
				case 1: 
					MenuAluno.frontAluno(cadAluno); 
				break;
				case 2: 
                    MenuProfessor.frontProfessor(cadastroProfessor);
				break;
				case 3: 
					JOptionPane.showMessageDialog(null, "Cadastro de disciplinas a ser implementado");
				break;
				case 4: 
					JOptionPane.showMessageDialog(null, "Cadastro de turmas a ser implementado");
				break;
				case 0: 
				break;
				default: 
					JOptionPane.showMessageDialog(null, "Opcao invalida");
					escolha = -1;
				break;
			}
		} while (escolha != 0);
		return;
	}

}
