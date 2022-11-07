/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.UmPraUm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author eric
 */
public class CarroTeste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ligar();//ligando o carro
        System.out.println(carro1.motorEstaLigado());//Mostrando o status do carro

        System.out.println(carro1.motor.giros());// ver quantos giros tá o motor

        System.out.println("\nAceleração do carro");
//        carro1.aceleracao();
//        carro1.aceleracao();
//        carro1.aceleracao();
//        carro1.aceleracao();
//        carro1.aceleracao();
        for (int i = 0; i < 5; i++) {
            carro1.aceleracao();
            System.out.println(carro1.motor.giros());
        }

        System.out.println("\nFreio do carro.");
//        carro1.frear();
//        carro1.frear();
//        carro1.frear();
//        carro1.frear();
//        carro1.frear();
//        carro1.frear();
//        carro1.frear();
//        carro1.frear();
//        System.out.println(carro1.motor.giros());
        for (int i = 0; i < 5; i++) {
            carro1.frear();
            System.out.println(carro1.motor.giros());
        }

        entrada.close();
    }
}
