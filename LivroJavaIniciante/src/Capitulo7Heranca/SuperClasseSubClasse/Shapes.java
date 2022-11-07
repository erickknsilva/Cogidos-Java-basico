/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseSubClasse;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Shapes {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(); //cria um objeto da classe triangulo
        Triangle t2 = new Triangle(); //cria um objeto da classe triangulo

        t1.width = 4; //inserindo o valor da altura
        t1.heigth = 4; //inserindo o valor da largura
        t1.style = "Filled";

        t2.width = 8; //inserindo o valor da altura
        t2.heigth = 12; //inserindo o valor da largura
        t2.style = "Outlined";

        System.out.println("Informação do T1: ");
        t1.showStyle(); //imprimi o tipo do triangulo
        t1.showDim(); //imprimi os valores de width e heigth
        System.out.println("A área: " + t1.area()); //retorna o valor da area

        System.out.println();

        System.out.println("Informação do T2: ");
        t2.showStyle(); //imprimi o tipo do triangulo
        t2.showDim(); //imprimi os valores de width e heigth
        System.out.println("A área: " + t2.area()); //retorna o valor da area

        System.out.println();
        //superclasse de Triangle mais tem autonomia

        TwoDShape t3 = new TwoDShape();

        t3.width = 8;
        t3.heigth = 5;
        t3.showDim();

    }

}
