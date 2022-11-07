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
public class NewClass {
    
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        
        System.out.println("Forma tradicional...");
        for (String nomeAp : aprovados) {
            System.out.println(nomeAp);
        }
        
        System.out.println("\nLambda 01...");
        aprovados.forEach(nome -> System.out.println(nome));
        
        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));
        
        System.out.println("\nReferencia por metodo #01");
        aprovados.forEach(System.out::println);
        
        System.out.println("\nreferencia por metodo #02");
        aprovados.forEach(ForEach::meuImprimir);
    }
    
    static void meuImprimir(String nome) {
        System.out.println("Oi, meu nome é " + nome);
    }
}
