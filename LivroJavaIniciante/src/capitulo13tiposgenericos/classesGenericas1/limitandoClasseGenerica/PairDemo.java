package capitulo13tiposgenericos.classesGenericas1.limitandoClasseGenerica;

public class PairDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Pair<Integer, Integer> x = new Pair<Integer, Integer>(5, 25);

		System.out.println("T Value: " + x.getFirts() //
				+ "\nV Value: " + x.getSecond());

		Pair<Number, Integer> y = new Pair<Number, Integer>(10.4, 12);
		System.out.println("\nT Value: " + y.getFirts() //
				+ "\nV Value: " + y.getSecond());

		System.out.println("\nInvalidos nao sao do mesmo tipo");
//		Pair<Number, String> z = new Pair<Number, String>(10.4, "12");

	}

}
