package fundamentos.operadores;

import java.util.Scanner;

public class ComparacaoString {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // comparar string
		
		Scanner entrada = new Scanner(System.in);
		
		String a = entrada.next();
		System.out.println(s);
		System.out.println("2" == s.trim());
		System.out.println("2".equals(s.trim()));
		
		
		entrada.close();
	}
}
