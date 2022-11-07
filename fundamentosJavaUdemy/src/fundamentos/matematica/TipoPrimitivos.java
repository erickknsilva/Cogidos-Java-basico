package fundamentos.matematica;

public class TipoPrimitivos {
	public static void main(String[] args) {
		// informa�oes dos funcionarios

		// tipos numericos inteiro
		byte anosdeempresa = 23;
		short numerodevoos = 542;
		int id = 56789;
		long pontosacumulados = 3134845223L;

		// tipos numericos reais
		float salario = 11_445.44f;
		double vendasacumuladas = 2991797103.01;

		// tipo boolean = Verdadeiro ou falso
		boolean estadeferias = true; // false
		// tipo charactere s� pode ser representado por uma letra ou um numero de 1 a 9.
		char status = 'a';
		
		// dias de empresa
		System.out.println(anosdeempresa * 365);
		// numero de viagens
		System.out.println(numerodevoos / 2);
		// pontos por real
		System.out.println(pontosacumulados / vendasacumuladas );
		
		// quanto ganha
		System.out.println(id  + " = ganha " + salario);
		// est� de ferias ?
		System.out.println("Ferias ? " + estadeferias + " = Sim");
		System.out.println("status: " + status);
		
		

	}
}
