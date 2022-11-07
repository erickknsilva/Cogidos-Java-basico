package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//ler numero 1
		// ler numero 2
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe o numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("informe o numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("informe a operação: ");
		String op = entrada.next();
		
		System.out.printf("%f %s %f = ?", num1, op, num2);
		
		
		
		entrada.close();
	}
}
