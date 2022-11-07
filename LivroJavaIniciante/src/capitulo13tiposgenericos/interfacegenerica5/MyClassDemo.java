/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.interfacegenerica5;

/**
 *
 * @author eric
 */
public class MyClassDemo {

    public static void main(String[] args) {

        Integer[] x = {1, 2, 3};//cria uma array
        //cria um objeto do tipo Integer e recebe um array no construtor
        MyClass<Integer> ob = new MyClass<>(x);

        if (ob.contains(2)) {
            System.out.println("2 esta dentro de ob");
        } else {
            System.out.println("2 nao esta dentro de ob");
        }

        if (ob.contains(3)) {
            System.out.println("3 esta dentro de ob");
        } else {
            System.out.println("3 nao esta dentro de ob");
        }

        if (ob.contains(5)) {
            System.out.println("5 esta dentro de ob");
        } else {
            System.out.println("5 nao esta dentro de ob");
        }

    }
}
