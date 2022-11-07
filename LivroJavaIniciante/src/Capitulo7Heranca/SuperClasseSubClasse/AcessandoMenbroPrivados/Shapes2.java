/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseSubClasse.AcessandoMenbroPrivados;

/**
 *
 * @author eric
 */
public class Shapes2 {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        //removi a variavel que da nome ao triangulo, porque deixei a variavel privada
        t1.setWitdh(4);
        t1.setHeigth(4);

        t2.setWitdh(8);
        t2.setHeigth(12);

        System.out.println("Informação do t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("A área é: " + t1.area());

        System.out.println("\nInformação do t2: ");
        t2.showStyle();;
        t2.showDim();
        System.out.println("A área é: " + t2.area());
    }
}
