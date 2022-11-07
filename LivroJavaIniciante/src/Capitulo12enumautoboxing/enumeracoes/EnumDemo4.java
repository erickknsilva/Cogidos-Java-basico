/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo12enumautoboxing.enumeracoes;

/**
 *
 * @author eric
 */
public class EnumDemo4 {

    public static void main(String[] args) {

        Transport tp, tp2, tp3;

        //Obtém todos os ordinais=indices da enum usando ordinals().
        System.out.println("Here are all transport constants");

        for (Transport t : Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;
        
        System.out.println();
        
        //demonstra compareTo()
        
        if(tp.compareTo(tp2) < 0)
            System.out.println(tp + " vem antes " + tp2);
        
        if(tp.compareTo(tp2) > 0)
            System.out.println(tp2 +" vem antes" + tp);
        
        if(tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals " + tp3);
        
        
    }
}
