package br.com.ecommerce.teste;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Produto objeto = new Produto();
		System.out.println(objeto);

		
		
		objeto.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: ")));
		objeto.setDescricao(JOptionPane.showInputDialog("Digite a Descricao: "));
		objeto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a QTDE: ")));
		objeto.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor de Compra: ")));
		objeto.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor de Venda: ")));
		
		JOptionPane.showMessageDialog(null,"ID:  " + objeto.getId() + "\nDescricao:  " + objeto.getDescricao() + "\nQuantidade:  " + objeto.getQtde()
		+ "\nValor de Compra:  " + objeto.getValorCompra() + "\nValor de Venda:  " + objeto.getValorVenda());
		
	}

}
