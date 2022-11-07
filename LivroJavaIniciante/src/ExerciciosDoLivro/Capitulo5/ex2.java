/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosDoLivro.Capitulo5;

import java.util.Arrays;

/**
 *
 * @author eric
 */
public class ex2 {

    public static void main(String[] args) {
        // mostre como inicializar um array unidimensional de inteiros com os valores de 1 a 5
        int i;

        int[] a1 = new int[5];

        for (i = 0; i < 5; i++) {
            a1[i] = i;
        }
            System.out.println(Arrays.toString(a1));
    }
}
