/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class TipoBoolean {

    public static void main(String[] args) {
        boolean b;
        
        b = false;
        
        System.out.println("b é " + b);
        b = true;
        System.out.println("b é " + b);
        
        //um valor booleano pode controlar a instrução if
        if(b)System.out.println("isso vai ser executado.");
        
        b = false;
        
        if(b)System.out.println("Isso nao vai ser executado.");
        
        System.out.println("10 > 9 é " + (10 < 9)); //Resultado relacional é um valor booleano
    }

}
