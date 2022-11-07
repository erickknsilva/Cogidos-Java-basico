/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author eric
 */
public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Usando ForEach");
        aprovados.forEach(nome -> {
            System.out.println(nome);
        });

        /*interator verifica se tem proximo elemento, se tiverser proximo ele 
        imprimi, se nao tiver, ele para*/
        System.out.println("\nUsando o Iterator");

        //criando interface Interator
        Iterator<String> iterator = aprovados.iterator();

        while (iterator.hasNext())//hasNext = tem proximo 
        {
            System.out.println(iterator.next());//chama os elemento da fila
        }

        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); //laço-for interno

    }
}
