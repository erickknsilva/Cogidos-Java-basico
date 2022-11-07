/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introClasseObjetoMetodos;

/**
 *
 * @author eric
 */
public class Combustivel {

    public static void main(String[] args) {
        
        Veiculo minivan = new Veiculo();
        Veiculo carroSport = new Veiculo();
        double galoes;
        int dista = 252;

        minivan.passageiros = 7;
        minivan.tankCombustivel = 16;
        minivan.mpgaloes = 21;
        minivan.range(); //calcula a autonomia

        // calcula o combustivel necessario para cobir um determinada distancia
        galoes = minivan.combNecessario(dista);

        System.out.println("Para ir " + dista
                + " milhas minivan precisa de "
                + galoes + " galoes de combustivel.");

        carroSport.passageiros = 2;
        carroSport.tankCombustivel = 14;
        carroSport.mpgaloes = 12;
        carroSport.range(); //calcula a autonomia

        // calcula o combustivel necessario para cobir um determinada distancia
        galoes = carroSport.combNecessario(dista);
        System.out.println("Para ir " + dista
                + " milhas carroSport precisa de "
                + galoes
                + " galoes de combustivel.");
        
    }
}
