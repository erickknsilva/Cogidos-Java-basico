/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package capitulo13tiposgenericos.interfacegenerica5.interfacegenericade1tipo;

//Interface so aceita tipo numerico, pode ser Number ou subclasse number
public interface Containment<T extends Number> {

    boolean contains(T o);
}
