/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.tratandoErrocomFor2;

/**
 *
 * @author eric
 */
public class ExcDemo4 {

    public static void main(String[] args) {
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) //
        {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException ob) {//captura a divisao por 0
                System.out.println("ocorreu uma exceção.");
            } catch (ArrayIndexOutOfBoundsException ob) { //captura uma exceção de array
                System.out.println("Limite do array excedido!");
            }
        }//fim do laço for

    }
}
