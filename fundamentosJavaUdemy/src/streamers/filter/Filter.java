/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author eric
 */
public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);

        Consumer<String> println = System.out::println;

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovados = a -> a.nota >= 7.0;

        Function<Aluno, String> msgAprovado = a -> "Parabens " + a.nome + " " + a.nota + " você foi aprovado!";

        System.out.println("Usando filter com map... #01");
        alunos.stream()
                .filter(aprovados)
                .map(msgAprovado)
                .forEach(println);

        System.out.println("\n\nUsando filter com map... #02");
        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(a -> "Parabens " + a.nome + " você foi aprovado!")
                .forEach(System.out::println);

    }
}
