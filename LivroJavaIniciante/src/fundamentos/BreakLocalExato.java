/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class BreakLocalExato {
    public static void main(String[] args) {
        
        int x =0, y =0;
        
        stop1: for(x =0; x <5; x++){
            for(y =0; y <5; y++){     
            if(y==2) break stop1;
            System.out.println("X e Y: " + x + " " + y);
            }
        }
        System.out.println("");
        for(x=0; x <5; x++){
            
        stop2:{
            for(y =0; y <5; y++){
                if (y == 2) break stop2;
                System.out.println("X e Y: " + x + " " + y);
            
            }
        }
        }
    }
}
