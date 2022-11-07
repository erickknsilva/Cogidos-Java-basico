/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SobrePosicaoDeMetodoTwoDShape;

import Capitulo7Heranca.HierarquiasVariosNiveis.*;

/**
 *
 * @author eric
 */
public class Triangle extends TwoDShape {

    private String style;

    Triangle() {
        super();
        style = "Nenhum";
    }

    Triangle(String s, double w, double h) {
        super(w, h, "Triangle");
        style = s;
    }

    Triangle(double x) {
        super(x, "Triangle");
        style = "Filled";
    }

    void showStyle() {
        System.out.println("Estilo do triangulo: " + style);
    }

    double area() {
        return getWidth() * getHeigth() / 2;
    }
    
    Triangle (Triangle ob){
        super(ob);
        style = ob.style;
    }
    
    String getStyle(){
        return this.style;
    }
    
}
