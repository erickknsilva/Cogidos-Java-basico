/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.reduce;

import streamers.reduce.Aluno;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import streamers.reduce.*;

/**
 *
 * @author eric
 */
public class Match {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        //allMatch todos precisam ser verdadeiros
        System.out.println(alunos.stream().allMatch(aprovado));

        //anyMatch apenas um precisa ser verdadeiro
        System.out.println(alunos.stream().anyMatch(aprovado));

        //todos precisam ser falsos
        System.out.println(alunos.stream().noneMatch(aprovado));

    }
}
