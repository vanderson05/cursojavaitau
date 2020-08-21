package decisao;

import javax.swing.JOptionPane;

class DecisaoComposta2{

public static void main (String args[]){

float saldo = Float.parseFloat(JOptionPane.showInputDialog ("Digite o saldo"));

// && => and (e) - obriga que as duas condições sejam verdadeiras
// || => or (ou) - quando uma das condições tem que ser verdadeira

if(saldo<0){
	System.out.println("Sua conta esta negativa");
}else if (saldo>=1000){
	System.out.println("Estah sobrando dinheiro");
}else 	{
	System.out.println("Sua conta e nomal");
}
{
System.out.println("Ate logo!");
}
}
}
