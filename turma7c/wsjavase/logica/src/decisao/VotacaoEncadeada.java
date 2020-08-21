package decisao;

import javax.swing.JOptionPane;

class VotacaoEncadeada{

public static void main(String args[]){


String nome = JOptionPane.showInputDialog ("Entre com o nome: ");
short condicao = Short.parseShort(JOptionPane.showInputDialog ("Entre com 0 para Analfabeto ou 1 para Alfabetizado: "));

if(condicao == 0){
	System.out.println("Analfabeto, Não passivo de votacao!");
}else{


int idade = Integer.parseInt(JOptionPane.showInputDialog ("informe a sua idade: "));

if (idade < 16){
	System.out.println("nome: " + nome + "\nVoce nao tem idade para votar!");
}

else if (idade >= 16 && idade < 18 || idade >=70){
	System.out.println("nome: " + nome + "\nFacultativo a Votacao!");
}	
	else{
	System.out.println("nome: " + nome +"\nEh Obrigatorio a votar!");
	    }

}
}


}