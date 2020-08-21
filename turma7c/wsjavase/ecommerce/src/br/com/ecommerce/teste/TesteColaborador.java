package br.com.ecommerce.teste;

import br.com.ecommerce.atalhos.Magica;
import br.com.ecommerce.modelo.Colaborador;

public class TesteColaborador {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Colaborador funcionario =  new Colaborador(
				Magica.i("ID"),
				Magica.s("Nome: "),
				Magica.s("Email"),
				Magica.s("Fone"),
				Magica.s("Cargo"),
				Magica.s("Nascimento"),
				Magica.f("Salario")
				
				
				);
		System.out.println(funcionario.getALL());
	}

}
