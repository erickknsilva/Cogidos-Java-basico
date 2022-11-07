/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SobrePosicaoDeMetodoTwoDShape;

/**
 *
 * @author eric
 */
public class DynShapes {

    public static void main(String[] args) {

        TwoDShape[] shapes = new TwoDShape[5];

        shapes[0] = new Triangle("Outlined", 8, 12);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7);
        shapes[4] = new TwoDShape(10, 20, "generic");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is: " + shapes[i].getName());
            System.out.println("Area is: " + shapes[i].area());
            System.out.println();
        }

    }
}
