/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.reduce;

import streamers.reduce.Aluno;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author eric
 */
public class MinMax {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> maiorNota = (al1, al2) -> {
            if (al1.nota > al2.nota) return 1;
            if (al1.nota < al2.nota)  return -1;
            return 0;
        };
        
        Comparator<Aluno> menorNota = (al1, al2) -> {
            if (al1.nota > al2.nota) return 1;
            if (al1.nota < al2.nota) return -1;
             return 0;
        };

        System.out.println(alunos.stream().max(maiorNota).get());
        System.out.println(alunos.stream().min(menorNota).get());

    }
}
