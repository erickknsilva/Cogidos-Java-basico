package estruturascontroles;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		for(int i=1; i <= 10; i = 1 + i) {
			System.out.println();
			
		for(int n = 1; n <= 10; n++) {
			int t = n * i;
			System.out.println( i + " x " + n + " = " + t);
			
		}
			entrada.close();
		}
	}
}


