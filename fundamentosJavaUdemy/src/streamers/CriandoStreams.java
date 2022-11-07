/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author eric
 */
public class CriandoStreams {

    public static void main(String[] args) {

        //criando uma variavel para armazenar o method reference
        Consumer<String> print = System.out::print; //programacao funcional
        Consumer<Integer> println = System.out::println; //programacao funcional

        //criando uma stream 
        //1 - forma de criar Stream
        Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
        //imprimindo uma stream chamando uma variavel method reference
        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
        //criando Stream atraves de um 
        //array 2 - forma de criar Stream
        Stream.of(maisLangs).forEach(print);

        //3 - forma de criar Stream
        Arrays.stream(maisLangs).forEach(print);
        /*vantagem de criar pelo Arrays, é que pode imprimir 
        de um determinado indice da lista até tamanho especificado.*/

        Arrays.stream(maisLangs, 1, 3).forEach(print);
        System.out.println();

        System.out.println();
        //Gerando Stream = fluxo de dados apartir das collections
        List<String> outrasLangs = Arrays.asList("C ", "PhP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);//imprimindo fluxo de dados nao ordenados
        //outrasLangs.iterator().forEachRemaining(print);//maneiras para imprimir collections
        //outrasLangs.listIterator().forEachRemaining(print);//maneiras para imprimir collections

//        Stream.generate(() -> "a").forEach(print); //gera uma Stream infinita sem ordenacao
//        Stream.iterate(0, n -> n + 1).forEach(println);  //gera uma Stream infinita do tipo int, sem ordenacao
    }
}
