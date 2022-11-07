/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.ClassesAninhadasEInternas;

/**
 *
 * @author eric
 */
public class TeseDemo {

    public static void main(String[] args) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};
        
        Outer outOb = new Outer(x);
        
        outOb.analyze();
    }
}
