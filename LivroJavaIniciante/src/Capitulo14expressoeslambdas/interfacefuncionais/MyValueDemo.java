/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo14expressoeslambdas.interfacefuncionais;

/**
 *
 * @author eric
 */
public class MyValueDemo {

    public static void main(String[] args) {
        MyValue myVal;//criar uma referencia de instancia da interface MyValue

        myVal = () -> 98.6;
        System.out.println("O valor constant " + myVal.getValue());

    }
}
