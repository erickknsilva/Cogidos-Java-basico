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
public class ex1 {

    public static void main(String[] args) {
        // Duas maneiras de declarar array unidimensional de 12 doubles

        double[] a1 = new double[12];
        a1[0] = 12.5;
        a1[1] = 42.5;
        a1[2] = 54.23;
        a1[3] = 5.5;
        a1[4] = 4.2;
        a1[5] = 12.3;
        a1[6] = 4.2;
        a1[7] = 9.5;
        a1[8] = 05.52;
        a1[9] = 4.4;
        a1[10] = 6.5;
        a1[11] = 98.42;

        System.out.println(Arrays.toString(a1));
        
        double [] a2 = {1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 1.10, 1.11, 1.12};
        System.out.println(Arrays.toString(a2));

    }

}
