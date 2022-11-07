/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.VariveisDeArgumentos;

/**
 *
 * @author eric
 */
public class VarArgs {
    //vaTest() usa um vararg.

    public static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //obser como vaTes() pode ser chamado
        //com um numero de argumentos variavel.
        vaTest(10);//1 argumento
        vaTest(1, 2, 3); //3 argumento
        vaTest();//nenhum argumento

    }
}
