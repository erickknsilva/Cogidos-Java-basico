/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.BlocoEstatico;

/**
 *
 * @author eric
 */
public class StaticBlock {

    static double rootOf2;  
    static double rootOf3;

    static {
        System.out.println("Dentro do bloco estático.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }

}
