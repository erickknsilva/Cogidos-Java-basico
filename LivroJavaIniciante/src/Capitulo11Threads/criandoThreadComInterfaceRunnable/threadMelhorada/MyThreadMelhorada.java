/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo11Threads.criandoThreadComInterfaceRunnable.threadMelhorada;

/**
 *
 * @author eric
 */
public class MyThreadMelhorada implements Runnable {

    String name;

    Thread thrd; // Cria uma referencia a classe Thread, e armazenado em thrd

   public MyThreadMelhorada(String name) {
        //inicializando o construtor da classe Thread, this referencia um objeto da classe MyThreadMelhorada
        thrd = new Thread(this, name);
        this.name = name;
        thrd.start();//inicializando a thread, assim que criada.
    }

    @Override
    public void run() {

        System.out.println(name + " starting");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + name + ", count is " + count);
            }
        } catch (InterruptedException ob) {
            System.out.println(thrd.getName() + " Interrompido.");
        }
        System.out.println(thrd.getName() + " terminada.");
    }

}
