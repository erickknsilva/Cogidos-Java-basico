package estruturascontroles;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

	System.out.print("Insira a tabuada: ");
	int i = entrada.nextInt();
	System.out.print("Insira a tabuada: ");
	int l = entrada.nextInt();
	
	for (; i <= l; i ++) {
		System.out.println("\nTabuada do " + i);
	
	for (int j = 1; j <= l ; j++) {
		
		int tabuada = i * j;
		System.out.printf("%d x %d = %d\n", i, j, tabuada);
		
	
		entrada.close();
	}
	}
	
}
}
