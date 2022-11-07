/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.VetoresMatriz;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eric
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de aluno: ");
        int qtdAlunos = entrada.nextInt(); // receber/amarzenar quantidade de alunos 

        System.out.print("Quantidade de notas por alunos: ");
        int qtdNotas = entrada.nextInt(); //receber/amarzenar  quantidade de notas por alunos

        double[][] notaClasse = new double[qtdAlunos][qtdNotas];
        String[] nomeAluno = new String[qtdAlunos];

        double soma = 0;
        double total = 0;
        for (int i = 0; i < notaClasse.length; i++) //laço externo = quantidade de notas por aluno
        {
//          nomeAluno[i] = JOptionPane.showInputDialog("Insira o nome do aluno: ");
            System.out.print("\nNome aluno: ");
            nomeAluno[i] = entrada.next().toUpperCase();

            for (int j = 0; j < notaClasse[i].length; j++) //laço para perccorrer as notas. (notaClasse[i] para cada elemento do array mais externo, vai percorer os alunos) 
            {
                System.out.printf("Informe a nota %d do aluno %s: ", j + 1, nomeAluno[i]); // j + 1, i + 1 imprimir a nota dos alunos na sequencia
                notaClasse[i][j] = entrada.nextDouble(); // receber/armazenar a nota do aluno

                total += notaClasse[i][j]; // calcular a soma das nota
            }
        }

        for (int i = 0; i < notaClasse.length; i++) {
            soma = 0;
            System.out.println();
            for (int j = 0; j < notaClasse[i].length; j++) {
                System.out.printf("%S nota%d = %.2f \t", nomeAluno[i], j + 1, notaClasse[i][j]);
                soma = soma + notaClasse[i][j];
            }
            System.out.printf("\nNota total do aluno = %.2f", soma);
            System.out.println();
        }
        double media = total / (qtdAlunos * qtdNotas); // calcular a media da turma
        System.out.printf("\nMedia da turma = %.2f\n", media); // imprimir a media da turma

//        System.out.println();
//        for (double[] notasDaTurma : notaClasse) { // clonando a array notaClasse
//            for (double ntTurma : notasDaTurma) {
//                System.out.print(ntTurma + "\t");
//            }
//            System.out.println("");
//        }
    }
}
