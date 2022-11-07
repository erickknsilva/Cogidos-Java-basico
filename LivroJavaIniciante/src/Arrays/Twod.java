/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author eric
 */
public class Twod {

    public static void main(String[] args) {
        int t, i;

        int table[][] = new int[3][4]; //cria[3] linhhas. Cria [4] colunas.

        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
