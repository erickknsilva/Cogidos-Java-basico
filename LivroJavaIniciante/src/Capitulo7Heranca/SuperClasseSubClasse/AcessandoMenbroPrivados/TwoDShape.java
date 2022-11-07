/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseSubClasse.AcessandoMenbroPrivados;

/**
 *
 * @author eric
 */
public class TwoDShape {

    private double width;//agora são privados
    private double heigth;//agora são privados

    double getWidth() {//metodos para acessar width 
        return width;
    }

    double getHeigth() { //metodos para acessar width 
        return heigth;
    }

    void setWitdh(double width) {
        this.width = width;
    }

    void setHeigth(double height) {
        this.heigth = height;
    }

    void showDim() {
        System.out.println("Width e heigth are: " + width + " and " + heigth);
    }
}
