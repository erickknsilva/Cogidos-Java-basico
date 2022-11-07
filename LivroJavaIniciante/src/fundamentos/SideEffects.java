/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class SideEffects {

    public static void main(String[] args) {

        int i = 0;

        /* aqui incrementa if mesmo que a instrução seja falsa */
        if (false & (i++ < 100)) 
        System.out.println("Isso não sera exibido.");
        System.out.println("if a instrução foi executada: " + i);
        

        /*nese casso, i nao é incrementada porque o 
        operador de curto-circuito ignora o incremento.*/
        if (false && (i++ <= 100)) 
        System.out.println("Isso não sera exibido.");
        System.out.println("if a instrução foi executada: " + i);
    }
}
