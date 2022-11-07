package Capitulo14expressoeslambdas.referenciaDeMetodos;

public class MyIntPredicate {

	// Metodo estatico que retorna true quando o numero é primo
	static boolean isPrimo(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i < n / i; i++) {
			if ((n % 2) == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isPar(int n) {
		return (n % 2) == 0;
	}

	static boolean isPositive(int n) {
		return n > 0;
	}

}
