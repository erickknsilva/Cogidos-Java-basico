/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.Recursividade;

/**
 *
 * @author eric
 */
public class Recursao {

    public static void main(String[] args) {
        Fatorial f = new Fatorial();

        System.out.println("Fatorial usando o metodo recursivo: ");
        System.out.println("fatorial de 3 = " + f.factR(3));
        System.out.println("fatorial de 4 = " + f.factR(4));
        System.out.println("fatorial de 5 = " + f.factR(5));
        System.out.println();

        System.out.println("Fatorial usando o metodo interativo");
        System.out.println("Fatorial de 3 = " + f.factI(3));
        System.out.println("Fatorial de 4 = " + f.factI(4));
        System.out.println("Fatorial de 5 = " + f.factI(5));

    }

}
