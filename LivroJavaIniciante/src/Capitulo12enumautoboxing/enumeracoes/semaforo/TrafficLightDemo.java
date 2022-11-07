/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo12enumautoboxing.enumeracoes.semaforo;

/**
 *
 * @author eric
 */
public class TrafficLightDemo {

    public static void main(String[] args) {
        TrafficLigthSimulador tl = new TrafficLigthSimulador(TrafficLigthColor.VERDE);

        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();

    }
}
