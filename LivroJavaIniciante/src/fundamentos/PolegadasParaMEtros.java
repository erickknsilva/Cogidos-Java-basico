/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

public class PolegadasParaMEtros {

    public static void main(String[] args) {
        double pes, polegadas;
        int counter = 0;

        for (pes = 1; pes <= 144; pes++) {
            polegadas = pes / 39.37;
            // System.out.println(pes + " pés é " + polegadas + " polegadas");
            System.out.printf("%.0f pés é = %.2f polegadas \n", pes, polegadas);
            counter++;
            if (counter == 12) {
                System.out.println("Um metro é igual à aproximadamente 39.47 polegadas.\n");
                counter = 0;
            }
        }

    }
}
