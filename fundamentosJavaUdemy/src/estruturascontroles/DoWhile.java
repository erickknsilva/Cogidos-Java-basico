package estruturascontroles;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Digite as palavras magicas...");
			System.out.print("para sair: ");
			texto = entrada.nextLine().toLowerCase();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		entrada.close();
	}
}
