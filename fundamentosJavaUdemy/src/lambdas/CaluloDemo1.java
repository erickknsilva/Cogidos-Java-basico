/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author eric
 */
public class CaluloDemo1 {

    public static void main(String[] args) {

        Calculo calculo = new Somar();

        System.out.println(calculo.executar(5, 5));

        calculo = new Multiplicar();

        System.out.println(calculo.executar(5, 5));
        
        
        
        
    }
}
