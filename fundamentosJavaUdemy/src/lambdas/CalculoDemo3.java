/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.BinaryOperator;

/**
 *
 * @author eric
 */
public class CalculoDemo3 {

    public static void main(String[] args) {

        //usando uma interface java
        BinaryOperator<Double> obj = (a, b) -> {
            return a + b;
        };
        
        System.out.println(obj.apply(10.0, 5.0));

    }
}
