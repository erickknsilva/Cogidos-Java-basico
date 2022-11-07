/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.interfaces;

import java.util.Arrays;

/**
 *
 * @author eric
 */
public class SeriesDemo2 {//usando referencia de interface

    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();

        Series ob;
        for (int i = 0; i < 5; i++) {
            ob = twoOb;/*ob recebe uma referencia de objeto da classe ByTwo,
            acessando um objeto atraves da referencia*/
            System.out.println("Proximo valor ByTwo é " + ob.getNext());
            ob = threeOb;/*ob recebe uma referencia de objeto da classe Bythree,
            acessando um objeto atraves da referencia*/
            System.out.println("\nProximo valor ByThree é " + ob.getNext());

        }
        
        System.out.println(Arrays.toString(twoOb.getNextArray(10)));

    }

}
