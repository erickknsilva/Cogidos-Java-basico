/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.blocoTryAninhados4;

/**
 *
 * @author eric
 */
public class NesTrys {

    public static void main(String[] args) {
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < numer.length; i++)//
            {
                try //
                {
                    System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);

                } catch (ArithmeticException ob) {
                    //capturado pelo laco interno
                    System.out.println("Não pode ser divido por 0");
                }

            }//fim do laço for
        } catch (ArrayIndexOutOfBoundsException ob) {
            //excecao de tamanho do array capturado pelo laço externo
            System.out.println("Indice não encontrado.");
            System.out.println("Erro fatal programa - encerrado.");
        }

        System.out.println("\nDepois da exceção, sem o bloco try o programa "
                + "seria \nencerrado de modo anormal, e nao mostraria essa mensagem.");

        /*Nesse exemplo, uma exceção que poode ser tratada pelo try interno - um erro
        de  divisão por zero - permite que o programa continue. No entanto, um erro
        de limite de array é capturado  pelo try externo, o que encerra o programa.
        
        Embora certamente não seja a unica razao  para usarmos instruçoes try aninhados,
        o programa anterior mostra algo importante que pode ser generalizzaado. Com fre-
        quencia de erros sejam tratadas  de maneiras distintas. Alguns tipos de erro são
        catastrofico e nao podem  sser corrigidos. Outros são menores e podem ser tratados 
        imediatamente. Voce poderia usar um bloco try externo para captuurar erros mais graves
        permitindo que o bloco try internos tratasem o menos graves.
         */
    }
}
