/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.VariveisDeArgumentos;

/**
 *
 * @author eric
 */
public class VarArgs2 {

    void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[2]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //obser como vaTes() pode ser chamado
        //com um numero de argumentos variavel.
        VarArgs2 v1 = new VarArgs2();
        v1.vaTest("One argumento: ", 10);//1 argumento
        v1.vaTest("Three varargs: ", 1, 2, 3); //3 argumento
        v1.vaTest("Nenhum varargs: ");//nenhum argumento

    }
}
