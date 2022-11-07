package estruturascontroles;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		
		String diz = "";
		
		while(!diz.equalsIgnoreCase("sair")) {
			System.out.print("Voce diz: ");
			diz = entrada.nextLine(); 
		/*se usar next(); ele repete a palavra "voce diz" pela
		 * quantidade de espaçamento que voce da entre as palavras
		 * tipo "Bom dia" ele vai repetir "voce diz" 2x na proxima linha
		 * outro exemplo "Bom dia, Tudo bem ?" vai repetir "voce diz"
		 * 4x na proxima linha, por causa da quantidade de espaçamento
		 * definida pelo next(); porque ele pega o espa�o em
		 * branco = espaçamento.
		 * o nextLine() elimina o espa�amento em branco, por isso nao repete.
		*/
		}
		entrada.close();
	}
}
