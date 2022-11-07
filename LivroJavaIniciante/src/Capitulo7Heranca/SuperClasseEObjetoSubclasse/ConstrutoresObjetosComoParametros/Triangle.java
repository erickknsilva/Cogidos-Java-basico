/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseEObjetoSubclasse.ConstrutoresObjetosComoParametros;

import Capitulo7Heranca.UsandoSuperParaChamaConstrutores.*;

/**
 *
 * @author eric
 */
public class Triangle extends TwoDShape {

    private String style;

    Triangle(String style, double a, double b) {
        super(a, b);//super é para executar um construtor de TwoDShape
        this.style = style;
    }

    Triangle() {
    }
    
    Triangle(Triangle t){
        super(t);
        style = t.style;
    }

    double area() {
        return getWidth() * getHeigth() / 2;
    }

    void showStyle() {
        System.out.println("O estilo do triangulo é: " + style);
    }
}
