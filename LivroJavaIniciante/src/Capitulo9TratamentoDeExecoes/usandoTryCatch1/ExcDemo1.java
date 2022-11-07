/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExecoes.usandoTryCatch1;

/**
 *
 * @author eric
 */
public class ExcDemo1 {

    public static void main(String[] args) {

        int[] nums = new int[4];
        /*try e catch formam a base do tratamento de exceção
        elas funcionam em conjunto, ou seja, voce nao pode ter
        um catch sem um try. Esta é a forma geral dos blocos try/catch
        de tratamento de exceções.
         */

        try { //Cria um bloco try.
            System.out.println("Antes da execao ser gerada.");
            //gera uma execçao de indice fora do limite
            nums[7] = 10; //tenta indexar excedendo o limite de indice nums, causando um erro e exceçao

            System.out.println("Isso nao sera exibido.");/*por causa que esta ocorrendo um erro de exceção
            e quando esse erro é encontrado ele é transferido automaticamente para a condição catch impedindo
            que chegue as o metodo println, por isso esse metodo não é executado.
             */

        } catch (ArrayIndexOutOfBoundsException exc) { //Captura erro quando extende o limite do array
            //Captura o erro de execção
            System.out.printf("Apos... Indice inexistente, o tamanho do indice eh ate [%d]\n", nums.length - 1);
//            System.out.println("Após... Índice inexistente, o tamanho do indice é " + nums.length);
        }
        System.out.println("Apos a instrucao catch.");

        //O codigo cujo o erro que voce quer monitorar está dentro do bloco Try.
    }
}
