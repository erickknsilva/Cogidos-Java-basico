package fundamentos.strings;

import java.util.Scanner;

import javax.print.StreamPrintServiceFactory;

public class Console {
public static void main(String[] args) {
	
	System.out.print("Bom ");
		System.out.print("dia \n");
	
	System.out.println("Bom ");
	System.out.println("dia!");
	
	System.out.printf("Nome: %s \n", "Erick Nunes da Silva");
	System.out.printf("Salario: %.2f \n", 3500.00);
	System.out.printf("Mega sena: %d, %d, %d, %d, %d\n", 1, 2, 3, 4, 5);
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("digite seu nome: ");
	String nome = entrada.nextLine().toUpperCase();
	System.out.println("digite seu sobrenome: ");
	String sobrenome = entrada.nextLine().toUpperCase();
	System.out.println("digite sua idade: ");
	int idade = entrada.nextInt();
	System.out.printf("%s %s, tem %d anos.", nome, sobrenome, idade);
	
	
	
}
}
