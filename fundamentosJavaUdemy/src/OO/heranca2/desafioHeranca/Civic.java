/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.heranca2.desafioHeranca;

/**
 *
 * @author eric
 */
public class Civic extends Carro {

    public void acelerar() {
        super.acelerar();
    }

    public void frear() {
        super.frear();
    }

    int ano;

    public Civic(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }
}
