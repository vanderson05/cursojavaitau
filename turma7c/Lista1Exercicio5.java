import java.util.Scanner;

class Lista1Exercicio5{


public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o ano do seu nascimento: ");
int anoNascimento = teclado.nextInt();


System.out.println("Digite o ano atual: ");
int anoAtual = teclado.nextInt();

System.out.println("A idade eh:...... " + (anoAtual - anoNascimento));
System.out.println("Em 2050 terah:... " + (2050 - anoNascimento));

}

}