/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

import java.util.function.UnaryOperator;

/**
 *
 * @author eric
 */
public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2; //receber o numero e somar com +2
        UnaryOperator<Integer> vezesDois = n -> n * 2; //receber o numero e multiplicar por 2
        UnaryOperator<Integer> aoQuadrado = n -> n * n; //numero multiplicado por ele mesmo

        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);
        System.out.println("Metodo andThen " + resultado1);

        /*metodo compose realiza o calculo de baixo pra cima, logo deve 
        inverter as chamadas das funçoes*/
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
        System.out.print("Metodo compose " + resultado2);
    }

}
