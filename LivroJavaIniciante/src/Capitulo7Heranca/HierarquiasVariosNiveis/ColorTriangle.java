/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.HierarquiasVariosNiveis;

/**
 *
 * @author eric
 */
public class ColorTriangle extends Triangle {

    private String color;
    
    ColorTriangle (String c, String s, double w, double h){
        super(s, w, h);
        this.color = c;
    }
    
    String getColor (){
        return color;
    }
    
    void showColor(){
        System.out.println("A cor é " + this.color);
    }
    
}
