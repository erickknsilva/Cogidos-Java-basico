/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

import java.util.function.Predicate;

/**
 *
 * @author eric
 */
public class PredicadoComposicao {

    public static void main(String[] args) {
        //composicao de predicado

        Predicate<Integer> isPar = num -> num % 2 == 0;

        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        //as 2 precisam ser verdadeiras 
        System.out.println(isPar.and(isTresDigitos).test(107));

        //Só um precisa ser verdadeira 
        System.out.println(isPar.or(isTresDigitos).test(98));

    }
}
