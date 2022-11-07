/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.classesGenericas1.limitandoClasseGenerica;

public class NumericDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Integer pode ser usado pq � uma subclasse de Number
		NumericsFns<Integer> iOb = new NumericsFns<Integer>(5);

		System.out.println("O reciproco de iOb is " + iOb.reciproco());

		System.out.println("Componente de fracao de iOb is " + iOb.fracao());
		System.out.println();

		// Double pode ser usado pq � uma subclasse de Number
		NumericsFns<Double> dOb = new NumericsFns<Double>(5.25);

		System.out.println("O reciproco de dOb is " + dOb.reciproco());
		System.out.println("Componente de fracao de dOb is " + dOb.fracao());

		// Erro! Numerics so aceita classe Number ou derivada de Number
		// NumericsFns<String> stOb = new NumericsFns<String>("erick");

		NumericsFns<Double> dOb2 = new NumericsFns<Double>(1.25);
		NumericsFns<Float> fOb2 = new NumericsFns<Float>((float) -1.25);
		
		
	}

}
