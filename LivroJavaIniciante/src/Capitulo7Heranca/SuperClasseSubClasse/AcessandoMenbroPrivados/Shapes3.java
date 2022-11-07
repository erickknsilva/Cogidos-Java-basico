/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseSubClasse.AcessandoMenbroPrivados;

/**
 *
 * @author eric
 */
public class Shapes3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Filled", 4, 4);
        Triangle t2 = new Triangle("Outlined", 8, 12);

        System.out.println("Informação do t1");
        t1.showStyle();
        t1.showDim();
        System.out.println("A área é: " + t1.area());

        System.out.println("\nInformação do t2");
        t2.showStyle();
        t2.showDim();
        System.out.println("A área é: " + t2.area());
    }
    
}
