/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Capitulo14expressoeslambdas.interfacegenerica;

/**
 *
 * @author eric
 */
//cria uma interface generica
public interface SomeTest<T> {

    //metodo abstrato generico o tipo aplicado na interface, vai ser aplica aqui
    boolean test(T a, T b);

   
}
