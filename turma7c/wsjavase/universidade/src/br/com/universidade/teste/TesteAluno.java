package br.com.universidade.teste;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;


public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String nome ="teste";
		//Scanner teclado = new Scanner();
		
		Aluno objeto = new Aluno();
		System.out.println(objeto); //instancia objeto
		
		objeto.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		objeto.setEmail(JOptionPane.showInputDialog("Digite o Email: "));
		objeto.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite a RM: ")));
		//System.out.println(objeto.retornarNome());
		
		JOptionPane.showMessageDialog(null,"Nome:  " + objeto.getNome() + "\nEmail:  " + objeto.getEmail() + "\nRM:  " + objeto.getRm());
//		JOptionPane.showMessageDialog(null,objeto.retornarEmail());
	//	JOptionPane.showMessageDialog(null,objeto.retornarRm());
	}

}
