/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.MuitosPraMuitos;

import java.util.ArrayList;

/**
 *
 * @author eric
 */
public class Curso {

    final String nome;

    final ArrayList<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) { //passando um objeto da classe aluno para o metodo
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    public String toString() {
        return nome;
    }
}
