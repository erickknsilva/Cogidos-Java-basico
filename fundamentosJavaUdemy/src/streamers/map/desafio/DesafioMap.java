/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.map.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author eric
 */
public class DesafioMap {

    public static void main(String[] args) {
        /*
        1 - Converter numero para String binaria 6 => 110
        2 - Inverter a String "110" => "011"
        3 - Converter a String para inteiro => "011" => 3
         */

        Consumer<Integer> print = n -> System.out.print(n + " ");
        Consumer<String> println = n -> System.out.print(n + " ");

        Consumer<Integer> impirmir = System.out::print;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> stBinaria = (s) -> s.toBinaryString(s);

        Function<String, String> stReverse
                = (s) -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> num = n -> Integer.parseInt(n, 2);

        nums.stream().map(stBinaria).map(stReverse).map(num).forEach(print);

    }
}
