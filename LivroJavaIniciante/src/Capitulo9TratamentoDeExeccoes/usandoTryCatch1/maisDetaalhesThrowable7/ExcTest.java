/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.maisDetaalhesThrowable7;

/**
 *
 * @author eric
 */
public class ExcTest {

    static void genException() {
        int nums[] = new int[4];
        System.out.println("Antes da exceção ser gerada.");
        //gera uma exceçao de indice fora do limite
        nums[7] = 10;
        System.out.println("This won't displayed.f");
    }
}
