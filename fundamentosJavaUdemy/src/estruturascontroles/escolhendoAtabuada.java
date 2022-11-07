package estruturascontroles;

import java.util.Scanner;

public class escolhendoAtabuada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i = 1;
		
		System.out.print("Tabuada do: ");
		int r = entrada.nextInt();
		
		System.out.print("até número: ");
		int n = entrada.nextInt();
		
		System.out.println("\nTabuada do " + r + " ao " + n);
		
		while(i <= n) {
			
			int t = r * i;
			System.out.println(r + " x " + i + " = " + t);
			i = i + 1;
		}
		entrada.close();
	}
}