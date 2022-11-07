/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Finally {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println(7 / entrada.nextInt());

        } catch (ArithmeticException obj) {
            System.out.println(obj.getMessage());
        } finally {
            System.out.println("Finaly...");
            entrada.close();
        }

        System.out.println("Fim.");

    }
}
