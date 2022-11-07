/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo14expressoeslambdas.lambdasecapturavariaveis;

import Capitulo14expressoeslambdas.lambdacomoargumentodemetodos.ArgumentoDeLambdaDemo;

/**
 *
 * @author eric
 */
public class VarCapture {

    public static void main(String[] args) {
        //uma variavel local pode ser capturada
        int num = 10;

        MyFunc myLambd = n -> {
            //este uso de num está correto, porque ele nao modifica num
            int v = num + n;

            /*A instrucao a seguir nao é valida 
            porque tenta modificar o valor de num
             */
            //num++;
            return v;
        };

        System.out.println(myLambd.func(8));

        //a linha a seguir tambem causaria um erro, 
        //poq removeria de num o status de efetivamente final.
        //num = 9;
    }
}
