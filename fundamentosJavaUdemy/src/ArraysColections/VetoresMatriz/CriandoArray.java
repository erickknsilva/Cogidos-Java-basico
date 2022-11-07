/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.VetoresMatriz;

import java.util.Arrays;

/**
 *
 * @author eric
 */
//Exercicio2
public class CriandoArray {

    public static void main(String[] args) {

        double[] nota = new double[4]; // crianco uma array do tipo float com tamanho de 4 indice

        nota[0] = 6.55;//aplicar o valor no indice 0 do array
        nota[1] = 7.5; //aplicar o valor no indice 0 do array
        nota[2] = 8.5; //aplicar o valor no indice 0 do array
        nota[3] = 9.5; //aplicar o valor no indice 0 do array

        System.out.println(Arrays.toString(nota)); //para imprimir os valores do array nota[]

        for (int i = 0; i < 4; i++) {
            System.out.println(nota[i]); //imprimir os valores de nota em um laço for
        }

        double[] nota2 = {1.5, 2.5, 3.5, 4.5, 5.5, 4.3};
        double notaTotal = 0;
        for (int i = 0; i < nota2.length; i++) { // nota2.legth para saber o tamanho do array.
            notaTotal += nota2[i]; // passa o valor da nota inserida para variavel notaTotal
        }
        System.out.println(notaTotal / nota2.length);// media das nota 
        System.out.println(nota2[nota2.length - 3] + " para imprimir a nota que esta no indice 3\n"
                + " "); //para imprimir a nota que esta no indice 3

    }

}
