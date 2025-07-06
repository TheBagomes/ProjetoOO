package Front;


import javax.swing.JOptionPane;

import entities.Servidor;
import Cadastros.CadastroServidores;

public class MenuServidor{

    private static String LerNome(){
         return JOptionPane.showInputDialog(message:"Informe o nome do(a) Servidor(a): ");

    }
    private static String lerEmail(){
        return JOptionPane.showInputDialog("Informe o Email do(a) Servidor(a): ");

    }
    private static String lerMatriculaServ(){
        return JOptionPane.showInputDialog("Informe a matricula do(a) Servidor(a): ");
    }

    private static String lerTelefone(){
        return JOptionPane.showInputDialog("Informe o telefone do(a) Servidor(a): ");

    }
    private static String lerSenha(){
        return JOptionPane.showInputDialog("Informe a senha: ");
    }
    private static String lerCargoSer(){
        return JOptionPane.showInputDialog("Informe o cargo do(a) Servidor(a): ");
    }
    private static String lerDepartamento(){
        return JOptionPane.showInputDialog("Informe o Departamento do(a) Servidor(a): ")
    }
    private static String lerfuncao(){
        return JOptionPane.showInputDialog("Informe a função do(a) Servidor(a): ")
    }


    public static Servidor dadosNovoServidor(){
        String nome = lerNome();
        String email = lerEmail();
        String telefone = lerTelefone();
        String senha = lerSenha();
        String cargo = lerCargoSer();
        String matricula = lerMatriculaServ();
        String departamento = lerDepartamento();
        String funcao = lerfuncao();
        return new Servidor(nome, email, telefone, senha, curso, matriculaServ, cargo, função, departamento); 
    }


    public static void frontServidor(CadastroServidores cadServidor){
        String texto = "=== Menu de Servidores === \n"
                    + "1 - Fazer cadastro\n"
                    + "2 - Pesquisar Servidor\n"
                    + "3 - Atualizar Servidor\n"
                    + "4 - Remover Servidor\n"
                    + "0 - Voltar para menu anterior";
        
        int escolha = -1;
        do{
            String strEscolha = JOptionPane.showInputDialog(texto);
            escolha = Integer.parseInt(strEscolha);

            switch (escolha){
                case 1:
                    Servidor novoServidor = dadosNovoServidor();
                    cadServidor.cadastroServidores((novoServidor));
                    break;

                case 2:
                    String matricula = lerMatriclaServ();
                    Servidor ok = cadServidor.pesquisarServidor(MatriclaServ);
                    if(ok != null){
                        JOptionPane.showMessageDialog(null, ok.toString());
                    }
                    break;

                case 3:
                    matricula = lerMatriculaServ();
                    Servidor novoCadastro = dadosNovoServidors();
                    boolean atualizado = cadServidor.atualizarServidor(matriculaServ, novoCadastro);
                    if(atualizado){
                        JOptionPane.showMessageDialog(null, "Cadastro do(a) Servidor(a) atualizado");
                    }
                    break;

                case 4:
                    matricula = lerMatriculaServ();
				Servidor remover = cadServidor.pesquisarServidor(matriculaServ);
				boolean removido = cadServidor.removerServidor(remover);
				if (removido) {
					JOptionPane.showMessageDialog(null, "Servidor(a) removido do cadastro");
					System.gc();
				}

			    default:
				    break;
                

            }

        } while (escolha != 0); 
        return;
    }
}