/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.EstendendoAClasseVeiculo;

import construtores.*;

/**
 *
 * @author eric
 */
public /*classe veiculo*/ class Veiculo {

    /*Adicionando construtores a classe Veiculo */
    private int passagers, fuelcap, mpg;

    //construtor da classe veiculo.
    Veiculo(int p, int c, int m) {
        passagers = p;
        fuelcap = c;
        mpg = m;
    }

    int range() { //Autonomia de um determinado veiculo
        return fuelcap * mpg;
    }

    double combNecessario(int milhas) {//combustivel necessario para um determinada distancia.
        return (double) milhas / mpg;
    }

    //metodos de acesso das variaveis de instacias.
    int getPassagers() {
        return this.passagers;
    }

    void setPassageiros(int p) {
        this.passagers = p;
    }

    int getFuelcap() {
        return this.fuelcap;
    }

    void setFuelcap(int f) {
        this.fuelcap = f;
    }

    void setMpg(int m) {
        this.mpg = m;
    }
}
