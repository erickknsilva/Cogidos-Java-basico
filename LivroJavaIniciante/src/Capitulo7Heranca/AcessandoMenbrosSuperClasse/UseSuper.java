/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.AcessandoMenbrosSuperClasse;

import java.util.Arrays;

/**
 *
 * @author eric
 */
public class UseSuper {

    public static void main(String[] args) {
        B subOb = new B(5, 2);
        B subOb2 = new B(10, 3);

        subOb.showDim();
        System.out.println(subOb.soma(subOb));

        int mult = subOb.getIdeA() * subOb.getIdeB();
        System.out.println("Multiplicaçao dos i: " + mult);


        subOb2.showDim();
        System.out.println(subOb2.soma(subOb2));
        
        mult = subOb2.getIdeA() * subOb2.getIdeB();
        System.out.println("Multiplicaçao dos i: " + mult);

//        subOb.showDim();
//        subOb.soma(subOb);
//        System.out.println();
//        subOb2.showDim();
//        subOb2.soma(subOb2);
//
//        int res = subOb.getSoma() * subOb2.getSoma();
//        System.out.println("\nMultiplicação das soma: " + res);
    }
}
