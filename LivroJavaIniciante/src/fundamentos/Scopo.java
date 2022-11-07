/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class Scopo {

    public static void main(String[] args) {
        int n, d, q;
        n = 10;        d = 2;
        
            if (d != 0 && (n % d) == 0) 
           System.out.println(d + " é um fator de " + n);
        
        d = 0;
        
       if(d != 0 && (n % d) == 0)
            System.out.println(d + " é um fator de " + n);
       
       
       /* tente a mesma coisa sem o operador de curto-circuito.
       isso causara um erro de divisao por 0 */
       
       if(d != 0 & (n % d) == 0)
            System.out.println(d + " é um fator de " + n);
       
    }
}
