/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class IncrementandoChar {

    public static void main(String[] args) {
        char ch;
        double galoes = 0;
        double litros;
        ch = 'x';

        System.out.println("Ch contem " + ch);

        ch++;
        System.out.println("Ch agora contem " + ch);

        ch = 90;
        System.out.println("Ch agora contem " + ch);

        System.out.println("Alfabeto\n");
        for (ch = 65; ch <= 90; ch++) {
            System.out.println("Letra " + ch);
        }
    }
}
