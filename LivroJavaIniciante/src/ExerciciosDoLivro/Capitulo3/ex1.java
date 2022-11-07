/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosDoLivro.Capitulo3;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class ex1 {

    public static void main(String[] args) {
        int i, qtd = 0;
        String result;
        Scanner e = new Scanner(System.in);

        System.out.println("Insira um caractere: ");
        String ch = e.nextLine();

        while (!ch.equals(".")) {
            qtd++;
            for (i = 0; i <= ch.length(); i++) {
            }
            System.out.println("Insira um caractere: ");
            ch = e.nextLine();
        }
        System.out.println(" " + qtd);
    }
}
