/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.usandothrows9;

/**
 *
 * @author eric
 */
public class MultiCatch {

    public static void main(String[] args) {

        int a = 88, b = 0;
        int result;

        char ch[] = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) { // a primeira passagem do laço for é iniado com 0
                    result = a / b; //gera uma ArithmeticException
                } else {
                    ch[5] = 10; // gera um ArrayIndexOutOfBoundsException
                }
            } //essa claussula catch captura duas exceções
            catch (ArithmeticException | ArrayIndexOutOfBoundsException obj) {
                System.out.println("Exceção capturada " + obj);
            }//fim do catch
        }//fim do for

        System.out.println("\nDepois do bloco multi-catch");
    }
}
