import javax.swing.JOptionPane;

class DecisaoEncadeada{

public static void main (String args[]){

String nome = JOptionPane.showInputDialog ("Entre com o nome do aluno:");
short falta = Short.parseShort(JOptionPane.showInputDialog ("Entre com a quantidade de faltas: "));

if (falta>20){
	System.out.println("Voce Reprovou por Faltas: " + falta);
}else{

Float nota1 = Float.parseFloat(JOptionPane.showInputDialog ("Entre com a primeira nota:"));
Float nota2 = Float.parseFloat(JOptionPane.showInputDialog ("Entre com a segunda nota:"));


float media = (nota1 + nota2) / 2;

if( media>=5){ 
System.out.println("Nome do aluno: " + nome + "\nAprovado" + "\nmedia eh: " + media + "\nQTD de Faltas: " + falta);
} else  if( media>=3  && media<5){
	System.out.println("Nome do aluno: " + nome + "\nExame:" +  "\nmedia eh: " + media + "\nQTD de Faltas: " + falta);
} else {
 	System.out.println("Nome do aluno: " + nome + "\nReprovado:" +  "\nmedia eh: " + media + "\nQTD de Faltas: " + falta);
}
}

}
}
