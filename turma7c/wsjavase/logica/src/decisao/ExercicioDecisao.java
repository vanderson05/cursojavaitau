package decisao;

import javax.swing.JOptionPane;

class ExercicioDecisao{

public static void main(String args[]){

//=================================================================================================
//Solicitar o input dos dados: nome do produto, tipo do produto, valor e qtde
//Se o tipo do produto for "ALIMENTICIO", deverá colocar um desconto
//de 5%
//Se o tipo do produto for "TECNOLOGI", DEVERA COLOCAR ACRESCIMO DE 8%
//cALCULE O VALOR TOTAL
//SE A QTDE FOR MAIOS QUE 15, SOLICITE UM DESCONTO PARA O USUARIO E APLIQUE NO VALO R TOTAL
//=================================================================================================

String nomeProduto = JOptionPane.showInputDialog ("Entre com o Produto: ");
String tipoProduto = JOptionPane.showInputDialog ("Entre com o Tipo: ").toUpperCase();
Double valorProduto = Double.parseDouble(JOptionPane.showInputDialog ("Entre com o valor: "));
int qtdProduto = Integer.parseInt(JOptionPane.showInputDialog ("Entre com a QTD: "));


if(tipoProduto.equals("ALIMENTICIO")){

	if (qtdProduto <15){
		
	System.out.println("O valor total é: " + (valorProduto * qtdProduto)/100 * 0.05);
			  }
}
}


}


//short condicao = Short.parseShort(JOptionPane.showInputDialog ("Entre com 0 para Analfabeto ou 1 para Alfabetizado: "));
