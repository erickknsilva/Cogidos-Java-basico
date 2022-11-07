package ArraysColections.VetoresMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos: ");
		int qtdAlunos = entrada.nextInt(); // receber a quantidade de alunos e armazenar

		System.out.print("Quantidade de notas por aluno: ");
		int qtdNotas = entrada.nextInt(); // receber a quantidade de notas por alunos e armazenar
		System.out.println();

		double[][] notaDaClasse = new double[qtdAlunos][qtdNotas];// define o tamanho da matriz notaDaClasse
																	// inicializada pelas variaveis qtdAlunos e qtdNotas

		double total = 0;
		for (int i = 0; i < notaDaClasse.length; i++) { // laco externo percorre a quantidade de alunos
			for (int j = 0; j < notaDaClasse[i].length; j++) { // laco interno percorre as notas de alunos
				System.out.printf("Insira a nota %d do aluno %d ", (j + 1), (i + 1));// imprimi para digitar a nota dos
																						// aluno na sequencia
				notaDaClasse[i][j] = entrada.nextDouble();
				total += notaDaClasse[i][j]; // soma as notas dos alunos
			}
		}
		double media = total / (qtdAlunos * qtdNotas); // calcula a media das notas.
		System.out.println("Media = " + media);

		for (double[] nota : notaDaClasse) { // clona a array notaDaClasse
			System.out.println(Arrays.toString(nota));// imprimir as notas inseridas
		}

		entrada.close();
	}

}
