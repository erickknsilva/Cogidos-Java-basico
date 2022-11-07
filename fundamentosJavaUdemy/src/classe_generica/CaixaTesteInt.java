/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_generica;

/**
 *
 * @author eric
 */
public class CaixaTesteInt {

    public static void main(String[] args) {

        CaixaInt num = new CaixaInt();

        num.guardar(123);

        Integer number = num.abrir();
        System.out.println(number);

    }
}
