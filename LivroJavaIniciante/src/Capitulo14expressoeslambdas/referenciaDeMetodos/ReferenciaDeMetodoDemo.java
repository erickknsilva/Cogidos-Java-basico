package Capitulo14expressoeslambdas.referenciaDeMetodos;

public class ReferenciaDeMetodoDemo {

	static boolean numTest(IntPredicate p, int v) {
		return p.test(v);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean result;

		result = numTest(MyIntPredicate::isPrimo, 17);
		System.out.println("Verifica se o numero é Primo.");
		if (result) {
			System.out.println("17 eh primo.");
		}

		result = numTest(MyIntPredicate::isPar, 12);
		System.out.println("\nVerifica se o numero é Par.");
		if (result) {
			System.out.println("12 eh Par.");
		}

		System.out.println("\nVerifica se o numero é Positivo.");
		result = numTest(MyIntPredicate::isPositive, 11);
		if(result) {
			System.out.println("11 eh positivo.");
		}
		

	}
}
