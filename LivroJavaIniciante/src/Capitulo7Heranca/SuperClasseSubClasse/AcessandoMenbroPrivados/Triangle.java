/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseSubClasse.AcessandoMenbroPrivados;

/**
 *
 * @author eric
 */
public class Triangle extends TwoDShape {

    private String style;

    Triangle() {
    }

    Triangle(String s, double w, double h) {
        setWitdh(w);
        setHeigth(h);

        style = s;
    }

    double area() {
        return getWidth() * getHeigth() / 2;
    }

    void showStyle() {
        System.out.println("O estilo do Triangulo: " + style);
    }
}
