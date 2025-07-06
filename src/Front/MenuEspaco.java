package Front;

import java.util.List;

import javax.swing.JOptionPane;
import entities.EspacoFisico;

public class MenuEspaco extends EspacoFisico{
	
	public MenuEspaco(String nome, int capacidade, String localizacao, List<String> equipamentos) {
		super(nome, capacidade, localizacao, equipamentos);
	
	}

	private static String setNome() {
		 return JOptionPane.showInputDialog("Informe o nome do Espaço: ");
	}
	
	private static Integer setCapacidade() {
		 return JOptionPane.showInputDialog("Informe a quantidade de Pessoas: ");
	}
	
	private static String setLocalizacao() {
		 return JOptionPane.showInputDialog("Informe a Localização: ");
	}
	
	private static String setEquipamentos() {
		 return JOptionPane.showInputDialog("Informe os Equipamentos: ");
	}
	
	public static EspacoFisico dadosEspaco() {
		
		String nome = setNome(); 
		Integer capacidade = setCapacidade(); 
		String localizacao = setLocalizacao(); 
		String equipamentos = setEquipamentos();
		
		return new EspacoFisico(nome, capacidade, localizacao, equipamentos); 
		
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}