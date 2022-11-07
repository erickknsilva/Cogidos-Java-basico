/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.capturandoExcecoesDeSubclasses3;

/**
 *
 * @author eric
 */
public class ExcDemo5 {

    public static void main(String[] args) {
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++)//
        {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);

            } catch (ArrayIndexOutOfBoundsException exc) { //captura a subclaasse
                //captura a exceção da subclasse
                System.out.println("Tamanho do array excedido.");

            } catch (Throwable exc) {
                System.out.println("Ocorreu um excecao.");
            }
        }
    }
}
