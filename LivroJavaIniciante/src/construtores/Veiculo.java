/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construtores;

/**
 *
 * @author eric
 */
public /*classe veiculo*/ class Veiculo {

    /*Adicionando construtores a classe Veiculo */
    int passageiros, tankCombustivel, mpgaloes;

    int range() { //Autonomia de um determinado veiculo
        return tankCombustivel * mpgaloes;
    }

    //construtor da classe veiculo.
    Veiculo(int p, int c, int m) {
        passageiros = p;
        tankCombustivel = c;
        mpgaloes = m;
    }

    double combNecessario(int milhas) {
        return (double) milhas / mpgaloes;
    }
}
