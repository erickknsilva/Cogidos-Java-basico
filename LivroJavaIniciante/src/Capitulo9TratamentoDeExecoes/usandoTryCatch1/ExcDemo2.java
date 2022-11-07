/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExecoes.usandoTryCatch1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eric
 */
public class ExcDemo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        ExcTest.genExeption(); É DO METODO EM QUE GERA SUA PROPIA EXCEÇÃO QUE ESTA COMENTADO EM ExcTest

        try { //exceção é capturada pelo bloco Try
            ExcTest.genExeption();
        } catch (ArrayIndexOutOfBoundsException ob) {
            System.out.println("Após... o limite do array foi excedido.");
        }
        
        
        

        System.out.println();
        try {
            System.out.print("Insira um numero: ");
            int num = entrada.nextInt();
        } catch (InputMismatchException nm) {
            System.out.println("Você deve inserir um numero.");
        }

        System.out.println("Apos a instruçao catch ser excecutada.");
        entrada.close();
    }
}
