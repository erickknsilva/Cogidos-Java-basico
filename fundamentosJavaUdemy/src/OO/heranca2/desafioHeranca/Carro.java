/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.heranca2.desafioHeranca;

/**
 *
 * @author eric
 */
public class Carro {

    int velocidade;
    private String nome, cor;
    final int velocidadeMaxima;

    protected Carro(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidade + 5 > velocidadeMaxima) {
            velocidade = velocidadeMaxima;
        } else {
            velocidade += 5;
            System.out.println("Aceleração " + velocidade);
        }
    }

    public void frear() {

        if (velocidade > 0) {
            velocidade -= 5;
            System.out.println("Reduzindo " + velocidade);
        }

    }

    String rtConstrutor() {
        return "Modelo " + nome;
    }

    String getCor() {
        return "Cor " + cor;
    }

}
