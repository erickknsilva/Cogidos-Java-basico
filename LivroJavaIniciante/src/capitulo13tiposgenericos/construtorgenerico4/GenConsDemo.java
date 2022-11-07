/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.construtorgenerico4;

/**
 *
 * @author eric
 */
public class GenConsDemo {

    public static void main(String[] args) {

        Summation ob = new Summation(4.0);
        System.out.println("A soma de 4.0 eh " + ob.getSum());

        Summation ob2 = new Summation(10);
        System.out.println("A soma de 5.0 eh " + ob2.getSum());
    }
}
