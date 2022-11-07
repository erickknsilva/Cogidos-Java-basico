/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo14expressoeslambdas.interfacegenerica;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author eric
 */
public class SomeDemo {

    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (a, b) -> a % b == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("Fatorial!");
        }
        System.out.println();

        SomeTest<Double> isFactorD = (a, b) -> a % b == 0;
        if (isFactorD.test(212.0, 4.0)) {
            System.out.println("Fatorial!");
        }

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic Funcional Interface";

        System.out.println("Testando string " + str);

        if (isIn.test(str, "face")) {
            System.out.println("'face' está dentro.");
        } else {
            System.out.println("'face' está fora.");
        }

    }
}
