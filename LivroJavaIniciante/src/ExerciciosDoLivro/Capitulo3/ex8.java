/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosDoLivro.Capitulo3;

/**
 *
 * @author eric
 */
public class ex8 {

    public static void main(String[] args) {
        // o que o fragmento abaixo exibe ?
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
            if ((i % 2) == 0) {
                continue;
            }
            System.out.println();
        }
    }
}
