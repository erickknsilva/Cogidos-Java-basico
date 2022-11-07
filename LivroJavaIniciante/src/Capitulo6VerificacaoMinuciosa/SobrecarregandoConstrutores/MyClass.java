/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.SobrecarregandoConstrutores;

/**
 *
 * @author eric
 */
public class MyClass {

    int x;

    MyClass() {
        System.out.println("Inside Myclass().");
        this.x = 0;
    }

    MyClass(int i) {
        System.out.println("Inside MyClass(int)");
        this.x = i;
    }

    MyClass(double i) {
        System.out.println("inside MyClass(double).");
        this.x = (int) i;
    }

    MyClass(int i, int d) {
        System.out.println("Inside MyClass(int, int)");
        this.x = i * d;
    }
}
