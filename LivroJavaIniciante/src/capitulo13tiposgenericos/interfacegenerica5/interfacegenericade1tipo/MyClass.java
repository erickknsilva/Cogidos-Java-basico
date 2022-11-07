/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.interfacegenerica5.interfacegenericade1tipo;

/**
 *
 * @author eric
 * @param <T>
 */
//MyClass deve especificar o mesmo limite estabelecido por Containment que é Number
public class MyClass<T extends Number> implements Containment<T> {

    T[] arrayRef;

    public MyClass(T[] obj) {
        arrayRef = obj;
    }

    @Override
    public boolean contains(Number o) {
        for (T num : arrayRef) {
            if (num.equals(o)) {
                return true;
            }
        }
        return false;
    }

}
