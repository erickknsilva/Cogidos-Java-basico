/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.encapsulamento3.teste;

import OO.heranca2.desafioHeranca.Carro;
import OO.heranca2.desafioHeranca.Carro;
import OO.heranca2.desafioHeranca.Civic;
import OO.heranca2.desafioHeranca.Civic;
import OO.heranca2.desafioHeranca.Esportivo;
import OO.heranca2.desafioHeranca.Ferrari;
import OO.heranca2.desafioHeranca.Ferrari;

/**
 *
 * @author eric
 */
public class CarroDemo {

    public static void main(String[] args) {

        Ferrari f1 = new Ferrari(400);
        Carro h1 = new Civic(240);
        Esportivo esp;

//        esp = (Esportivo) f1;
        System.out.println("Ferrari");
        for (int i = 0; i < 8; i++) {
//            esp.ligarTurbo();
            f1.ligarTurbo();
        }

        System.out.println();
        for (int i = 0; i < 8; i++) {
            f1.desligarTurbo();
        }

        System.out.println();
        System.out.println("Honda civic");
        for (int i = 0; i < 5; i++) {
            h1.acelerar();
        }

        System.out.println();
        for (int i = 0; i < 8; i++) {
            h1.frear();
        }

    }
}
