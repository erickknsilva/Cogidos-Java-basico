package fundamentos.strings;

public class NotacaoPonto {
	public static void main(String[] args) {
		// as Strings nao faz parte dos codigos primitivos do java

		String a = "Bom dia x";
		a = a.replace("x", "erick");
		a = a.concat(" vai dormir"); // juntar String a outra string
		a = a.toUpperCase(); // deixa as letras em Maiusculo

		System.out.println(a);
		
	    String x = "erick".replace("erick", "erick nunes ").concat("silva").toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia x"
				.replace("x", "Erick")
				.toUpperCase();
		System.out.println(y);
		
		// tipos primitivos nao tem o operador "."

		
	}
}
