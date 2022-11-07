/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.UsandoSuperParaChamaConstrutores;

/**
 *
 * @author eric
 */
public class TwoDShape {

    private double width;
    private double heigth;

    TwoDShape() {
        width = heigth = 0;
    }
    

    //construtor parametrizado
    TwoDShape(double w, double h) {
        this.width = w;
        this.heigth = h;
    }

    TwoDShape(double a, double b, double c, String... nome) {

    }
    
    double getWidth() {
        return this.width;
    }
            
    double getHeigth (){
        return this.heigth;
    }

    void setWidth(double w) {
        this.width = w;
    }
         
    void setHeigth(double h) {
        this.heigth = h;
    }

    void showDim() {
        System.out.println("Altura e largura são " + width + " and " + heigth);
    }
}
