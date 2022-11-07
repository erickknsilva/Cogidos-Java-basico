/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo11Threads.criandoThreadComInterfaceRunnable;

/**
 *
 * @author eric
 */
public class MyThread implements Runnable {

    String threadName;


    MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {

        System.out.println(threadName + " starting");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is " + count);
            }
        } catch (InterruptedException ob) {
            System.out.println(threadName + " Interrompido.");
        }

        System.out.println(threadName + " terminada.");
    }

}
