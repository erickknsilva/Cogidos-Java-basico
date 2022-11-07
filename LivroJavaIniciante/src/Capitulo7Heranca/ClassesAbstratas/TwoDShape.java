/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.ClassesAbstratas;

import Capitulo7Heranca.SobrePosicaoDeMetodoTwoDShape.*;
import Capitulo7Heranca.HierarquiasVariosNiveis.*;

/**
 *
 * @author eric
 */
public  abstract class TwoDShape {//agora TwoDShape é abstrata

    private double width, height;
    private String name;

    //contrutor padrão
    TwoDShape() {
        width = height = 0;
        name = "Nenhum";
    }

    //contrutor parametrizado
    TwoDShape(double w, double h, String n) {
        this.width = w;
        this.height = h;
        this.name = n;
    }

    //Contrutor de objeto altura e largura iguais
    TwoDShape(double x, String n) {
        width = height = x;
        this.name = n;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    void showDim() {
        System.out.println("Altura e largura são " + width + " e " + height);
    }

    //agora area é abstrato
    abstract double area(); //transforma area um metodo abstrato

    //metodos acessadores
    double getWidth() {
        return this.width;
    }

    double getHeigth() {
        return this.height;
    }

    void setWidth(double w) {
        this.width = w;
    }

    void setHeigth(double h) {
        this.height = h;
    }

    String getName() {
        return this.name;
    }

}
