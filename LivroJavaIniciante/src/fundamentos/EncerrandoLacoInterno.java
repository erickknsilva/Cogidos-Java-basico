/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class EncerrandoLacoInterno {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 3; i++){
                          
        	System.out.println("Contagem do laço externo " + i);
            System.out.print("Contagem do laço interno: ");
                           
            int t = 0;
            while(t < 100){
                if(t == 10) break;
            System.out.print(t + " ");
            t++;
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.print("Loop completo.\n");
    }
}
