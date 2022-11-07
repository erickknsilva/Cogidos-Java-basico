/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo12enumautoboxing.enumeracoes;

/**
 *
 * @author eric
 */
public class EnumDemo {

    public static void main(String[] args) {

        Transport tp; //declara uma referencia de enum Transport

        tp = Transport.AIRPLANE; //atribui a tp, a constante AIRPLANES
        System.out.println("Valor da tp " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        //compara dois valores enum
        if (tp == Transport.TRAIN) {
            System.out.println("tp contem Trains.\n");
        }

        //Usa uma enum para controlar uma instrução switch
        switch (tp) {  //usa uma enumeração para controlar uma instrução switch
            case CAR:
                System.out.println("A car carries people");
                break;
            case TRUCK:
                System.out.println("A truck carrie freigth");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;
        }

    }
}
