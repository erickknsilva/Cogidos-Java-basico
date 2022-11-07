/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.reduce;

/**
 *
 * @author eric
 */
public class Aluno {

    final String nome;
    final double nota;
    final boolean bomCoportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomCoportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomCoportamento = bomCoportamento;
    }

    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }
    
}
