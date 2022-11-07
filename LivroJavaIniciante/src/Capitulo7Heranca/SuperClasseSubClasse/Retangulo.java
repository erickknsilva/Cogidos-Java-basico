/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseSubClasse;

/**
 *
 * @author eric
 */
public class Retangulo extends TwoDShape {

    boolean ehQuadradad() {
        if (width == heigth) {
            return true;
        }
        return false;
    }

    double area() {
        return width * heigth;
    }
    
    
}
