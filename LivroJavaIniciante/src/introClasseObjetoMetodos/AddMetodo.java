/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introClasseObjetoMetodos;

/**
 *
 * @author eric
 */
public class AddMetodo {

    public static void main(String[] args) {

        Veiculo minivan = new Veiculo();
        Veiculo carroSport = new Veiculo();

        int range1, range2;

        minivan.passageiros = 8;
        minivan.tankCombustivel = 16;
        minivan.mpgaloes = 21;

        carroSport.passageiros = 2;
        carroSport.tankCombustivel = 14;
        carroSport.mpgaloes = 12;

        // range1 = minivan.range(); // range1 armazena o valor do metodo range
        // range2 = carroSport.range(); // range2 armazena o valor do metodo range
        System.out.println("Minivan pode transporta "
                + minivan.passageiros
                + " passageiros com alcance de "
                + minivan.range() + " milhas");

        System.out.println("Carro Sport pode transporta "
                + carroSport.passageiros
                + " passageiros com alcance de "
                + carroSport.range() + " milhas");

        if (minivan.range() > carroSport.range()) {
            System.out.println("Minivan tem maior alcance.");
        }
    }
}
