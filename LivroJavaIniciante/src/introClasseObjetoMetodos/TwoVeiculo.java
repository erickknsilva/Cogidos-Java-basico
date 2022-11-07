
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introClasseObjetoMetodos;

/**
 *
 * @author eric
 */
public class TwoVeiculo {

    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();
        Veiculo carroSport = new Veiculo();

        int range1, range2;

        minivan.passageiros = 7;
        minivan.tankCombustivel = 16;
        minivan.mpgaloes = 21;

        carroSport.passageiros = 2;
        carroSport.tankCombustivel = 14;
        carroSport.mpgaloes = 12;

        range1 = minivan.tankCombustivel * minivan.mpgaloes;
        range2 = carroSport.tankCombustivel * carroSport.mpgaloes;

        System.out.println("Minivan pode transportar "
                + minivan.passageiros
                + " passageiros com um intervalo de "
                + range1);

        System.out.println("Carro Sport pode transporta "
                + carroSport.passageiros
                + " passageiros com um intervalo de "
                + range2);

    }
}
