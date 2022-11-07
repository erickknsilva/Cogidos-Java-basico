package estruturascontroles;

import java.util.Scanner;

public class DesafioWHileMedia {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int qNota = 0;
	double nota = 0;
	double total = 0;
	
	
	System.out.print("Digite -1 para sair.\n");
	while (nota != -1) {
		System.out.printf ("Digite a média: ");
		nota = entrada.nextInt();
		
		if(nota >= 0 && nota <= 10) {
		qNota++;
		total = total + nota;
		
		}else if(nota < -2 || nota > 10) {
			System.out.println("Nota inválida");
		}
	}
	double media = total / qNota;
	System.out.println("\nMédia das nota = " + media);
	entrada.close();
}
	
}

