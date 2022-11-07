/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseEObjetoSubclasse;

/**
 *
 * @author eric
 */
public class IncopatibleRef {

    public static void main(String[] args) {

        X x1 = new X();
        X x = new X(10);
        X x2;/* A variavel de refrencia de uma super classe pode receber a referencia
        a um objeto de qualquer subclasse derivada dessa superclasse*/

        Y y = new Y(5, 6);

        x2 = x; //correto as duas sao do mesmo tipo
        System.out.println("X2.a: " + x2.a);

        x2 = y; //continua correto porque Y é derivada de X
        System.out.println("x2.a: " + x2.a);

        //referencia de X só conhecem menbros de x
        x2.a = 19; //ok
        //x2.b = 27; //Erro, X nao tem um menbro b


    }
}
