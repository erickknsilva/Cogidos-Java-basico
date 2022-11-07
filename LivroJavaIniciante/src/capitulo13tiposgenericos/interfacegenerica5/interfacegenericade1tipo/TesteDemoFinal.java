/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.interfacegenerica5.interfacegenericade1tipo;

/**
 *
 * @author eric
 */
public class TesteDemoFinal {

    public static void main(String[] args) {
        Double[] num = {1.5, 2.5, 3.5};

        TesteDemo<Double> ob = new TesteDemo<>(num);

        System.out.println(ob.contains(1.0));

    }
}
