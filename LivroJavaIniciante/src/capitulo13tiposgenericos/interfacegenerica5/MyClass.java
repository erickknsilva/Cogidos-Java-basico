/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.interfacegenerica5;

import java.util.Arrays;

/**
 *
 * @author eric
 * @param <T>
 */
public class MyClass<T> implements Containment<T> {

    private T[] arrayRef;

    //cria um construtor que recebe um array
    public MyClass(T[] o) {
        this.arrayRef = o;
    }

    //metodo para verificar se o numero existe dentro do array
    //se existir retorna Verdadeiro, se nao retorna falso
    @Override
    public boolean contains(T o) {
        for (T num : arrayRef) {
            if (num.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "" + Arrays.toString(arrayRef);
    }

    public T[] getArrayRef() {
        return arrayRef;
    }

}
