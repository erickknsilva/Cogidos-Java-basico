/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseEObjetoSubclasse.ConstrutoresObjetosComoParametros;

/**
 *
 * @author eric
 */
public class Shapes7 {

    public static void main(String[] args) {

        Triangle t1 = new Triangle("Outlined", 8, 12);
        Triangle t2 = new Triangle(t1);
        
        System.out.println("Info for t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Área: " + t1.area());
        
        System.out.println("\nInfo for t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Área: " + t2.area());

    }
}
