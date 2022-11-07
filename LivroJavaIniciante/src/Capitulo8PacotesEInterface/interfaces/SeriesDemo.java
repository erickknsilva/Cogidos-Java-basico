/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.interfaces;

/**
 *
 * @author eric
 */
public class SeriesDemo {

    public static void main(String[] args) {

        ByTwos ob = new ByTwos();
        ByTwos ob1 = new ByTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("O proximo valor é " + ob.getNext());
        }

        //
        System.out.println("\nResetting");
        ob.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Proximo valor é " + ob.getNext());
        }

        ob.setStart(100);
        System.out.println("\nValor definido: " + ob.getValor());
        for (int i = 0; i < 5; i++) {
            System.out.println("Proximo valor é " + ob.getNext());
        }

    }
}
