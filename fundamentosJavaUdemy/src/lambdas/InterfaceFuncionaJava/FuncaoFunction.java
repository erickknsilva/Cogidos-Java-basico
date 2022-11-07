/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

import java.util.function.Function;

/**
 *
 * @author eric
 */
public class FuncaoFunction {

    public static void main(String[] args) {

        //parametro de entrada é um inteiro e o tipo de retorno String
        Function<Integer, String> parOuImpar
                = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, Integer> parOuImpar2
                = a -> "par".equals(a) ? 2 : 1;
        System.out.println(parOuImpar2.apply("2"));

        System.out.println(parOuImpar.apply(32));

        Function<String, String> resultado = valor -> "O resultado é " + valor;

        Function<String, String> empolgado = emp -> emp + "!!!";

        Function<String, String> nota = n -> n + " isso é 10";

        String resultadoFinal
                = parOuImpar.andThen(resultado)
                        .andThen(empolgado)
                        .andThen(nota)
                        .apply(32);

        System.out.println(resultadoFinal);
    }
}
