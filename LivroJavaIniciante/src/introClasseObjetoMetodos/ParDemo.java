/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introClasseObjetoMetodos;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class ParDemo {

    public static void main(String[] args) {

        ChkNumPar e = new ChkNumPar();
        
        if(e.isEven(10))System.out.println("10 é par.");
        if(e.isEven(9)) System.out.println("9 é par.");
        if(e.isEven(8)) System.out.println("8 é par.");
        
                
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int num = entrada.nextInt();

        int i;

        for (i = num; i <= num; i++) {
            if (e.isEven(i)) {
                System.out.println(i + " é par.");
            }else{
                System.out.println(num + " Impar.");
            }
        }*/

    }
}
