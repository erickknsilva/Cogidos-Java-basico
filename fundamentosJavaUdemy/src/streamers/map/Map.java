/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import streamers.Funcoes;

/**
 *
 * @author eric
 */
public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        //Aplicando o map, transformando os dados em maiusculo
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);
//        marcas.stream().map(m -> m.toUpperCase().charAt(0) + "").forEach(print);

        UnaryOperator<String> maiuscula = m -> m.toUpperCase();
        UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + "";
        UnaryOperator<String> grito = g -> g + "!!! ";

        System.out.println("\n\nUsando composição");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(Funcoes::grito)
                .forEach(print);

        System.out.println("\n");
        Consumer<Integer> println = System.out::println;
        List<Integer> number = Arrays.asList(2, 4, 6, 8, 10);
        number.stream().map(n -> n * 2).forEach(println);

    }
}
