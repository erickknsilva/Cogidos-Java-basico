/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introClasseObjetoMetodos;

import java.util.Arrays;

/**
 *
 * @author eric
 */
public class VeiculoDemo {

    public static void main(String[] args) {
        // Veiculo minivan; // referencia o objeto 
        // minivan = new Veiculo(); //cria um novo objeto

        Veiculo minivan = new Veiculo();

        int range;

        minivan.passageiros = 7;
        minivan.tankCombustivel = 16;
        minivan.mpgaloes = 21;

        //Vai calcular a autonomia presumindo um tanque cheio de gasolina
        range = minivan.tankCombustivel * minivan.mpgaloes;
        System.out.println("A miniva pode carregar " + minivan.passageiros + " passageiros com o alcance de " + range + "km");
    }
}
