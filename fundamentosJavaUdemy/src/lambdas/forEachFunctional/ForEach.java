/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.forEachFunctional;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eric
 */
public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for (String listaAprovados : aprovados) {
            System.out.println("Lista de aprovados: " + listaAprovados);
        }

        /* aprovados.forEach(nome) aqui voce vai criar uma variavel, que vai receber
        uma lista de aprovados.
        aprovados.forEach(nome -> System.out.println(nome + "...")); 
        aprovados.forEach(nomeAp -> System.out.println(nomeAp + "!!"));
         */
        System.out.println("\nEstilo lambda#01...");
        aprovados.forEach((listaAp) -> {
            System.out.println(listaAp + "!!!");
        });

        System.out.println("\nEstilo Lambda#02...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod reference#01...");
        aprovados.forEach(System.out::println);

        System.out.println("\nMethod reference#02...");
        aprovados.forEach(ForEach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! meu nome é " + nome);
    }

}
