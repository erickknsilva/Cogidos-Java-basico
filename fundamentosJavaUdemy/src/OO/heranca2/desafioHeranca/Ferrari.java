/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.heranca2.desafioHeranca;

/**
 *
 * @author eric
 */
public class Ferrari extends Carro implements Esportivo, Luxo {

    /*esse construto referencia a propia classe
        se nao vor usado um construtor para informa a velocidade maxima
        sera 355 por padrao
     */
    public Ferrari() {
        this(355);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public void acelerar() {

        if (velocidade + 15 > velocidadeMaxima) {
            velocidade = velocidadeMaxima;
        } else {
            velocidade += 15;
            System.out.println("Aceleração " + velocidade);
        }

    }

    public void frear() {
        if (velocidade > 0) {
            velocidade -= 15;
            System.out.println("Reduzindo " + velocidade);

        }
    }

    @Override
    public void ligarTurbo() {
        if (velocidade + 35 > velocidadeMaxima) {
            velocidade = velocidadeMaxima;
            if (velocidade == velocidadeMaxima) {
                System.out.println("Voce atingiu a velocidade maxima");
            }
        } else {
            velocidade += 35;
            System.out.println("Acelerando modo turbo " + velocidade);
        }
    }

    @Override
    public void desligarTurbo() {
        if (velocidade > 0) {
            velocidade -= 35;
            System.out.println("Reduzindo " + velocidade);
        }
    }

    @Override
    public void ligarAr() {

    }

    @Override
    public void desligarAr() {
    }

}
