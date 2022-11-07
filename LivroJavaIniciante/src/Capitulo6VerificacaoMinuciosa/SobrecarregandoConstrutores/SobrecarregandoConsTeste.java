/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.SobrecarregandoConstrutores;

/**
 *
 * @author eric
 */
public class SobrecarregandoConsTeste {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2, 4);
        
        System.out.println();
        System.out.println("t1.x "+ t1.x);
        System.out.println("t2.x "+ t2.x);
        System.out.println("t3.x "+ t3.x);
        System.out.println("t4.x "+ t4.x);
    }
}
