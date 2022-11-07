/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author eric
 */
public class test {

    public static void main(String[] args) {

        int number[] = new int[10];

        int num[] = {32, -2, 23, 4, -5, 6, 7, 800, 90, 10};
        int resultado;
        int i, min, max;
        min = max = num[0]; // passa o valor de array para variaveis min e max

        for (i = 0; i < 10; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }

        }
        System.out.println("Maximo = " + max + " minimo = " + min);
        int j;

        for (j = 1; j <= 10; j++) {
            int n = 2;
            resultado = n * j;
            System.out.println(n + " x " + j + " = " + resultado);
        }

    }
}
