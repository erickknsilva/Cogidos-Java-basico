package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {

		double media = 7;
		String resultadoFinal = media >= 7.0 ? "aprovado" : media >= 5.5 ? 
				"recuperacao " : "reprovado";
		
		System.out.println("O aluno foi: " + resultadoFinal);
	}
}

// String resultadoParcial = media >= 5.5 ? "recupera�ao " : "reprovado"; 