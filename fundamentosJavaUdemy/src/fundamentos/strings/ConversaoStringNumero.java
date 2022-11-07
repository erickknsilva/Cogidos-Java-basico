package fundamentos.strings;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.print(d);
		System.out.println("\n");

		System.out.printf(" %s,\n %s,\n %s,\n %s", "Erick nunes da silva", "tenho 22 anos",
				"estudo analise de sistemas", "a duração é de 2,5");

		System.out.printf("%s\n%s\n", " Bem vindo ao ", " java programing\n");

		// udemy
		String a = JOptionPane.showInputDialog("digite um numero: ");
		System.out.println(a);
		String b = JOptionPane.showInputDialog("Digite outro numero:  ");
		System.out.println(b);
		int c = Integer.parseInt(a);
		int x = Integer.parseInt(b);
		int soma = c + x;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
		
		// Livro
		int n1, n2, sm;
		//int n2;
		//int sm;

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		n1 = input.nextInt();
		System.out.print("Digite o segundo: ");
		n2 = input.nextInt();
		//sm = n1 + n2;

		System.out.printf("A soma é: %s\n",(n1 + n2) );
		//System.out.printf("A soma é %s\n", sm);
input.close();
	}
}
