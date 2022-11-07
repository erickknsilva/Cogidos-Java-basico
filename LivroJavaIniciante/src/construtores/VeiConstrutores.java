/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construtores;

/**
 *
 * @author eric
 */
public class VeiConstrutores {

    public static void main(String[] args) {

        Veiculo minivan = new Veiculo(7, 16, 21);
        Veiculo sportcar = new Veiculo(2, 14, 12);
        double galoes;
        int dis = 252;

        galoes = minivan.combNecessario(dis);

        System.out.println("Para ir " + dis
                + " milhas minivan precisa de "
                + galoes + " galoes de combustivel.");

        galoes = sportcar.combNecessario(dis);
        System.out.println("Para ir " + dis
                + " milhas carro Sport precisa de "
                + galoes + " galoes de combustivel.");

    }
}
