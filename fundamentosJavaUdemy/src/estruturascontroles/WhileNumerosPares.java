package estruturascontroles;

import java.util.Scanner;

public class WhileNumerosPares {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i = 1;
		
		while(i <= 100) {
			if(i % 2  == 0) {
			System.out.println("Numero par = " + i);
			}
			i = i + 1;
		entrada.close();
		}
	}
}

