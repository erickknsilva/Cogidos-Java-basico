/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author eric
 */
public class Sqr {

    public static void main(String[] args) {
        int sqrs[][] = {
            {1, 1},
            {2, 4},
            {3, 9},
            {4, 16},
            {5, 25},
            {6, 36},
            {7, 49},
            {8, 64},
            {9, 81},
            {10, 10}};
        int i, j;
        
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(sqrs[i][j] + " ");
            }
                System.out.println("");
        }
    }
}
