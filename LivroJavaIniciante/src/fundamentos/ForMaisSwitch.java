/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class ForMaisSwitch {

    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 10; i++) 
            switch (i) {
                case 0:
                    System.out.println("I é zero");
                    break;
                case 1:
                    System.out.println("I é um");
                    break;
                case 2:
                    System.out.println("I é dois");
                    break;
                case 3:
                    System.out.println("I é três");
                    break;
                case 4:
                    System.out.println("I é quatro");
                    break;
                default:
                    System.out.println("I é 5 ou mais.");
            }
        
    }
}
