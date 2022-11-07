/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo11Threads.criandoThreadComInterfaceRunnable;

/**
 *
 * @author eric
 */
public class UseThreads {

    public static void main(String[] args) {

        System.out.println("Main thread inicializada.");

        MyThread obj = new MyThread("Child #1");//objeto executavel

        //Em seguida, constroi uma thread apartir desse objeto.
        Thread newThread = new Thread(obj); //constroi um thread nesse objeto

        //para concluir, começa a excecução da thread.
        newThread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                //para assegurar que a thread principal=Main seja a ultima a terminar
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");

        /*obs: em um programa com varias thread, geralmente é melhor a thread 
        principal ser a ultima a termina. Como regra geral, umprograma continua
        a ser excecutadoaté todas as suas threads terem terminado. Logo, fazer
        a thread principal terminar por ultimo nao é um requisito. No entando 
        costuma ser uma boa pratica - principalmente na primeira vez que ouvimos
        falar dela.
         */
    }
}
