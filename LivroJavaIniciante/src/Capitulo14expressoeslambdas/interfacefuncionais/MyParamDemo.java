/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo14expressoeslambdas.interfacefuncionais;

/**
 *
 * @author eric
 */
public class MyParamDemo {

    public static void main(String[] args) {
        
        MyParamValue myParam = (n) -> 1.0 / n;
        
        System.out.println("O reciproco de 4 eh " + myParam.getDouble(4.0));
        
    }
}
