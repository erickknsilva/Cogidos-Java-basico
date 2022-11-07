package fundamentos.operadores;

import java.util.Scanner;

public class Relacionais {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = 97;
		int b = 'a';

		System.out.println(a == b); // comparaçao ve se é igual
		System.out.println(30 != 7); // diferente
		System.out.println(3 > 4); // maior que
		System.out.println(3 >= 3); // maior ou igual
		System.out.println(3 < 7); // menor que
		System.out.println(30 <= 7); // menor ou igual

		double nota = 7.5;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;

		System.out.println("tem desconto ? " + temDesconto);
		input.close();
	}
}
