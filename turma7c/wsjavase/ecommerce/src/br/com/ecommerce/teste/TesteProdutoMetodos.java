package br.com.ecommerce.teste;

import br.com.ecommerce.modelo.Produto;

public class TesteProdutoMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Produto p = new Produto();
	p.setId(1);
	p.setDescricao("CHURROS");
	p.setQtde(10);
	p.setValorVenda(8);
	p.setValorCompra(5);
	System.out.println("Com Desconto: " + p.getDesconto());
	System.out.println("Com Desconto: " + p.getTotalVenda());
	System.out.println("Com Desconto: " + p.getPromocao(2));
	p.setEstoque(20);
	System.out.println("Estoque atualizado: " + p.getQtde());
	System.out.println("desconto Personalizado" + p.getDesconto(20));
	p.setAtualizarValores(-5);
	System.out.println("Venda atualizado: " + p.getValorVenda());
	System.out.println("Venda atualizado: " + p.getValorCompra());

	}

}
