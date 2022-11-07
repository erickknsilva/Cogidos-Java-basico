package Capitulo14expressoeslambdas.referenciaMetodoDeInstanica;

public class ReferenciaDeMetodo2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean result;

		// criar dois objeto de MyIntNum
		MyIntNum num1 = new MyIntNum(12);
		MyIntNum num2 = new MyIntNum(16);

		// cria uma referencia ao metodo isFactor
		// em num e armazena essa referencia a
		// uma variavel da INTERFACE IntPredicate
		IntPredicate ip = num1::isFactor;// referencia a um metodo de instacia

		// agora, ela é usada para chamar isFactor(), via test()
		result = ip.test(3);

		if (result) {
			System.out.println("3 é fator de " + num1.getV());
		}

		ip = num2::isFactor;
		result = ip.test(3);

		if (!result) {
			System.out.println("3 nao eh fator de " + num2.getV());
		}

	}
}
