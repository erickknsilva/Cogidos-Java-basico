/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Porteiro extends Thread {

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void addChegadaAniversarinte(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int valor = entrada.nextInt();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                //notificar os observers
                for (ChegadaAniversarianteObserver obs : this.observers) {
                    obs.chegou(event);
                }
            } else {
                System.out.println("Alarme falso!");
            }
        }

    }

}
