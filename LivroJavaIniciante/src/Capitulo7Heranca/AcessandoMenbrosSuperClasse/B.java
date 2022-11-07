/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.AcessandoMenbrosSuperClasse;

import java.util.Arrays;

/**
 *
 * @author eric
 */
public class B extends A {

    private int resultado;
    private int i;

    B(int a, int b) {
        super.i = a;
        this.i = b;
    }

    String soma(B b) {
        resultado = super.i + this.i;

        return "A soma dos I = " + resultado;
    }

    void showDim() {
        System.out.println("\nI de a: " + super.i);
        System.out.println("I de b: " + this.i);
    }

    int getIdeA() {
        return super.i;
    }

    int getIdeB() {
        return this.i;
    }

//    B(int a, int b) {
//        super.i = a; // i da classe A
//        this.i = b; //i da classe b
//    }
//
//    void showDim() {
//        System.out.println("I da super-classe " + super.i);
//        System.out.println("I da subClasse " + this.i);
//    }
//
//    void soma(B b) {
//        super.i = super.i;
//        this.i = b.i;
//        this.resultado = super.i + this.i;
//        System.out.println("A soma dos i = " + resultado);
//    }
//
//    int getSoma() {//retorna o valor da soma
//        return this.resultado;
//    }
}
