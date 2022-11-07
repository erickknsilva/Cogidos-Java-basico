/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.polimorfismo4;

/**
 *
 * @author eric
 */
public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.200);
        Feijao ingrediente2 = new Feijao(0.100);

        Comida ingrediente3 = new Arroz(0.3);

        System.out.println("Peso inicial " + p1.getPeso());

        p1.comer(ingrediente1);
        p1.comer(ingrediente2);
        p1.comer(ingrediente3);
        System.out.println("Peso após a janta " + p1.getPeso());

        Sorvete sobremessa = new Sorvete(0.400);
        p1.comer(ingrediente1);
        System.out.printf("Peso após a sobremessa %.2f \n", p1.getPeso());

    }
}
