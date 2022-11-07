/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.lancandoExcecoes5;

/**
 *
 * @author eric
 */
public class ThrowDemo {

    public static void main(String[] args) {

        try {
            /*obs: nao esta necessitando a criançao de arrays ou programa para
            que o erro seja gerado pela jvm, aqui voce gera a exceção manualmente
            usando uma instrução throw. Sua forma geral é mostrada a seguir:
             */
            System.out.println("Antes da exceção");
            throw new ArithmeticException();
            /*Lembre-se, throw lança um objeto, logo voce deve criar um objeto
            para ela lançar para catch. Isto é, voce nao ppode apenas lançar um tipo.
             */
        }//
        catch (ArithmeticException obj) {
            System.out.println("Execeção capturada.");
        }
        System.out.println("Depois de try/catch blocck.");
    }
}
