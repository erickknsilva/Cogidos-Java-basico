/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.usandofinally8;

/**
 *
 * @author eric
 */
public class UseFinally {

    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Recebendo " + what);

        try {
            switch (what) {
                case 0:
                    t = 10 / what; //gera um erro de divisao  por 0
                    break;
                case 1:
                    nums[4] = 4; //gera um erro de indice de array
                    break;
                case 2:
                    return; //retorna do bloco try
            }//fim do switch
        }//fim  do try
        catch (ArithmeticException ob) {
            System.out.println("nao pode dividir por 0");
            return; //retorna de catch
        }//
        catch (ArrayIndexOutOfBoundsException ob) {
            System.out.println("Indice nao encontrado.");
        }//
        finally {
            System.out.println("Deixando tentar.");
        }
    }
}
