package fundamentos.strings;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o primero salario: ");
	String primeiro = input.nextLine().replace(",", ".");
	System.out.println("Digite o segundo salario: ");
	String segundo = input.nextLine().replace(",", ".");
	System.out.println("Digite o terceiro salario: ");
	String terceiro = input.nextLine().replace(",", ".");
	
	double a = Double.parseDouble(primeiro);
	double b = Double.parseDouble(segundo);
	double c = Double.parseDouble(terceiro);
	double media = ((a + b + c) / 3);
	System.out.println("a media é " + media);
	
	input.close();
		 
}
}
