/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class NumPrimo {
    public static void main(String[] args) {
        
        int i, j;
        boolean primo;
        
        for(i = 2; i <= 100; i++){
         primo = true;
         
        for(j = 2; j <= i / j; j++)
        //se tiver nao é primo
        if(((i%j)) == 0) primo = false;
            if(primo)
                System.out.println(i + " é primo.");
        }
    
    }
}
