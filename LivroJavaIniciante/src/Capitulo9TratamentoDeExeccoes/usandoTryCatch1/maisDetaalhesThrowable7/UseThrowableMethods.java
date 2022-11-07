/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.maisDetaalhesThrowable7;

/**
 *
 * @author eric
 */
public class UseThrowableMethods {

    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }//
        catch (ArrayIndexOutOfBoundsException obj) {
            //captura a exceção
            System.out.println("Standard message is: ");
            System.out.println(obj);
            System.out.println("\nStack trace: ");
            obj.printStackTrace();
        }
        System.out.println("After catch Statement.");
    }

}
