/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introClasseObjetoMetodos;

/**
 *
 * @author eric
 */
public class Test {

    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();

        minivan.passageiros = 7;
        minivan.tankCombustivel = 17;
        minivan.mpgaloes = 14;
        
        
        double a = minivan.tankCombustivel * minivan.mpgaloes;
        
        System.out.println(" fsa " + a);
    }

}
