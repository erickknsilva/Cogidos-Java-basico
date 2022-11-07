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
public class ex3 {

    public static void main(String[] args) {
      

        double[] media = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        double sum = 0, mdedia = 0;

        for (double a : media) {
            sum = a + sum;
        }
        mdedia = sum / media.length;
        System.out.println("A soma = " + sum);
        System.out.println("A média = " + mdedia);

    }
}
