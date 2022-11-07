package estruturascontroles;

import java.util.Scanner;

public class ForTabuada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
		int tb = entrada.nextInt();

		System.out.println("\nTabuada do " + tb);
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			int t = tb * i;
			System.out.println(tb + " x " + i + " = " + t);
		}
		entrada.close();
	}
}
