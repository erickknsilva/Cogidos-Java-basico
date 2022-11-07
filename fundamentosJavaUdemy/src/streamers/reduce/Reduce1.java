/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author eric
 */
public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer totalReduce = nums.stream().reduce(soma).get();
        System.out.println(totalReduce);

        //pararellStream soma o valor inicial toda vez que ocorre a interacao do laço
        Integer total2 = nums.parallelStream().reduce(100, soma);

        //stream soma o valor inicial toda vez que ocorre a interacao do laço 
        Integer total3 = nums.stream().reduce(100, soma);
        System.out.println(total2 + "\n" + total3);

        nums.stream()
                .filter(n -> n > 10)
                .reduce(soma)
                .ifPresent(System.out::println);

        nums.stream().reduce(100, soma);

    }
}
