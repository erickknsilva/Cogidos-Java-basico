/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class Fatorial {

    public static void main(String[] args) {
        int sum = 0;
        int fat = 1;

        for (int i = 1; i <= 6; i++) {
            sum = sum + 1;
            fat = fat * i;
        
        }
        System.out.println("A soma é "+ sum);
        System.out.println("Fatorial é "+ fat);
                
    }
}
