/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 *
 * @author eric
 */
public class OperadorBinaryo {

    public static void main(String[] args) {

        BinaryOperator<Double> media = ((n1, n2) -> (n1 + n2) / 2);
        System.out.println(media.apply(8.4, 7.6));

        BiFunction<Double, Double, String> resultado
                = (n1, n2) -> {
                    double notaFinal = (n1 + n2) / 2;
                    return notaFinal >= 7 ? "Aprovado" : "Reprovado";
                };
        System.out.println(resultado.apply(9.0, 5.0));

        Function<Double, String> conceito
                = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(7.5, 6.9));
    }
}
