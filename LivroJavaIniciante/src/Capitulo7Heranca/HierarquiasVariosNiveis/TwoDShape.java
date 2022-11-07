/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.HierarquiasVariosNiveis;

/**
 *
 * @author eric
 */
public class TwoDShape {

    private double width, height;

    //contrutor padrão
    TwoDShape() {
        width = height = 0;
    }

    //contrutor parametrizado
    TwoDShape(double w, double h) {
        this.width = w;
        this.height = h;
    }

    //Contrutor de objeto altura e largura iguais
    TwoDShape(double x) {
        width = height = x;
    }

    void showDim() {
        System.out.println("Altura e largura são " + width + " e " + height);
    }

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

}
