/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author eric
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int i;

        //criar uma array do tipo int e pode armazenar 10 valor
        int num[] = new int[10];

        for (i = 0; i < 10; i++) {
            num[i] = i; // passa o valor de i para array armazenado 10 valores
        }
        for (i = 0; i < 10; i++) {
            System.out.println("Demonstração [" + i + "] " + num[i]);
        }

    }
}
