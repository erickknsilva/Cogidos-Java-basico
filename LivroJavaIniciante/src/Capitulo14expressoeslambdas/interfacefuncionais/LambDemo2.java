/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo14expressoeslambdas.interfacefuncionais;

/**
 *
 * @author eric
 */
public class LambDemo2 {

    public static void main(String[] args) {

        //verica se um numero é fator de outro
        NumericTest isFactor = (a, b) -> (a % b) == 0;

        //verifica se o 1 numero é maior que o segundo
        NumericTest lessThan = (a, b) -> a < b;

        //verifica se os valores absoluto é iguais
        NumericTest absEquals = (a, b) -> (a < 0 ? -a : a) == (b < 0 ? -b : b);
        
        
        if(isFactor.test(10 , 2))
            System.out.println("Fatorial!");
        else System.out.println("Não fatorial!");
        
        if(isFactor.test(10, 3))
            System.out.println("Fatorial!");
        else System.out.println("Não fatorial!");
        
        System.out.println();
        
        if(lessThan.test(2, 10))
            System.out.println("2 é menor que o 10");
        else System.out.println("numero 10 é maior que 2");
        
        if(lessThan.test(10, 2))
            System.out.println("10 é maior que 2");
        else System.out.println("numero 2 é menor que 10");
        
        
        System.out.println();
        
        if(absEquals.test(4, -4))
            System.out.println("Os valores é iguais");
        else System.out.println("Os valores são diferente");
        
        if(absEquals.test(4, -5))
            System.out.println("Os valores sao iguais");
        else  System.out.println("Os valores sao diferentes");
    }
}
