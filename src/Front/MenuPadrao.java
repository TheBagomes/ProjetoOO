package Front;

import javax.swing.JOptionPane;

public class MenuPadrao {
    public static int menuOpcoes() {
		String opcoes = "1 - Abrir Menu aluno \n"
				      + "2 - Abrir Menu Professor \n"
				      + "4 - Abrir cadastro de turmas \n"
				      + "0 - Sair";
	
		String strOpcao = JOptionPane.showInputDialog(opcoes);
		int opcao = Integer.parseInt(strOpcao);
	
		return opcao;
	}
}
