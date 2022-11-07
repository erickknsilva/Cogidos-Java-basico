/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.interfacegenerica5.interfacegenericade1tipo;

/**
 *
 * @author eric
 */
public class TesteDemo<T> implements Teste<Double> {

    T[] arrayRef;

    TesteDemo(T[] o) {
        this.arrayRef = o;
    }

    public boolean contains(Double o) {
        for (T num : arrayRef) {
            if (num.equals(o)) {
                return true;
            }
        }
        return false;
    }

}
