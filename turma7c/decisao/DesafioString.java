import javax.swing.JOptionPane;

class DesafioString{

public static void main (String args[]){

String email = JOptionPane.showInputDialog("Digite seu email: ").toLowerCase();

if(email.indexOf("@")>0){

	System.out.println("Login: " + email.substring(0, email.indexOf("@")));
	System.out.println("Login: " + email.substring(email.indexOf("@")+1));
	

}
}
}