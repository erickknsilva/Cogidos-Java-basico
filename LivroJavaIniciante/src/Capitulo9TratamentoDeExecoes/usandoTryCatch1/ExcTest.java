/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExecoes.usandoTryCatch1;

/**
 *
 * @author eric
 */
public class ExcTest {

    /*Uma exceção pode ser gerada por um 
    método e capturado por outro.
     */
    static void genExeption() {//metodo para gerar um exceção
        int[] nums = new int[4];

        System.out.println("Antes da exceção ser gerada.");
        nums[7] = 10;//exceção é gerada aqui
        System.out.println("Se isso for mostrado é porque o limite nao foi exceddido.");
    }

    /*
    ESSE METODO COMENTADO É UMA OUTRA VERSAO EM QUE
    O METODO GERA O PROPIO ERRO DE EXCEÇAO E O CAPTURA
    E QUANDO ISSO É FEITO ELE NAO É PASSADO PARA A CLASSE
    EM QUE ESTÁ SENDO CHAMADA, MESMO SE A CLASSE CONTIVER 
    UM BLOCO TRY PARA CAPTURAR O ERRO.
     */
//    static void genExeption() {//metodo para gerar um exceção
//        int[] nums = new int[4];
//
//        try {
//            System.out.println("Antes da exceção ser gerada.");
//            nums[7] = 10;//exceção é gerada aqui
//            System.out.println("Se isso for mostrado é porque o limite nao foi exceddido.");
//        } catch (ArrayIndexOutOfBoundsException ob) {
//            System.out.println("O limite do array foi excedido.");
//        }
//    }
}
