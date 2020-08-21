import java.util.Scanner;

class VendaProduto{

public static void main(String args[]){

//++++++++++++++SOLICITANDO INFORMAÇÕES++++++++++++++++++++++++++
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite o nome do produto: ");
	String nomeProduto = sc.next();

	System.out.println("Informe Quantidade: ");
	int qtdProduto = sc.nextInt();

	System.out.println("Informe o Valor Unitario do Produto: ");
	double valorUnitario = sc.nextDouble();

//+++++++++++++++++++SAIDA+++++++++++++++++++++++++++++

	double valorTotal = valorUnitario * qtdProduto;
	double desconto = valorTotal * 0.9; 	

	System.out.println("Nome Produto................: " + nomeProduto);
	System.out.println("Valor Unitario do Produto eh: " + valorUnitario);
	System.out.println("Total.......................: " + valorTotal);
	System.out.println("Total com desconto de 10%...: " + desconto);
	
}
}
//Solicitem:
//Nome do Produto
//Qtde
//Valor unitario

//Exibam
//Nome do produto
//Total
//Total com Desconto de 10%