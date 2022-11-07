/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author eric
 */
public class Reduce2 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;//retorna um boolean
        Function<Aluno, Double> getNota = a -> a.nota;//recebe um tipo e retorna outro/mesmo
        BinaryOperator<Double> soma = (ac, n) -> ac + n;//retorna o mesmo valor de entrada

        alunos.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
