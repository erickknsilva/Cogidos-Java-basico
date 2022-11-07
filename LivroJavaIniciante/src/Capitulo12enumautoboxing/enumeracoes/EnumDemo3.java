/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo12enumautoboxing.enumeracoes;

/**
 *
 * @author eric
 */
public class EnumDemo3 {

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        Transport tp;

        //exibe a velocidade de um avião
        System.out.println("A velocidade típica de um avião é "
                + Transport.AIRPLANE.getSpeed()
                + " milhas por hora.");

        System.out.println("\nAll transports speed: ");
        for (Transport t : Transport.values()) {
            System.out.println(t + " typical speed is "
                    + t.getSpeed()
                    + " miles per hour.");
        }
        
        System.out.println("\nAll name transport..");
        for (Transport t : Transport.values()) {
            System.out.println(t + " Name is "
                    + t.getNome()
                    + ".");
        }

    }

}
