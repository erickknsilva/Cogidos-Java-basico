/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class GaloesParaLitros {

    public static void main(String[] args) {

        double galoes, litros;
        int counter = 0;

        for (galoes = 1; galoes <= 100; galoes++) {
            litros = galoes * 3.7854;
            System.out.println(galoes + " galoes é " + litros + " listros");
            counter++;
            if (counter == 10) {
                System.out.println("");
                counter = 0;
            }
        }
    }

}
