/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.usandoCuringas2;

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

    /**
     * Aqui o parametro de tipo T nao pode ser usado, por que, ele so pode ser
     * comparado com parametro do mesmo tipo ex: Integer e Integer. Parametros
     * de tipos diferente causa erro de compilacao ex: Integer e Double Portanto
     * essa abordagem NAO cria uma solucao generica para usar o absEquals.
     *
     * boolean absEquals(NumericsFns<T> ob) { //teste
     * (Math.abs(obj1.doubleValue()) == * Math.abs(ob.obj1.doubleValue())) {
     * return true; } return false; } /
     *
     * /*
     * Para criar um metodo absEquals generico que aborde todos os tipos de
     * parametro deve-se usar o argumento curinga(?). O argumento curinga eh
     * especificado pelo (?) e representa um tipo desconhecido enquanto T
     * representa um Tipo esperado.
     *
     */
    boolean absEquals(NumericsFns<?> ob) { // argumento curinga
        if (Math.abs(obj1.doubleValue()) == Math.abs(ob.obj1.doubleValue())) {
            return true;
        }
        return false;
    }
    /*
	 * Aqui, NumericsFns<?> equivale a qualquer tipo de objeto NumericsFns,
	 * permitindo que dois objetos NumericsFns, sejam quais forem tenha seus valores
	 * absolutos comparados
     */

}
