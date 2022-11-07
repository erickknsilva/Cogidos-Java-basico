/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.tratandoErrocomFor2;

/**
 *
 * @author eric
 */
public class ExcDemo3 {

    //trata o erro e normalmente continia a execução
    public static void main(String[] args) {
        int[] numer = {4, 8, 15, 32, 64, 128};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);;
                /*Zero nao pode dividir nenhum numero, logo retornando um erro de ArithmeticException
                capturado por catch e tratando sua excecução
                 */
            } catch (ArithmeticException ob) {
                System.out.println(numer[i] + " não pode dividir por 0");
            }

        }
    }
}
