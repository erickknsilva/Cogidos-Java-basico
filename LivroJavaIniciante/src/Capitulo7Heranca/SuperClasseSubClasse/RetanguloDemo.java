/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseSubClasse;

/**
 *
 * @author eric
 */
public class RetanguloDemo {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();

        r1.width = 4;
        r1.heigth = 6;

        r1.showDim();
        System.out.println("O retangulo é quadrado: " + r1.ehQuadradad());
        System.out.println("Á area do tringulo: " + r1.area());

    }
}
