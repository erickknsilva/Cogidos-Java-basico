/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo11Threads.criandoThreadComInterfaceRunnable.threadMelhorada;

/**
 *
 * @author eric
 */
public class UseThreadMelhorada {

    public static void main(String[] args) {
        
        System.out.println("Main thread Starting");

        MyThreadMelhorada obj = new MyThreadMelhorada("Child #2");

        for (int i = 0; i < 100; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);

            } catch (InterruptedException exc) {
                System.out.println("Main thread interrompida");
            }
        }

        System.out.println("Main thread terminada.");

    }
}
