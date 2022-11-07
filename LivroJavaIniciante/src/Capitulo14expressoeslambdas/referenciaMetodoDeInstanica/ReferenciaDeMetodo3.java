package Capitulo14expressoeslambdas.referenciaMetodoDeInstanica;

public class ReferenciaDeMetodo3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		boolean result;

		MyIntNum num1 = new MyIntNum(12);
		MyIntNum num2 = new MyIntNum(16);

		// esta instrucao faz o inp referenciar o metodo de
		// instancia isFactor()
		MyIntNumPredicate inp = MyIntNum::isFactor;// referencia de metodo para qualquer objeto de tipo MyIntNum

		// A instrucao a seguir chama isFactor() em myNum2
		result = inp.test(num1, 3);
		if (result) {
			System.out.println("3 eh fator de " + num1.getV());
		}

		result = inp.test(num2, 3);
		if (!result) {
			System.out.println("\n3 nao eh fator de " + num2.getV());
		}
		
		
		
	}
}
