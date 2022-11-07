/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.classesGenericas1.limitandoClasseGenerica;

//Limita a classe NumericsFns para poder receber classe de Tipo Number ou ela mesmo
public class NumericsFns<T extends Number> {

	T obj1;

	public NumericsFns(T obj1) {
		this.obj1 = obj1;
	}

	T getObj1() {
		return obj1;
	}

	// retorna um reciproco
	double reciproco() {
		return 1 / obj1.doubleValue();
	}

	double fracao() {
		return obj1.doubleValue() - obj1.intValue();
	}

	// determina se os valores absolutos de dois objetos sao iguais
	boolean absEquals(NumericsFns<?> ob) {
		if (Math.abs(obj1.doubleValue()) == Math.abs(ob.obj1.doubleValue())) {
			return true;
		}
		return false;
	}
	
	

}
