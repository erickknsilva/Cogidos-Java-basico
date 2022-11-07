/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.criandoSubclassesDeExcecoes10;

/**
 *
 * @author eric
 */
public class CustomExceptDemo {

    public static void main(String[] args) {

        //aqui, numer contem alguns valores impares.
        int[] numer = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++)//
        {
            try {

                if ((numer[i] % 2) != 0) {

                    //cria uma exceção da classe NonIntResultException
                    throw new NonIntResultException(numer[i], denom[i]);
                }
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);

            } //
            catch (ArithmeticException ex) { //captura o erro de divisao por 0
                System.out.println("Nao pode dividir por 0.");
            }// 
            catch (ArrayIndexOutOfBoundsException ex) { //captura o erro de exceçao de indice
                System.out.println("Tamanho do array excedido.");
            }// 
            catch (NonIntResultException exc) { //captura o erro de exceção da classe
                //imprimi o erro da classe
                System.out.println(exc);//chama o metodo toString
            }
        }

    }

}
