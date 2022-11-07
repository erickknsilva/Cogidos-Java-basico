/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.UmPraUm;

/**
 *
 * @author eric
 */
public class Carro {

    //Classe motor agora é um atributo da classe carro
    Motor motor;
    
    Carro() {
        this.motor = new Motor(this);
    }
    
    void aceleracao() {
        if (motor.injecaoGasolina < 2.6) {
            motor.injecaoGasolina += 0.4; //Acrescenta mais o valor 0.4 em cima do valor atual 
        }
    }

    void frear() {
        if (motor.injecaoGasolina > 0.5) {//mecanismo de defesa o carro so pode ser freiado a 600 rpm
            motor.injecaoGasolina -= 0.4; //Vai diminuir 0.4 no valor
        }
    }

    void ligar() {
        motor.ligado = true; //liga o motor
    }

    void desligado() {
        motor.ligado = false; //desliga o motor 
    }

    boolean motorEstaLigado() {
        return motor.ligado;
    }

}
