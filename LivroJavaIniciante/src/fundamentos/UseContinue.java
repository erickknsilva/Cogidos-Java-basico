/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class UseContinue {
    public static void main(String[] args) {
        
        for(int i = 2; i <=100; i++){
            if((i%2) != 0) continue;  //força a calcular os numeros pares entre 2 e 100
            System.out.println(i);
        }
        
    }
}
