/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.relancandoexcecao6;

/**
 *
 * @author eric
 */
public class Rethrow {

    public static void genException() {

        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " é " + numer[i] / denom[i]);
            }//
            catch (ArithmeticException obj) {
                //captura uma exceção
                System.out.println("Não pode dividir por 0");
            }//
            catch (ArrayIndexOutOfBoundsException obj) {
                System.out.println("Tamanho do array excedido.");
                throw obj;
            }
        }
    }

}
