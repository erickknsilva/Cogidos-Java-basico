/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo14expressoeslambdas.lambdadebloco;

/**
 *
 * @author eric
 */
public class BlockLambdaDemo {

    public static void main(String[] args) {

        NumericFunc smallTest = (n) -> {
            int result = 1;

            n = n < 0 ? -n : n;

            for (int i = 2; i < n / 1; i++)//
            {
                if ((n % 2) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };

        
        System.out.println("Smallest fator de 12 is " + smallTest.func(12));
        System.out.println("Smallesyt fator de 12 is " + smallTest.func(11));

    }

}
