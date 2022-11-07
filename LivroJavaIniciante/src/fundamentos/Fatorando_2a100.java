/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class Fatorando_2a100 {
    public static void main(String[] args) {
    Fatorando_2a100 fat = new Fatorando_2a100();
        
        for(int i=2; i<=100; i++){
            System.out.print("Fatoração de: "+ i + ": ");
            
            for(int j=2; j<i; j++)
                if((i%j) == 0)
            System.out.print(j + " ");
            System.out.println();
                    
        }
        
    }
}
