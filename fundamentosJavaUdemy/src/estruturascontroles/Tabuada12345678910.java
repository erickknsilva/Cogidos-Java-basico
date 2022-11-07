package estruturascontroles;

import java.util.Scanner;

public class Tabuada12345678910 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
		System.out.println("Tabuada inicial: ");
		for(int a = 1; a <= 10; a++) {
			System.out.println("\ntabuada do " + a );
			
		for(int i = 1; i <= 10; i++) {
			int t = a * i;
			System.out.println(a + " x " + i + " = " + t);
		}
		}
		entrada.close();
}
}
