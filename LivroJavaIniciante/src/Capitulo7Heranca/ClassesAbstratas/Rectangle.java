/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.ClassesAbstratas;

import Capitulo7Heranca.SobrePosicaoDeMetodoTwoDShape.*;

/**
 *
 * @author eric
 */
public class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "Rectangle");
    }

    Rectangle(double x) {
        super(x, "Rectangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getWidth() == getHeigth()) {
            return true;
        } else {
            return false;
        }
    }
    
    double area(){
        return getWidth() * getHeigth();
    }
    
}
