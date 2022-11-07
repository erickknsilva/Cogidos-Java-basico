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
public class IsFatorado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Fatorar  x = new Fatorar();
        
        
        if(x.fattorar(2, 20)) System.out.println("2 é fatorado.");
        if(x.fattorar(3, 20)) System.out.println("Isso não será exibido.");
    }
}
