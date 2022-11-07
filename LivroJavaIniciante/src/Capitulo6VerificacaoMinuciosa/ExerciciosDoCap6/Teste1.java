/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.ExerciciosDoCap6;

/**
 *
 * @author eric
 */
public class Teste1 {

    public static void main(String[] args) {
        Test l = new Test();
        Test t = new Test(21);
        Test c = new Test(42);
        
        Test d = new Test(4);
        Test e = new Test(5);
        
        
        t.swap(t, c);
        System.out.println();
        c.swap(d, e);
        
        int total = l.somaArgs(10,9,8,7,6,5,4,3,2,1);
        System.out.println("Soma dos argumentos = " + total);
    }
}
