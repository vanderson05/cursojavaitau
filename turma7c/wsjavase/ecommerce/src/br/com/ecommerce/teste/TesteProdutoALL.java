package br.com.ecommerce.teste;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProdutoALL {

	
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static int i(String msg) {
		
		return Integer.parseInt(s(msg));
	}

	
	public static String s(String msg) {
		
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Produto produto = new Produto();
		produto.setALL(
				i("ID: "), 
				s("Descricao: "),
				i("qtde: "),
				f("valorCompra: "),
				f("valorVenda")
				
				);
		JOptionPane.showMessageDialog(null, produto.getALL());
	//	System.out.println(produto.getALL());

	}

}
