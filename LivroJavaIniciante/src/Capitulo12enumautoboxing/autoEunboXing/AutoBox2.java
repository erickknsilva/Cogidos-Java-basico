/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo12enumautoboxing.autoEunboXing;

/**
 *
 * @author eric
 */
public class AutoBox2 {

    static void m(Integer m) { //recebe um Integer como parametro e retorna
        System.out.println("m() recebe " + m);
    }

    static int m2() { //retorna um tipo primitivo int
        return 10;
    }

    static Integer m3() { //faz um autobixing de 99 para Integer
        return 99;
    }

    public static void main(String[] args) {

        m(199);
        Integer iob = m2(); //autoboxing 
        System.out.println("O valor de retorno do m2 é " + iob);

        int i = m3(); //faz o autoUnboxing
        System.out.println("O valor de retorno do m2 é " + i);
        
        
        iob = 100;
        System.out.println("A raiz quadrada de iob é " + Math.sqrt(iob)); 

    }
}
