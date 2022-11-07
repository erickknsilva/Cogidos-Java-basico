/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.VetoresMatriz;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author eric
 */
public class DesafioArray {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas quer informar: ");
        int qtdNotas = entrada.nextInt();  //variavel que vai armazenar a quantidade de notas que vai informar

        double[] notas = new double[qtdNotas]; //criando um array do tamanho da quantdade ide notas a informar                   

        for (int i = 0; i < notas.length; i++) { // laço para inserir as notas
            System.out.print("Digte a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble(); // recebendo as notas e amarzenando
        }
        System.out.println(Arrays.toString(notas)); // imprimindo as notas inseridas

        double total = 0;
        for (double nota : notas) { //laco ForEach para somar as notas
            total += nota; // somas as notas
        }
        System.out.println("Media das notas = " + (total / notas.length)); // imrprimir as medias das notas

    }

}
