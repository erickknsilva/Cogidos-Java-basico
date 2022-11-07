/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.relancandoexcecao6;

/**
 *
 * @author eric
 */
public class RethrowDemo {

    public static void main(String[] args) {

        try {
            Rethrow.genException();
        }//
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Erro fatal - programa encerrado.");
        }
    }
}
