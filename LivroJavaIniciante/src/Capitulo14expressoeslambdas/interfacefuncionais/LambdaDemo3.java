/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo14expressoeslambdas.interfacefuncionais;

/**
 *
 * @author eric
 */
public class LambdaDemo3 {

    public static void main(String[] args) {
        
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        
        String str = "This is a test";
        System.out.println("Testing string: " + str);
        
        if(isIn.test(str, "is a")){
            System.out.println("'is a' esta dentro.");
        }
        else{
            System.out.println("'is a' nao esta dentro");
        }
        
        if(isIn.test(str, "xyz")){
            System.out.println("'xyz' esta dentro");
        }else{
            System.out.println("'xyz' esta fora");
        }
        
    }
}
