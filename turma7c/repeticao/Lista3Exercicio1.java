import javax.swing.JOptionPane;

 

class Lista3Exercicio1{

 

public static void main(String args[]){

 

short idade=0;
char sexo=0;
char experiencia=0;
int contMN =0;
int contMS =0;
int contFN =0;
int contFS =0;
do{
    idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade:"));
    if (idade>0){
        sexo = JOptionPane.showInputDialog("Digite M ou F").toUpperCase().charAt(0);
        while(sexo!='M' && sexo!='F'){
            sexo = JOptionPane.showInputDialog("Digite somente M ou F").toUpperCase().charAt(0);
        }
        experiencia = JOptionPane.showInputDialog("Digite S ou N").toUpperCase().charAt(0);

 

        while(experiencia!='S' && experiencia!='N'){
            experiencia = JOptionPane.showInputDialog("Digite somente N ou S").toUpperCase().charAt(0);
        }

 

        if (sexo=='M'){
            if (experiencia=='S'){
                contMS++;
            }else if(experiencia=='N'){
                contMN++;
            }
 }else if (sexo=='F'){
            if (experiencia=='S'){
                contFS++;
            }else if(experiencia=='N'){
                contFN++;    
            }
        }
    }
}while(idade!=0);
System.out.println("Masculino com experiência: " + contMS);
System.out.println("Masculino sem experiência: " + contMN);
System.out.println("Feminino com experiência: " + contFS);
System.out.println("Feminino sem experiência: " + contFN);
}

 

}