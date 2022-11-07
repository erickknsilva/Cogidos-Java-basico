/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.map.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author eric
 */
public class DesafioMapResposta {

    public static void main(String[] args) {
        Consumer<Integer> print = n -> System.out.print(n + " ");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> biToInt = n -> Integer.parseInt(n, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(biToInt)
                .forEach(System.out::println);

    }
}
