/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.HierarquiasVariosNiveis;

import java.util.Arrays;

/**
 *
 * @author eric
 */
public class Shapes6 {

    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Azul", "Outlined", 8, 12);
        ColorTriangle t2 = new ColorTriangle("Vermelho", "Filled", 2, 2);
        TwoDShape c1 = new TwoDShape(8,12);
        
        System.out.println("Informação do t1");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Área do triangle " + t1.area());
        
        System.out.println("\nInformação do t2");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Área do triangle " + t2.area());
        
    }
}
